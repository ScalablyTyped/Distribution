package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtUwp.Windows.Foundation.Point
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
  var pointerDeviceType: PointerDeviceType = js.native
  /** Gets the location of the mouse or pen/stylus contact. */
  var position: Point = js.native
}

