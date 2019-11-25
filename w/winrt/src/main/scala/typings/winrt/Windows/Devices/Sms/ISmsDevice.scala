package typings.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsDevice extends js.Object {
  var accountPhoneNumber: String
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
    accountPhoneNumber: String,
    calculateLength: SmsTextMessage => SmsEncodedLength,
    cellularClass: CellularClass,
    deviceStatus: SmsDeviceStatus,
    messageStore: SmsDeviceMessageStore,
    onsmsdevicestatuschanged: js.Any,
    onsmsmessagereceived: js.Any,
    sendMessageAsync: ISmsMessage => SendSmsMessageOperation
  ): ISmsDevice = {
    val __obj = js.Dynamic.literal(accountPhoneNumber = accountPhoneNumber.asInstanceOf[js.Any], calculateLength = js.Any.fromFunction1(calculateLength), cellularClass = cellularClass.asInstanceOf[js.Any], deviceStatus = deviceStatus.asInstanceOf[js.Any], messageStore = messageStore.asInstanceOf[js.Any], onsmsdevicestatuschanged = onsmsdevicestatuschanged.asInstanceOf[js.Any], onsmsmessagereceived = onsmsmessagereceived.asInstanceOf[js.Any], sendMessageAsync = js.Any.fromFunction1(sendMessageAsync))
  
    __obj.asInstanceOf[ISmsDevice]
  }
}

