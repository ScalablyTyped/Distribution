package typings.winrt.Windows.Devices.Sms

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISmsDeviceStatics extends StObject {
  
  def fromIdAsync(deviceInstanceId: String): IAsyncOperation[SmsDevice]
  
  def getDefaultAsync(): IAsyncOperation[SmsDevice]
  
  def getDeviceSelector(): String
}
object ISmsDeviceStatics {
  
  inline def apply(
    fromIdAsync: String => IAsyncOperation[SmsDevice],
    getDefaultAsync: () => IAsyncOperation[SmsDevice],
    getDeviceSelector: () => String
  ): ISmsDeviceStatics = {
    val __obj = js.Dynamic.literal(fromIdAsync = js.Any.fromFunction1(fromIdAsync), getDefaultAsync = js.Any.fromFunction0(getDefaultAsync), getDeviceSelector = js.Any.fromFunction0(getDeviceSelector))
    __obj.asInstanceOf[ISmsDeviceStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISmsDeviceStatics] (val x: Self) extends AnyVal {
    
    inline def setFromIdAsync(value: String => IAsyncOperation[SmsDevice]): Self = StObject.set(x, "fromIdAsync", js.Any.fromFunction1(value))
    
    inline def setGetDefaultAsync(value: () => IAsyncOperation[SmsDevice]): Self = StObject.set(x, "getDefaultAsync", js.Any.fromFunction0(value))
    
    inline def setGetDeviceSelector(value: () => String): Self = StObject.set(x, "getDeviceSelector", js.Any.fromFunction0(value))
  }
}
