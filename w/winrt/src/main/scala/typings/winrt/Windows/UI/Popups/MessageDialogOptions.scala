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
  
  /* 1 */ val acceptUserInputAfterDelay: typings.winrt.Windows.UI.Popups.MessageDialogOptions.acceptUserInputAfterDelay with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.UI.Popups.MessageDialogOptions.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageDialogOptions with Double] = js.native
}

