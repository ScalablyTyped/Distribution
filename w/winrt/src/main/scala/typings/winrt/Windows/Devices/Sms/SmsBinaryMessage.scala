package typings.winrt.Windows.Devices.Sms

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SmsBinaryMessage")
@js.native
class SmsBinaryMessage () extends ISmsBinaryMessage {
  /* CompleteClass */
  override var format: SmsDataFormat = js.native
  /* CompleteClass */
  override var id: Double = js.native
  /* CompleteClass */
  override var messageClass: SmsMessageClass = js.native
  /* CompleteClass */
  override def getData(): Uint8Array = js.native
  /* CompleteClass */
  override def setData(value: Uint8Array): Unit = js.native
}

