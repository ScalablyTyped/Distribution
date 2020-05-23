package typings.winrt.global.Windows.UI.Core

import typings.winrt.Windows.System.VirtualKey
import typings.winrt.Windows.UI.Core.CorePhysicalKeyStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core.AcceleratorKeyEventArgs")
@js.native
class AcceleratorKeyEventArgs ()
  extends typings.winrt.Windows.UI.Core.AcceleratorKeyEventArgs {
  /* CompleteClass */
  override var eventType: typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType = js.native
  /* CompleteClass */
  override var handled: Boolean = js.native
  /* CompleteClass */
  override var keyStatus: CorePhysicalKeyStatus = js.native
  /* CompleteClass */
  override var virtualKey: VirtualKey = js.native
}

