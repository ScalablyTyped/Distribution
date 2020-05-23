package typings.winrt.global.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.HoldingEventArgs")
@js.native
class HoldingEventArgs ()
  extends typings.winrt.Windows.UI.Input.HoldingEventArgs {
  /* CompleteClass */
  override var holdingState: typings.winrt.Windows.UI.Input.HoldingState = js.native
  /* CompleteClass */
  override var pointerDeviceType: PointerDeviceType = js.native
  /* CompleteClass */
  override var position: Point = js.native
}

