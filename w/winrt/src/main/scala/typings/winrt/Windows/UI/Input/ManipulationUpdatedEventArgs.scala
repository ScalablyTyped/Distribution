package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.ManipulationUpdatedEventArgs")
@js.native
class ManipulationUpdatedEventArgs () extends IManipulationUpdatedEventArgs {
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

