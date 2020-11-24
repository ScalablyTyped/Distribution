package typings.winrt.global.Windows.Devices.Sms

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Devices.Sms.SmsDevice")
@js.native
class SmsDevice ()
  extends typings.winrt.Windows.Devices.Sms.SmsDevice
/* static members */
@JSGlobal("Windows.Devices.Sms.SmsDevice")
@js.native
object SmsDevice extends js.Object {
  
  def fromIdAsync(deviceInstanceId: String): IAsyncOperation[typings.winrt.Windows.Devices.Sms.SmsDevice] = js.native
  
  def getDefaultAsync(): IAsyncOperation[typings.winrt.Windows.Devices.Sms.SmsDevice] = js.native
  
  def getDeviceSelector(): String = js.native
}
