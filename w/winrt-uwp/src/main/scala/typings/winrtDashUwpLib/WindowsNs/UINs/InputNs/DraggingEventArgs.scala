package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the Dragging event. */
@JSGlobal("Windows.UI.Input.DraggingEventArgs")
@js.native
abstract class DraggingEventArgs () extends js.Object {
  /** Gets the state of the Dragging event. */
  var draggingState: DraggingState = js.native
  /** Gets the device type of the input source. */
  var pointerDeviceType: winrtDashUwpLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType = js.native
  /** Gets the location of the mouse or pen/stylus contact. */
  var position: winrtDashUwpLib.WindowsNs.FoundationNs.Point = js.native
}

