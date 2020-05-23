package typings.winrt.global.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.CrossSlidingEventArgs")
@js.native
class CrossSlidingEventArgs ()
  extends typings.winrt.Windows.UI.Input.CrossSlidingEventArgs {
  /* CompleteClass */
  override var crossSlidingState: typings.winrt.Windows.UI.Input.CrossSlidingState = js.native
  /* CompleteClass */
  override var pointerDeviceType: PointerDeviceType = js.native
  /* CompleteClass */
  override var position: Point = js.native
}

