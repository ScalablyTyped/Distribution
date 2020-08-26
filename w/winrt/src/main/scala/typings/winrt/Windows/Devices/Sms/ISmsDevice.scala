package typings.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISmsDevice extends js.Object {
  var accountPhoneNumber: String = js.native
  var cellularClass: CellularClass = js.native
  var deviceStatus: SmsDeviceStatus = js.native
  var messageStore: SmsDeviceMessageStore = js.native
  var onsmsdevicestatuschanged: js.Any = js.native
  var onsmsmessagereceived: js.Any = js.native
  def calculateLength(message: SmsTextMessage): SmsEncodedLength = js.native
  def sendMessageAsync(message: ISmsMessage): SendSmsMessageOperation = js.native
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
  @scala.inline
  implicit class ISmsDeviceOps[Self <: ISmsDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountPhoneNumber(value: String): Self = this.set("accountPhoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setCalculateLength(value: SmsTextMessage => SmsEncodedLength): Self = this.set("calculateLength", js.Any.fromFunction1(value))
    @scala.inline
    def setCellularClass(value: CellularClass): Self = this.set("cellularClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceStatus(value: SmsDeviceStatus): Self = this.set("deviceStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageStore(value: SmsDeviceMessageStore): Self = this.set("messageStore", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnsmsdevicestatuschanged(value: js.Any): Self = this.set("onsmsdevicestatuschanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnsmsmessagereceived(value: js.Any): Self = this.set("onsmsmessagereceived", value.asInstanceOf[js.Any])
    @scala.inline
    def setSendMessageAsync(value: ISmsMessage => SendSmsMessageOperation): Self = this.set("sendMessageAsync", js.Any.fromFunction1(value))
  }
  
}

