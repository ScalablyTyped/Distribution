package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the ManipulationUpdated event. */
@JSGlobal("Windows.UI.Input.ManipulationUpdatedEventArgs")
@js.native
abstract class ManipulationUpdatedEventArgs () extends js.Object {
  /** Gets values that indicate the accumulated transformation deltas (translation, rotation, scale) for a manipulation from the beginning of the interaction to the ManipulationUpdated event. */
  var cumulative: ManipulationDelta = js.native
  /** Gets values that indicate the changes in the transformation deltas (translation, rotation, scale) of a manipulation since the last manipulation event. */
  var delta: ManipulationDelta = js.native
  /** Gets the device type of the input source. */
  var pointerDeviceType: winrtDashUwpLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType = js.native
  /** Gets the location of the pointer associated with the manipulation for the last manipulation event. */
  var position: winrtDashUwpLib.WindowsNs.FoundationNs.Point = js.native
  /** Gets values that indicate the velocities of the transformation deltas (translation, rotation, scale) for a manipulation at the ManipulationUpdated event. */
  var velocities: ManipulationVelocities = js.native
}

