package typings.winrtUwp.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports the ability to determine the capabilities of any connected mouse devices. */
trait MouseCapabilities extends js.Object {
  /** Gets a value indicating whether any of the mice connected to the computer have a scroll wheel that tilts left and right (usually for horizontal scrolling). */
  var horizontalWheelPresent: Double
  /** Gets a value that indicates whether a mouse device is detected. */
  var mousePresent: Double
  /** Gets a value representing the number of buttons on the mouse. If multiple mice are present, it returns the number of buttons of the mouse which has maximum number of buttons. */
  var numberOfButtons: Double
  /** Gets a value indicating whether any of the mice connected to the computer has swapped left and right buttons. */
  var swapButtons: Double
  /** Gets a value indicating whether any of the mice connected to the computer have a scroll wheel that rolls up and down (usually for vertical scrolling). */
  var verticalWheelPresent: Double
}

object MouseCapabilities {
  @scala.inline
  def apply(
    horizontalWheelPresent: Double,
    mousePresent: Double,
    numberOfButtons: Double,
    swapButtons: Double,
    verticalWheelPresent: Double
  ): MouseCapabilities = {
    val __obj = js.Dynamic.literal(horizontalWheelPresent = horizontalWheelPresent.asInstanceOf[js.Any], mousePresent = mousePresent.asInstanceOf[js.Any], numberOfButtons = numberOfButtons.asInstanceOf[js.Any], swapButtons = swapButtons.asInstanceOf[js.Any], verticalWheelPresent = verticalWheelPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseCapabilities]
  }
}

