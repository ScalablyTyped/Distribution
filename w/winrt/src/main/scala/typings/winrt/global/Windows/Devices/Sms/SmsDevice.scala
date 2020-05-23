package typings.winrt.global.Windows.Devices.Sms

import typings.winrt.Windows.Devices.Sms.ISmsMessage
import typings.winrt.Windows.Devices.Sms.SmsEncodedLength
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SmsDevice")
@js.native
class SmsDevice ()
  extends typings.winrt.Windows.Devices.Sms.SmsDevice {
  /* CompleteClass */
  override var accountPhoneNumber: String = js.native
  /* CompleteClass */
  override var cellularClass: typings.winrt.Windows.Devices.Sms.CellularClass = js.native
  /* CompleteClass */
  override var deviceStatus: typings.winrt.Windows.Devices.Sms.SmsDeviceStatus = js.native
  /* CompleteClass */
  override var messageStore: typings.winrt.Windows.Devices.Sms.SmsDeviceMessageStore = js.native
  /* CompleteClass */
  override var onsmsdevicestatuschanged: js.Any = js.native
  /* CompleteClass */
  override var onsmsmessagereceived: js.Any = js.native
  /* CompleteClass */
  override def calculateLength(message: typings.winrt.Windows.Devices.Sms.SmsTextMessage): SmsEncodedLength = js.native
  /* CompleteClass */
  override def sendMessageAsync(message: ISmsMessage): typings.winrt.Windows.Devices.Sms.SendSmsMessageOperation = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sms.SmsDevice")
@js.native
object SmsDevice extends js.Object {
  def fromIdAsync(deviceInstanceId: String): IAsyncOperation[typings.winrt.Windows.Devices.Sms.SmsDevice] = js.native
  def getDefaultAsync(): IAsyncOperation[typings.winrt.Windows.Devices.Sms.SmsDevice] = js.native
  def getDeviceSelector(): String = js.native
}

