package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.System.VirtualKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core.AcceleratorKeyEventArgs")
@js.native
class AcceleratorKeyEventArgs () extends IAcceleratorKeyEventArgs {
  /* CompleteClass */
  override var eventType: CoreAcceleratorKeyEventType = js.native
  /* CompleteClass */
  override var handled: Boolean = js.native
  /* CompleteClass */
  override var keyStatus: CorePhysicalKeyStatus = js.native
  /* CompleteClass */
  override var virtualKey: VirtualKey = js.native
}

