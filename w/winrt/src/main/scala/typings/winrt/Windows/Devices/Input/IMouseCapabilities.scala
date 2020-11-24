package typings.winrt.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMouseCapabilities extends js.Object {
  
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
  implicit class IMouseCapabilitiesOps[Self <: IMouseCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHorizontalWheelPresent(value: Double): Self = this.set("horizontalWheelPresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousePresent(value: Double): Self = this.set("mousePresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfButtons(value: Double): Self = this.set("numberOfButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwapButtons(value: Double): Self = this.set("swapButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalWheelPresent(value: Double): Self = this.set("verticalWheelPresent", value.asInstanceOf[js.Any])
  }
}
