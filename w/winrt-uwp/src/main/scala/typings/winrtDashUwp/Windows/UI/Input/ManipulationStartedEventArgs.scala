package typings.winrtDashUwp.Windows.UI.Input

import typings.winrtDashUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtDashUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the ManipulationStarted event. */
@JSGlobal("Windows.UI.Input.ManipulationStartedEventArgs")
@js.native
abstract class ManipulationStartedEventArgs () extends js.Object {
  /** Gets values that indicate the accumulated transformation deltas (translation, rotation, scale) for a manipulation before the ManipulationStarted event. */
  var cumulative: ManipulationDelta = js.native
  /** Gets the device type of the input source. */
  var pointerDeviceType: PointerDeviceType = js.native
  /** Gets the location of the pointer associated with the manipulation for the last manipulation event. */
  var position: Point = js.native
}

