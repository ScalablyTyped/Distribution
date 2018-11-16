package typings
package winrtLib.WindowsNs.UINs.InputNs

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
  override var pointerDeviceType: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType = js.native
  /* CompleteClass */
  override var position: winrtLib.WindowsNs.FoundationNs.Point = js.native
  /* CompleteClass */
  override var velocities: ManipulationVelocities = js.native
}

