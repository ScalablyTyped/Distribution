package typings.winrt.WindowsNs.DevicesNs.SmsNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SmsDevice")
@js.native
class SmsDevice () extends ISmsDevice {
  /* CompleteClass */
  override var accountPhoneNumber: String = js.native
  /* CompleteClass */
  override var cellularClass: CellularClass = js.native
  /* CompleteClass */
  override var deviceStatus: SmsDeviceStatus = js.native
  /* CompleteClass */
  override var messageStore: SmsDeviceMessageStore = js.native
  /* CompleteClass */
  override var onsmsdevicestatuschanged: js.Any = js.native
  /* CompleteClass */
  override var onsmsmessagereceived: js.Any = js.native
  /* CompleteClass */
  override def calculateLength(message: SmsTextMessage): SmsEncodedLength = js.native
  /* CompleteClass */
  override def sendMessageAsync(message: ISmsMessage): SendSmsMessageOperation = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sms.SmsDevice")
@js.native
object SmsDevice extends js.Object {
  def fromIdAsync(deviceInstanceId: String): IAsyncOperation[SmsDevice] = js.native
  def getDefaultAsync(): IAsyncOperation[SmsDevice] = js.native
  def getDeviceSelector(): String = js.native
}

