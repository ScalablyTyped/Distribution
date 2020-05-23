package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the Dragging event. */
trait DraggingEventArgs extends js.Object {
  /** Gets the state of the Dragging event. */
  var draggingState: DraggingState
  /** Gets the device type of the input source. */
  var pointerDeviceType: PointerDeviceType
  /** Gets the location of the mouse or pen/stylus contact. */
  var position: Point
}

object DraggingEventArgs {
  @scala.inline
  def apply(draggingState: DraggingState, pointerDeviceType: PointerDeviceType, position: Point): DraggingEventArgs = {
    val __obj = js.Dynamic.literal(draggingState = draggingState.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggingEventArgs]
  }
}

