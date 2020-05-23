package typings.winrt.global.Windows.Devices.Sms

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SmsBinaryMessage")
@js.native
class SmsBinaryMessage ()
  extends typings.winrt.Windows.Devices.Sms.SmsBinaryMessage {
  /* CompleteClass */
  override var format: typings.winrt.Windows.Devices.Sms.SmsDataFormat = js.native
  /* CompleteClass */
  override var id: Double = js.native
  /* CompleteClass */
  override var messageClass: typings.winrt.Windows.Devices.Sms.SmsMessageClass = js.native
  /* CompleteClass */
  override def getData(): Uint8Array = js.native
  /* CompleteClass */
  override def setData(value: Uint8Array): Unit = js.native
}

