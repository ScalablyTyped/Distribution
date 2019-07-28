package typings.winrt.WindowsNs.UINs.CoreNs

import typings.winrt.WindowsNs.SystemNs.VirtualKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core.KeyEventArgs")
@js.native
class KeyEventArgs () extends IKeyEventArgs {
  /* CompleteClass */
  override var handled: Boolean = js.native
  /* CompleteClass */
  override var keyStatus: CorePhysicalKeyStatus = js.native
  /* CompleteClass */
  override var virtualKey: VirtualKey = js.native
}

