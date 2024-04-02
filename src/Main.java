import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class Main {
    public static void main(String[] args) throws Exception {
        
       String filePathForMac ="/Users/sunyuchen/Downloads/Groceries.txt" ;
       String fileToWrite    ="/Users/sunyuchen/Downloads/AAA.txt" ;

       
       String [] array = new String [4];
       String id;
       String itemName;
       String quantity;
       double price;
       String separator =",";
       double total=0;
      
       FileReader fileReader = new FileReader(filePathForMac);
       FileWriter fileWriter = new FileWriter(fileToWrite);
       
       BufferedReader reader = new BufferedReader(fileReader);
       BufferedWriter writer = new BufferedWriter(fileWriter);

       String line;
       
       while((line = reader.readLine())!=null){
        
        array = line.split(separator);
        
        price = Double.parseDouble(array[3]);
        
        total += price;
        
        System.out.println(line);
        writer.write(line);
        writer.newLine();
    
    }
        
    System.out.println("\n" + "Total price of groceries:" + Math.round(total));
   
    reader.close();

    writer.flush();
    writer.close();



}
}
