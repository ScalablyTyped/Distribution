package typings.winrtUwp.global.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the Dragging event. */
@JSGlobal("Windows.UI.Input.DraggingEventArgs")
@js.native
abstract class DraggingEventArgs ()
  extends typings.winrtUwp.Windows.UI.Input.DraggingEventArgs {
  /** Gets the state of the Dragging event. */
  /* CompleteClass */
  override var draggingState: typings.winrtUwp.Windows.UI.Input.DraggingState = js.native
  /** Gets the device type of the input source. */
  /* CompleteClass */
  override var pointerDeviceType: PointerDeviceType = js.native
  /** Gets the location of the mouse or pen/stylus contact. */
  /* CompleteClass */
  override var position: Point = js.native
}

