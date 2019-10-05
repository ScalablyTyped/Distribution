package typings.winrt.Windows.Devices.Sms

import typings.std.Date
import typings.std.Uint8Array
import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SmsTextMessage")
@js.native
class SmsTextMessage () extends ISmsTextMessage {
  /* CompleteClass */
  override var body: String = js.native
  /* CompleteClass */
  override var encoding: SmsEncoding = js.native
  /* CompleteClass */
  override var from: String = js.native
  /* CompleteClass */
  override var id: Double = js.native
  /* CompleteClass */
  override var messageClass: SmsMessageClass = js.native
  /* CompleteClass */
  override var partCount: Double = js.native
  /* CompleteClass */
  override var partNumber: Double = js.native
  /* CompleteClass */
  override var partReferenceId: Double = js.native
  /* CompleteClass */
  override var timestamp: Date = js.native
  /* CompleteClass */
  override var to: String = js.native
  /* CompleteClass */
  override def toBinaryMessages(format: SmsDataFormat): IVectorView[ISmsBinaryMessage] = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sms.SmsTextMessage")
@js.native
object SmsTextMessage extends js.Object {
  def fromBinaryData(format: SmsDataFormat, value: Uint8Array): SmsTextMessage = js.native
  def fromBinaryMessage(binaryMessage: SmsBinaryMessage): SmsTextMessage = js.native
}

