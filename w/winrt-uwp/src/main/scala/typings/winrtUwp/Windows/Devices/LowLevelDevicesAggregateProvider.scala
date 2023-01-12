package typings.winrtUwp.Windows.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LowLevelDevicesAggregateProvider extends StObject {
  
  var adcControllerProvider: Any
  
  /* unmapped type */
  var gpioControllerProvider: Any
  
  /* unmapped type */
  var i2cControllerProvider: Any
  
  /* unmapped type */
  var pwmControllerProvider: Any
  
  /* unmapped type */
  var spiControllerProvider: Any
}
object LowLevelDevicesAggregateProvider {
  
  inline def apply(
    adcControllerProvider: Any,
    gpioControllerProvider: Any,
    i2cControllerProvider: Any,
    pwmControllerProvider: Any,
    spiControllerProvider: Any
  ): LowLevelDevicesAggregateProvider = {
    val __obj = js.Dynamic.literal(adcControllerProvider = adcControllerProvider.asInstanceOf[js.Any], gpioControllerProvider = gpioControllerProvider.asInstanceOf[js.Any], i2cControllerProvider = i2cControllerProvider.asInstanceOf[js.Any], pwmControllerProvider = pwmControllerProvider.asInstanceOf[js.Any], spiControllerProvider = spiControllerProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowLevelDevicesAggregateProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LowLevelDevicesAggregateProvider] (val x: Self) extends AnyVal {
    
    inline def setAdcControllerProvider(value: Any): Self = StObject.set(x, "adcControllerProvider", value.asInstanceOf[js.Any])
    
    inline def setGpioControllerProvider(value: Any): Self = StObject.set(x, "gpioControllerProvider", value.asInstanceOf[js.Any])
    
    inline def setI2cControllerProvider(value: Any): Self = StObject.set(x, "i2cControllerProvider", value.asInstanceOf[js.Any])
    
    inline def setPwmControllerProvider(value: Any): Self = StObject.set(x, "pwmControllerProvider", value.asInstanceOf[js.Any])
    
    inline def setSpiControllerProvider(value: Any): Self = StObject.set(x, "spiControllerProvider", value.asInstanceOf[js.Any])
  }
}
