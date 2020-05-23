package typings.winrt.global.Windows.UI.Core

import typings.winrt.Windows.UI.Core.CorePhysicalKeyStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core.CharacterReceivedEventArgs")
@js.native
class CharacterReceivedEventArgs ()
  extends typings.winrt.Windows.UI.Core.CharacterReceivedEventArgs {
  /* CompleteClass */
  override var handled: Boolean = js.native
  /* CompleteClass */
  override var keyCode: Double = js.native
  /* CompleteClass */
  override var keyStatus: CorePhysicalKeyStatus = js.native
}

