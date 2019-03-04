package typings
package winrtLib.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMouseCapabilities extends js.Object {
  var horizontalWheelPresent: scala.Double
  var mousePresent: scala.Double
  var numberOfButtons: scala.Double
  var swapButtons: scala.Double
  var verticalWheelPresent: scala.Double
}

object IMouseCapabilities {
  @scala.inline
  def apply(
    horizontalWheelPresent: scala.Double,
    mousePresent: scala.Double,
    numberOfButtons: scala.Double,
    swapButtons: scala.Double,
    verticalWheelPresent: scala.Double
  ): IMouseCapabilities = {
    val __obj = js.Dynamic.literal(horizontalWheelPresent = horizontalWheelPresent, mousePresent = mousePresent, numberOfButtons = numberOfButtons, swapButtons = swapButtons, verticalWheelPresent = verticalWheelPresent)
  
    __obj.asInstanceOf[IMouseCapabilities]
  }
}

