package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISmsMessageReceivedEventArgs extends StObject {
  
  var binaryMessage: SmsBinaryMessage
  
  var textMessage: SmsTextMessage
}
object ISmsMessageReceivedEventArgs {
  
  inline def apply(binaryMessage: SmsBinaryMessage, textMessage: SmsTextMessage): ISmsMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(binaryMessage = binaryMessage.asInstanceOf[js.Any], textMessage = textMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISmsMessageReceivedEventArgs]
  }
  
  extension [Self <: ISmsMessageReceivedEventArgs](x: Self) {
    
    inline def setBinaryMessage(value: SmsBinaryMessage): Self = StObject.set(x, "binaryMessage", value.asInstanceOf[js.Any])
    
    inline def setTextMessage(value: SmsTextMessage): Self = StObject.set(x, "textMessage", value.asInstanceOf[js.Any])
  }
}
