package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISmsDevice extends StObject {
  
  var accountPhoneNumber: String = js.native
  
  def calculateLength(message: SmsTextMessage): SmsEncodedLength = js.native
  
  var cellularClass: CellularClass = js.native
  
  var deviceStatus: SmsDeviceStatus = js.native
  
  var messageStore: SmsDeviceMessageStore = js.native
  
  var onsmsdevicestatuschanged: js.Any = js.native
  
  var onsmsmessagereceived: js.Any = js.native
  
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
  implicit class ISmsDeviceMutableBuilder[Self <: ISmsDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountPhoneNumber(value: String): Self = StObject.set(x, "accountPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculateLength(value: SmsTextMessage => SmsEncodedLength): Self = StObject.set(x, "calculateLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCellularClass(value: CellularClass): Self = StObject.set(x, "cellularClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceStatus(value: SmsDeviceStatus): Self = StObject.set(x, "deviceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageStore(value: SmsDeviceMessageStore): Self = StObject.set(x, "messageStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsmsdevicestatuschanged(value: js.Any): Self = StObject.set(x, "onsmsdevicestatuschanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsmsmessagereceived(value: js.Any): Self = StObject.set(x, "onsmsmessagereceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendMessageAsync(value: ISmsMessage => SendSmsMessageOperation): Self = StObject.set(x, "sendMessageAsync", js.Any.fromFunction1(value))
  }
}
