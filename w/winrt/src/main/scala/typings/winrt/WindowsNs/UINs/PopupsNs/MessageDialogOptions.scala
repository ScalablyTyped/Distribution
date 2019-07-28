package typings.winrt.WindowsNs.UINs.PopupsNs

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
  
  /* 1 */ val acceptUserInputAfterDelay: typings.winrt.WindowsNs.UINs.PopupsNs.MessageDialogOptions.acceptUserInputAfterDelay with Double = js.native
  /* 0 */ val none: typings.winrt.WindowsNs.UINs.PopupsNs.MessageDialogOptions.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageDialogOptions with Double] = js.native
}

