package typings.winrt.global.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.UI.Input.ManipulationDelta
import typings.winrt.Windows.UI.Input.ManipulationVelocities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.ManipulationUpdatedEventArgs")
@js.native
class ManipulationUpdatedEventArgs ()
  extends typings.winrt.Windows.UI.Input.ManipulationUpdatedEventArgs {
  /* CompleteClass */
  override var cumulative: ManipulationDelta = js.native
  /* CompleteClass */
  override var delta: ManipulationDelta = js.native
  /* CompleteClass */
  override var pointerDeviceType: PointerDeviceType = js.native
  /* CompleteClass */
  override var position: Point = js.native
  /* CompleteClass */
  override var velocities: ManipulationVelocities = js.native
}

