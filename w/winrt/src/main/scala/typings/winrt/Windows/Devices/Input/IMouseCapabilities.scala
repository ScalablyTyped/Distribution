package typings.winrt.Windows.Devices.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMouseCapabilities extends StObject {
  
  var horizontalWheelPresent: Double = js.native
  
  var mousePresent: Double = js.native
  
  var numberOfButtons: Double = js.native
  
  var swapButtons: Double = js.native
  
  var verticalWheelPresent: Double = js.native
}
object IMouseCapabilities {
  
  @scala.inline
  def apply(
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
  implicit class IMouseCapabilitiesMutableBuilder[Self <: IMouseCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontalWheelPresent(value: Double): Self = StObject.set(x, "horizontalWheelPresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousePresent(value: Double): Self = StObject.set(x, "mousePresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfButtons(value: Double): Self = StObject.set(x, "numberOfButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwapButtons(value: Double): Self = StObject.set(x, "swapButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalWheelPresent(value: Double): Self = StObject.set(x, "verticalWheelPresent", value.asInstanceOf[js.Any])
  }
}
