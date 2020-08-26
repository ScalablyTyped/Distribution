package typings.winrtUwp.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports the ability to determine the capabilities of any connected mouse devices. */
@js.native
trait MouseCapabilities extends js.Object {
  /** Gets a value indicating whether any of the mice connected to the computer have a scroll wheel that tilts left and right (usually for horizontal scrolling). */
  var horizontalWheelPresent: Double = js.native
  /** Gets a value that indicates whether a mouse device is detected. */
  var mousePresent: Double = js.native
  /** Gets a value representing the number of buttons on the mouse. If multiple mice are present, it returns the number of buttons of the mouse which has maximum number of buttons. */
  var numberOfButtons: Double = js.native
  /** Gets a value indicating whether any of the mice connected to the computer has swapped left and right buttons. */
  var swapButtons: Double = js.native
  /** Gets a value indicating whether any of the mice connected to the computer have a scroll wheel that rolls up and down (usually for vertical scrolling). */
  var verticalWheelPresent: Double = js.native
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
  @scala.inline
  implicit class MouseCapabilitiesOps[Self <: MouseCapabilities] (val x: Self) extends AnyVal {
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

