package typings.winrt.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMouseCapabilities extends js.Object {
  var horizontalWheelPresent: Double
  var mousePresent: Double
  var numberOfButtons: Double
  var swapButtons: Double
  var verticalWheelPresent: Double
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
    val __obj = js.Dynamic.literal(horizontalWheelPresent = horizontalWheelPresent, mousePresent = mousePresent, numberOfButtons = numberOfButtons, swapButtons = swapButtons, verticalWheelPresent = verticalWheelPresent)
  
    __obj.asInstanceOf[IMouseCapabilities]
  }
}

