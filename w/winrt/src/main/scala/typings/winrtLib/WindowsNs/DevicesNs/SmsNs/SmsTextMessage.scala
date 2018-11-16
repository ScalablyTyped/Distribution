package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SmsTextMessage")
@js.native
class SmsTextMessage () extends ISmsTextMessage {
  /* CompleteClass */
  override var body: java.lang.String = js.native
  /* CompleteClass */
  override var encoding: SmsEncoding = js.native
  /* CompleteClass */
  override var from: java.lang.String = js.native
  /* CompleteClass */
  override var id: scala.Double = js.native
  /* CompleteClass */
  override var messageClass: SmsMessageClass = js.native
  /* CompleteClass */
  override var partCount: scala.Double = js.native
  /* CompleteClass */
  override var partNumber: scala.Double = js.native
  /* CompleteClass */
  override var partReferenceId: scala.Double = js.native
  /* CompleteClass */
  override var timestamp: stdLib.Date = js.native
  /* CompleteClass */
  override var to: java.lang.String = js.native
  /* CompleteClass */
  override def toBinaryMessages(format: SmsDataFormat): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ISmsBinaryMessage] = js.native
}

@JSGlobal("Windows.Devices.Sms.SmsTextMessage")
@js.native
object SmsTextMessage extends js.Object {
  def fromBinaryData(format: winrtLib.WindowsNs.DevicesNs.SmsNs.SmsDataFormat, value: stdLib.Uint8Array): winrtLib.WindowsNs.DevicesNs.SmsNs.SmsTextMessage = js.native
  def fromBinaryMessage(binaryMessage: winrtLib.WindowsNs.DevicesNs.SmsNs.SmsBinaryMessage): winrtLib.WindowsNs.DevicesNs.SmsNs.SmsTextMessage = js.native
}

