package typings.winrtDashUwp.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports the ability to determine the capabilities of any connected mouse devices. */
@JSGlobal("Windows.Devices.Input.MouseCapabilities")
@js.native
/** Initializes a new instance of the MouseCapabilities class. */
class MouseCapabilities () extends js.Object {
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

