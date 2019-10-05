package typings.winrtDashUwp.Windows.UI.Input

import typings.winrtDashUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtDashUwp.Windows.Foundation.Point
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
  var pointerDeviceType: PointerDeviceType = js.native
  /** Gets the location of the touch, mouse, or pen/stylus contact. */
  var position: Point = js.native
}

