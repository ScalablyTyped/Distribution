package typings.winrtUwp.global.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtUwp.Windows.Foundation.Point
import typings.winrtUwp.Windows.UI.Input.ManipulationDelta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the ManipulationStarted event. */
@JSGlobal("Windows.UI.Input.ManipulationStartedEventArgs")
@js.native
abstract class ManipulationStartedEventArgs ()
  extends typings.winrtUwp.Windows.UI.Input.ManipulationStartedEventArgs {
  /** Gets values that indicate the accumulated transformation deltas (translation, rotation, scale) for a manipulation before the ManipulationStarted event. */
  /* CompleteClass */
  override var cumulative: ManipulationDelta = js.native
  /** Gets the device type of the input source. */
  /* CompleteClass */
  override var pointerDeviceType: PointerDeviceType = js.native
  /** Gets the location of the pointer associated with the manipulation for the last manipulation event. */
  /* CompleteClass */
  override var position: Point = js.native
}

