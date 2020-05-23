package typings.winrtUwp.global.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtUwp.Windows.Foundation.Point
import typings.winrtUwp.Windows.UI.Input.ManipulationDelta
import typings.winrtUwp.Windows.UI.Input.ManipulationVelocities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the ManipulationCompleted event. */
@JSGlobal("Windows.UI.Input.ManipulationCompletedEventArgs")
@js.native
abstract class ManipulationCompletedEventArgs ()
  extends typings.winrtUwp.Windows.UI.Input.ManipulationCompletedEventArgs {
  /** Gets values that indicate the accumulated transformation deltas (translation, rotation, scale) of a completed manipulation (from the start of the manipulation to the end of inertia). */
  /* CompleteClass */
  override var cumulative: ManipulationDelta = js.native
  /** Gets the device type of the input source. */
  /* CompleteClass */
  override var pointerDeviceType: PointerDeviceType = js.native
  /** Gets the location of the pointer associated with the manipulation for the last manipulation event. */
  /* CompleteClass */
  override var position: Point = js.native
  /** Gets values that indicate the velocities of the transformation deltas (translation, rotation, scale) for a manipulation at the ManipulationCompleted event. */
  /* CompleteClass */
  override var velocities: ManipulationVelocities = js.native
}

