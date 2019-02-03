package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SmsDevice")
@js.native
class SmsDevice () extends ISmsDevice {
  /* CompleteClass */
  override var accountPhoneNumber: java.lang.String = js.native
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
  def fromIdAsync(deviceInstanceId: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.DevicesNs.SmsNs.SmsDevice] = js.native
  def getDefaultAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.DevicesNs.SmsNs.SmsDevice] = js.native
  def getDeviceSelector(): java.lang.String = js.native
}

