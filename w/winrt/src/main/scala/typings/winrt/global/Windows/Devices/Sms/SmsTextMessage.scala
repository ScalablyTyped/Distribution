package typings.winrt.global.Windows.Devices.Sms

import typings.std.Date
import typings.std.Uint8Array
import typings.winrt.Windows.Devices.Sms.ISmsBinaryMessage
import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SmsTextMessage")
@js.native
class SmsTextMessage ()
  extends typings.winrt.Windows.Devices.Sms.SmsTextMessage {
  /* CompleteClass */
  override var body: String = js.native
  /* CompleteClass */
  override var encoding: typings.winrt.Windows.Devices.Sms.SmsEncoding = js.native
  /* CompleteClass */
  override var from: String = js.native
  /* CompleteClass */
  override var id: Double = js.native
  /* CompleteClass */
  override var messageClass: typings.winrt.Windows.Devices.Sms.SmsMessageClass = js.native
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
  override def toBinaryMessages(format: typings.winrt.Windows.Devices.Sms.SmsDataFormat): IVectorView[ISmsBinaryMessage] = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sms.SmsTextMessage")
@js.native
object SmsTextMessage extends js.Object {
  def fromBinaryData(format: typings.winrt.Windows.Devices.Sms.SmsDataFormat, value: Uint8Array): typings.winrt.Windows.Devices.Sms.SmsTextMessage = js.native
  def fromBinaryMessage(binaryMessage: typings.winrt.Windows.Devices.Sms.SmsBinaryMessage): typings.winrt.Windows.Devices.Sms.SmsTextMessage = js.native
}

