package typings.winrtUwp.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for ISmsBinaryMessage event handlers. */
@js.native
trait SmsMessageReceivedEventArgs extends js.Object {
  /** Retrieves an object that holds the binary representation of the message. This is of interest only to clients who want to pass binary messages on directly or do their own interpretation of the binary message contents. */
  var binaryMessage: SmsBinaryMessage = js.native
  /** Retrieves an object that holds the text representation of the message. If the message is not successfully decoded, an error is returned. */
  var textMessage: SmsTextMessage = js.native
}

object SmsMessageReceivedEventArgs {
  @scala.inline
  def apply(binaryMessage: SmsBinaryMessage, textMessage: SmsTextMessage): SmsMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(binaryMessage = binaryMessage.asInstanceOf[js.Any], textMessage = textMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsMessageReceivedEventArgs]
  }
  @scala.inline
  implicit class SmsMessageReceivedEventArgsOps[Self <: SmsMessageReceivedEventArgs] (val x: Self) extends AnyVal {
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

