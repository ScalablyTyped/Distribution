package typings.winrtUwp.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface is implemented by all types of SMS messages that are supported. */
@js.native
trait ISmsMessage extends js.Object {
  
  /** Retrieves an ID for the message, which can later be specified in calling message store methods in order to get or delete the message. */
  var id: Double = js.native
  
  /** Returns the message class, as determined by the operator's message network. The two most common classes are None (normal message) or Class0 (special operator message, such as a roaming warning that must be shown immediately to the user). A typical client for end-user messages ignores Class0 messages. */
  var messageClass: SmsMessageClass = js.native
}
object ISmsMessage {
  
  @scala.inline
  def apply(id: Double, messageClass: SmsMessageClass): ISmsMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISmsMessage]
  }
  
  @scala.inline
  implicit class ISmsMessageOps[Self <: ISmsMessage] (val x: Self) extends AnyVal {
    
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageClass(value: SmsMessageClass): Self = this.set("messageClass", value.asInstanceOf[js.Any])
  }
}
