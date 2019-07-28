package typings.winrtDashUwp.WindowsNs.UINs.PopupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessageDialogOptions extends js.Object

/** Specifies less frequently used options for a MessageDialog . */
@JSGlobal("Windows.UI.Popups.MessageDialogOptions")
@js.native
object MessageDialogOptions extends js.Object {
  /** Ignore user input for a short period. This enables browsers to defend against clickjacking. */
  @js.native
  sealed trait acceptUserInputAfterDelay extends MessageDialogOptions
  
  /** No options are specified and default behavior is used. */
  @js.native
  sealed trait none extends MessageDialogOptions
  
  /* 1 */ val acceptUserInputAfterDelay: typings.winrtDashUwp.WindowsNs.UINs.PopupsNs.MessageDialogOptions.acceptUserInputAfterDelay with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.UINs.PopupsNs.MessageDialogOptions.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageDialogOptions with Double] = js.native
}

