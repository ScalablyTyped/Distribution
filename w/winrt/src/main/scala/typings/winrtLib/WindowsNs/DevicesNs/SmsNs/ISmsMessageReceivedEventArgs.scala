package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("binaryMessage")(binaryMessage)
    __obj.updateDynamic("textMessage")(textMessage)
    __obj.asInstanceOf[ISmsMessageReceivedEventArgs]
  }
}

