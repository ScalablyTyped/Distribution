package typings.winrt.Windows.Devices.Sms

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISmsDeviceStatics extends StObject {
  
  def fromIdAsync(deviceInstanceId: String): IAsyncOperation[SmsDevice] = js.native
  
  def getDefaultAsync(): IAsyncOperation[SmsDevice] = js.native
  
  def getDeviceSelector(): String = js.native
}
object ISmsDeviceStatics {
  
  @scala.inline
  def apply(
    fromIdAsync: String => IAsyncOperation[SmsDevice],
    getDefaultAsync: () => IAsyncOperation[SmsDevice],
    getDeviceSelector: () => String
  ): ISmsDeviceStatics = {
    val __obj = js.Dynamic.literal(fromIdAsync = js.Any.fromFunction1(fromIdAsync), getDefaultAsync = js.Any.fromFunction0(getDefaultAsync), getDeviceSelector = js.Any.fromFunction0(getDeviceSelector))
    __obj.asInstanceOf[ISmsDeviceStatics]
  }
  
  @scala.inline
  implicit class ISmsDeviceStaticsMutableBuilder[Self <: ISmsDeviceStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromIdAsync(value: String => IAsyncOperation[SmsDevice]): Self = StObject.set(x, "fromIdAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDefaultAsync(value: () => IAsyncOperation[SmsDevice]): Self = StObject.set(x, "getDefaultAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDeviceSelector(value: () => String): Self = StObject.set(x, "getDeviceSelector", js.Any.fromFunction0(value))
  }
}
