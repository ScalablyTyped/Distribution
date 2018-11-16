package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.HoldingEventArgs")
@js.native
class HoldingEventArgs () extends IHoldingEventArgs {
  /* CompleteClass */
  override var holdingState: HoldingState = js.native
  /* CompleteClass */
  override var pointerDeviceType: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType = js.native
  /* CompleteClass */
  override var position: winrtLib.WindowsNs.FoundationNs.Point = js.native
}

