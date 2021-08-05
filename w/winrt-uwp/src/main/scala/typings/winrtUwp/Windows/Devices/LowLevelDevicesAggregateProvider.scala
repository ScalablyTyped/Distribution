package typings.winrtUwp.Windows.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LowLevelDevicesAggregateProvider extends StObject {
  
  var adcControllerProvider: js.Any
  
  /* unmapped type */
  var gpioControllerProvider: js.Any
  
  /* unmapped type */
  var i2cControllerProvider: js.Any
  
  /* unmapped type */
  var pwmControllerProvider: js.Any
  
  /* unmapped type */
  var spiControllerProvider: js.Any
}
object LowLevelDevicesAggregateProvider {
  
  inline def apply(
    adcControllerProvider: js.Any,
    gpioControllerProvider: js.Any,
    i2cControllerProvider: js.Any,
    pwmControllerProvider: js.Any,
    spiControllerProvider: js.Any
  ): LowLevelDevicesAggregateProvider = {
    val __obj = js.Dynamic.literal(adcControllerProvider = adcControllerProvider.asInstanceOf[js.Any], gpioControllerProvider = gpioControllerProvider.asInstanceOf[js.Any], i2cControllerProvider = i2cControllerProvider.asInstanceOf[js.Any], pwmControllerProvider = pwmControllerProvider.asInstanceOf[js.Any], spiControllerProvider = spiControllerProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowLevelDevicesAggregateProvider]
  }
  
  extension [Self <: LowLevelDevicesAggregateProvider](x: Self) {
    
    inline def setAdcControllerProvider(value: js.Any): Self = StObject.set(x, "adcControllerProvider", value.asInstanceOf[js.Any])
    
    inline def setGpioControllerProvider(value: js.Any): Self = StObject.set(x, "gpioControllerProvider", value.asInstanceOf[js.Any])
    
    inline def setI2cControllerProvider(value: js.Any): Self = StObject.set(x, "i2cControllerProvider", value.asInstanceOf[js.Any])
    
    inline def setPwmControllerProvider(value: js.Any): Self = StObject.set(x, "pwmControllerProvider", value.asInstanceOf[js.Any])
    
    inline def setSpiControllerProvider(value: js.Any): Self = StObject.set(x, "spiControllerProvider", value.asInstanceOf[js.Any])
  }
}
