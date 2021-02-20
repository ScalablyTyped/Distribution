package typings.winrt.Windows.Devices.Sms

import typings.std.Date
import typings.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISmsTextMessage extends ISmsMessage {
  
  var body: String = js.native
  
  var encoding: SmsEncoding = js.native
  
  var from: String = js.native
  
  var partCount: Double = js.native
  
  var partNumber: Double = js.native
  
  var partReferenceId: Double = js.native
  
  var timestamp: Date = js.native
  
  var to: String = js.native
  
  def toBinaryMessages(format: SmsDataFormat): IVectorView[ISmsBinaryMessage] = js.native
}
object ISmsTextMessage {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ISmsTextMessageMutableBuilder[Self <: ISmsTextMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: SmsEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartCount(value: Double): Self = StObject.set(x, "partCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartNumber(value: Double): Self = StObject.set(x, "partNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartReferenceId(value: Double): Self = StObject.set(x, "partReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToBinaryMessages(value: SmsDataFormat => IVectorView[ISmsBinaryMessage]): Self = StObject.set(x, "toBinaryMessages", js.Any.fromFunction1(value))
  }
}
