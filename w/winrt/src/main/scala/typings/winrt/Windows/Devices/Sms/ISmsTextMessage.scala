package typings.winrt.Windows.Devices.Sms

import typings.std.Date
import typings.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISmsTextMessage
  extends StObject
     with ISmsMessage {
  
  var body: String
  
  var encoding: SmsEncoding
  
  var from: String
  
  var partCount: Double
  
  var partNumber: Double
  
  var partReferenceId: Double
  
  var timestamp: Date
  
  var to: String
  
  def toBinaryMessages(format: SmsDataFormat): IVectorView[ISmsBinaryMessage]
}
object ISmsTextMessage {
  
  inline def apply(
    body: String,
    encoding: SmsEncoding,
    from: String,
    id: Double,
    messageClass: SmsMessageClass,
    partCount: Double,
    partNumber: Double,
    partReferenceId: Double,
    timestamp: Date,
    to: String,
    toBinaryMessages: SmsDataFormat => IVectorView[ISmsBinaryMessage]
  ): ISmsTextMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], partCount = partCount.asInstanceOf[js.Any], partNumber = partNumber.asInstanceOf[js.Any], partReferenceId = partReferenceId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], toBinaryMessages = js.Any.fromFunction1(toBinaryMessages))
    __obj.asInstanceOf[ISmsTextMessage]
  }
  
  extension [Self <: ISmsTextMessage](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: SmsEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setPartCount(value: Double): Self = StObject.set(x, "partCount", value.asInstanceOf[js.Any])
    
    inline def setPartNumber(value: Double): Self = StObject.set(x, "partNumber", value.asInstanceOf[js.Any])
    
    inline def setPartReferenceId(value: Double): Self = StObject.set(x, "partReferenceId", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToBinaryMessages(value: SmsDataFormat => IVectorView[ISmsBinaryMessage]): Self = StObject.set(x, "toBinaryMessages", js.Any.fromFunction1(value))
  }
}
