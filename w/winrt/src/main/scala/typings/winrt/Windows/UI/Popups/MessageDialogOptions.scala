package typings.winrt.Windows.UI.Popups

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessageDialogOptions extends js.Object

@JSGlobal("Windows.UI.Popups.MessageDialogOptions")
@js.native
object MessageDialogOptions extends js.Object {
  @js.native
  sealed trait acceptUserInputAfterDelay extends MessageDialogOptions
  
  @js.native
  sealed trait none extends MessageDialogOptions
  
}

