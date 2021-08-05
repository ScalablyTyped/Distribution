package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISmsDevice extends StObject {
  
  var accountPhoneNumber: String
  
  def calculateLength(message: SmsTextMessage): SmsEncodedLength
  
  var cellularClass: CellularClass
  
  var deviceStatus: SmsDeviceStatus
  
  var messageStore: SmsDeviceMessageStore
  
  var onsmsdevicestatuschanged: js.Any
  
  var onsmsmessagereceived: js.Any
  
  def sendMessageAsync(message: ISmsMessage): SendSmsMessageOperation
}
object ISmsDevice {
  
  inline def apply(
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
  
  extension [Self <: ISmsDevice](x: Self) {
    
    inline def setAccountPhoneNumber(value: String): Self = StObject.set(x, "accountPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setCalculateLength(value: SmsTextMessage => SmsEncodedLength): Self = StObject.set(x, "calculateLength", js.Any.fromFunction1(value))
    
    inline def setCellularClass(value: CellularClass): Self = StObject.set(x, "cellularClass", value.asInstanceOf[js.Any])
    
    inline def setDeviceStatus(value: SmsDeviceStatus): Self = StObject.set(x, "deviceStatus", value.asInstanceOf[js.Any])
    
    inline def setMessageStore(value: SmsDeviceMessageStore): Self = StObject.set(x, "messageStore", value.asInstanceOf[js.Any])
    
    inline def setOnsmsdevicestatuschanged(value: js.Any): Self = StObject.set(x, "onsmsdevicestatuschanged", value.asInstanceOf[js.Any])
    
    inline def setOnsmsmessagereceived(value: js.Any): Self = StObject.set(x, "onsmsmessagereceived", value.asInstanceOf[js.Any])
    
    inline def setSendMessageAsync(value: ISmsMessage => SendSmsMessageOperation): Self = StObject.set(x, "sendMessageAsync", js.Any.fromFunction1(value))
  }
}
