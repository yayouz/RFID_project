package connection;

public class Message {
	String itemID,itemName,boughtDate,expireDate,getTime;
    Integer length;
    Integer times;
    Integer Maxtimes;
    public Message()
    {
       itemID="null";
       itemName="null";
       boughtDate="null";
       expireDate="null";
       getTime="null";
       length=0;
       times=0;
       Maxtimes=0;
    }
}