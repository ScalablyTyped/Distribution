package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISmsMessageReceivedEventArgs extends StObject {
  
  var binaryMessage: SmsBinaryMessage = js.native
  
  var textMessage: SmsTextMessage = js.native
}
object ISmsMessageReceivedEventArgs {
  
  @scala.inline
  def apply(binaryMessage: SmsBinaryMessage, textMessage: SmsTextMessage): ISmsMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(binaryMessage = binaryMessage.asInstanceOf[js.Any], textMessage = textMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISmsMessageReceivedEventArgs]
  }
  
  @scala.inline
  implicit class ISmsMessageReceivedEventArgsMutableBuilder[Self <: ISmsMessageReceivedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinaryMessage(value: SmsBinaryMessage): Self = StObject.set(x, "binaryMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextMessage(value: SmsTextMessage): Self = StObject.set(x, "textMessage", value.asInstanceOf[js.Any])
  }
}
