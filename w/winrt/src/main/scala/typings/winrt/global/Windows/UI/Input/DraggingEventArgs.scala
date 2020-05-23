package typings.winrt.global.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.DraggingEventArgs")
@js.native
class DraggingEventArgs ()
  extends typings.winrt.Windows.UI.Input.DraggingEventArgs {
  /* CompleteClass */
  override var draggingState: typings.winrt.Windows.UI.Input.DraggingState = js.native
  /* CompleteClass */
  override var pointerDeviceType: PointerDeviceType = js.native
  /* CompleteClass */
  override var position: Point = js.native
}

