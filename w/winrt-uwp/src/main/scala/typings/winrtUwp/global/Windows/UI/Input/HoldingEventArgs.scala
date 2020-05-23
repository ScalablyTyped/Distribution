package typings.winrtUwp.global.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the Holding event. */
@JSGlobal("Windows.UI.Input.HoldingEventArgs")
@js.native
abstract class HoldingEventArgs ()
  extends typings.winrtUwp.Windows.UI.Input.HoldingEventArgs {
  /** Gets the state of the Holding event. */
  /* CompleteClass */
  override var holdingState: typings.winrtUwp.Windows.UI.Input.HoldingState = js.native
  /** Gets the device type of the input source. */
  /* CompleteClass */
  override var pointerDeviceType: PointerDeviceType = js.native
  /** Gets the location of the touch, mouse, or pen/stylus contact. */
  /* CompleteClass */
  override var position: Point = js.native
}

