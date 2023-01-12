package typings.winrt.Windows.Devices.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseCapabilities extends StObject {
  
  var horizontalWheelPresent: Double
  
  var mousePresent: Double
  
  var numberOfButtons: Double
  
  var swapButtons: Double
  
  var verticalWheelPresent: Double
}
object IMouseCapabilities {
  
  inline def apply(
    horizontalWheelPresent: Double,
    mousePresent: Double,
    numberOfButtons: Double,
    swapButtons: Double,
    verticalWheelPresent: Double
  ): IMouseCapabilities = {
    val __obj = js.Dynamic.literal(horizontalWheelPresent = horizontalWheelPresent.asInstanceOf[js.Any], mousePresent = mousePresent.asInstanceOf[js.Any], numberOfButtons = numberOfButtons.asInstanceOf[js.Any], swapButtons = swapButtons.asInstanceOf[js.Any], verticalWheelPresent = verticalWheelPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMouseCapabilities] (val x: Self) extends AnyVal {
    
    inline def setHorizontalWheelPresent(value: Double): Self = StObject.set(x, "horizontalWheelPresent", value.asInstanceOf[js.Any])
    
    inline def setMousePresent(value: Double): Self = StObject.set(x, "mousePresent", value.asInstanceOf[js.Any])
    
    inline def setNumberOfButtons(value: Double): Self = StObject.set(x, "numberOfButtons", value.asInstanceOf[js.Any])
    
    inline def setSwapButtons(value: Double): Self = StObject.set(x, "swapButtons", value.asInstanceOf[js.Any])
    
    inline def setVerticalWheelPresent(value: Double): Self = StObject.set(x, "verticalWheelPresent", value.asInstanceOf[js.Any])
  }
}
