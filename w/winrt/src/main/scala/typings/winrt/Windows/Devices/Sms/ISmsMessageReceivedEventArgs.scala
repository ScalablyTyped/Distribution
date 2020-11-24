package typings.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISmsMessageReceivedEventArgs extends js.Object {
  
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
  implicit class ISmsMessageReceivedEventArgsOps[Self <: ISmsMessageReceivedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBinaryMessage(value: SmsBinaryMessage): Self = this.set("binaryMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextMessage(value: SmsTextMessage): Self = this.set("textMessage", value.asInstanceOf[js.Any])
  }
}
