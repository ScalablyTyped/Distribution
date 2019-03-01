package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsDevice extends js.Object {
  var accountPhoneNumber: java.lang.String
  var cellularClass: CellularClass
  var deviceStatus: SmsDeviceStatus
  var messageStore: SmsDeviceMessageStore
  var onsmsdevicestatuschanged: js.Any
  var onsmsmessagereceived: js.Any
  def calculateLength(message: SmsTextMessage): SmsEncodedLength
  def sendMessageAsync(message: ISmsMessage): SendSmsMessageOperation
}

object ISmsDevice {
  @scala.inline
  def apply(
    accountPhoneNumber: java.lang.String,
    calculateLength: js.Function1[SmsTextMessage, SmsEncodedLength],
    cellularClass: CellularClass,
    deviceStatus: SmsDeviceStatus,
    messageStore: SmsDeviceMessageStore,
    onsmsdevicestatuschanged: js.Any,
    onsmsmessagereceived: js.Any,
    sendMessageAsync: js.Function1[ISmsMessage, SendSmsMessageOperation]
  ): ISmsDevice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accountPhoneNumber")(accountPhoneNumber)
    __obj.updateDynamic("calculateLength")(calculateLength)
    __obj.updateDynamic("cellularClass")(cellularClass)
    __obj.updateDynamic("deviceStatus")(deviceStatus)
    __obj.updateDynamic("messageStore")(messageStore)
    __obj.updateDynamic("onsmsdevicestatuschanged")(onsmsdevicestatuschanged)
    __obj.updateDynamic("onsmsmessagereceived")(onsmsmessagereceived)
    __obj.updateDynamic("sendMessageAsync")(sendMessageAsync)
    __obj.asInstanceOf[ISmsDevice]
  }
}

