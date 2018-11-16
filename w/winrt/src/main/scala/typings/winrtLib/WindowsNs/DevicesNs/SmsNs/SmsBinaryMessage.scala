package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SmsBinaryMessage")
@js.native
class SmsBinaryMessage () extends ISmsBinaryMessage {
  /* CompleteClass */
  override var format: SmsDataFormat = js.native
  /* CompleteClass */
  override var id: scala.Double = js.native
  /* CompleteClass */
  override var messageClass: SmsMessageClass = js.native
  /* CompleteClass */
  override def getData(): stdLib.Uint8Array = js.native
  /* CompleteClass */
  override def setData(value: stdLib.Uint8Array): scala.Unit = js.native
}

