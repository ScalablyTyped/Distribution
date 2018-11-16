package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports the ability to determine the capabilities of any connected mouse devices. */
@JSGlobal("Windows.Devices.Input.MouseCapabilities")
@js.native
class MouseCapabilities () extends js.Object {
  /** Gets a value indicating whether any of the mice connected to the computer have a scroll wheel that tilts left and right (usually for horizontal scrolling). */
  var horizontalWheelPresent: scala.Double = js.native
  /** Gets a value that indicates whether a mouse device is detected. */
  var mousePresent: scala.Double = js.native
  /** Gets a value representing the number of buttons on the mouse. If multiple mice are present, it returns the number of buttons of the mouse which has maximum number of buttons. */
  var numberOfButtons: scala.Double = js.native
  /** Gets a value indicating whether any of the mice connected to the computer has swapped left and right buttons. */
  var swapButtons: scala.Double = js.native
  /** Gets a value indicating whether any of the mice connected to the computer have a scroll wheel that rolls up and down (usually for vertical scrolling). */
  var verticalWheelPresent: scala.Double = js.native
}

