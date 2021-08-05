package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Devices.Gpio.GpioOpenStatus
import typings.winrtUwp.Windows.Devices.Gpio.GpioPin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenStatus extends StObject {
  
  /** An enumeration value that indicates either that the attempt to open the GPIO pin succeeded, or the reason that the attempt to open the GPIO pin failed. */ var openStatus: GpioOpenStatus
  
  /** The opened GPIO pin if the return value is true; otherwise null. */ var pin: GpioPin
  
  /** True if the method successfully opened the pin; otherwise false. */ var returnValue: Boolean
}
object OpenStatus {
  
  inline def apply(openStatus: GpioOpenStatus, pin: GpioPin, returnValue: Boolean): OpenStatus = {
    val __obj = js.Dynamic.literal(openStatus = openStatus.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenStatus]
  }
  
  extension [Self <: OpenStatus](x: Self) {
    
    inline def setOpenStatus(value: GpioOpenStatus): Self = StObject.set(x, "openStatus", value.asInstanceOf[js.Any])
    
    inline def setPin(value: GpioPin): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
