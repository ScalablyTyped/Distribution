package typings.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SmsMessageReceivedEventArgs")
@js.native
class SmsMessageReceivedEventArgs () extends ISmsMessageReceivedEventArgs {
  /* CompleteClass */
  override var binaryMessage: SmsBinaryMessage = js.native
  /* CompleteClass */
  override var textMessage: SmsTextMessage = js.native
}

