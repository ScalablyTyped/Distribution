package typings.winrt.global.Windows.UI.Core

import typings.winrt.Windows.System.VirtualKey
import typings.winrt.Windows.UI.Core.CorePhysicalKeyStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core.KeyEventArgs")
@js.native
class KeyEventArgs ()
  extends typings.winrt.Windows.UI.Core.KeyEventArgs {
  /* CompleteClass */
  override var handled: Boolean = js.native
  /* CompleteClass */
  override var keyStatus: CorePhysicalKeyStatus = js.native
  /* CompleteClass */
  override var virtualKey: VirtualKey = js.native
}

