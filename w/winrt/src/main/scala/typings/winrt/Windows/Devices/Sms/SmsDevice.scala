package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmsDevice
  extends StObject
     with ISmsDevice
object SmsDevice {
  
  inline def apply(
    accountPhoneNumber: String,
    calculateLength: SmsTextMessage => SmsEncodedLength,
    cellularClass: CellularClass,
    deviceStatus: SmsDeviceStatus,
    messageStore: SmsDeviceMessageStore,
    onsmsdevicestatuschanged: js.Any,
    onsmsmessagereceived: js.Any,
    sendMessageAsync: ISmsMessage => SendSmsMessageOperation
  ): SmsDevice = {
    val __obj = js.Dynamic.literal(accountPhoneNumber = accountPhoneNumber.asInstanceOf[js.Any], calculateLength = js.Any.fromFunction1(calculateLength), cellularClass = cellularClass.asInstanceOf[js.Any], deviceStatus = deviceStatus.asInstanceOf[js.Any], messageStore = messageStore.asInstanceOf[js.Any], onsmsdevicestatuschanged = onsmsdevicestatuschanged.asInstanceOf[js.Any], onsmsmessagereceived = onsmsmessagereceived.asInstanceOf[js.Any], sendMessageAsync = js.Any.fromFunction1(sendMessageAsync))
    __obj.asInstanceOf[SmsDevice]
  }
}
