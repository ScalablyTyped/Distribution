package typings.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsMessageReceivedEventArgs extends js.Object {
  var binaryMessage: SmsBinaryMessage
  var textMessage: SmsTextMessage
}

object ISmsMessageReceivedEventArgs {
  @scala.inline
  def apply(binaryMessage: SmsBinaryMessage, textMessage: SmsTextMessage): ISmsMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(binaryMessage = binaryMessage.asInstanceOf[js.Any], textMessage = textMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISmsMessageReceivedEventArgs]
  }
}

