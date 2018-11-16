package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the Tapped event. */
@JSGlobal("Windows.UI.Input.TappedEventArgs")
@js.native
abstract class TappedEventArgs () extends js.Object {
  /** Gets the device type of the input source. */
  var pointerDeviceType: winrtDashUwpLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType = js.native
  /** Gets the location of the touch, mouse, or pen/stylus contact. */
  var position: winrtDashUwpLib.WindowsNs.FoundationNs.Point = js.native
  /** Gets the number of times the tap interaction was detected. */
  var tapCount: scala.Double = js.native
}

