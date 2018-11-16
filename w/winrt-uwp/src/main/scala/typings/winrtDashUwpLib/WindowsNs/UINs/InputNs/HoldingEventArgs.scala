package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the Holding event. */
@JSGlobal("Windows.UI.Input.HoldingEventArgs")
@js.native
abstract class HoldingEventArgs () extends js.Object {
  /** Gets the state of the Holding event. */
  var holdingState: HoldingState = js.native
  /** Gets the device type of the input source. */
  var pointerDeviceType: winrtDashUwpLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType = js.native
  /** Gets the location of the touch, mouse, or pen/stylus contact. */
  var position: winrtDashUwpLib.WindowsNs.FoundationNs.Point = js.native
}

