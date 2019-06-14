package typings
package winrtDashUwpLib.WindowsNs.UINs.PopupsNs

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
  sealed trait acceptUserInputAfterDelay
    extends winrtDashUwpLib.WindowsNs.UINs.PopupsNs.MessageDialogOptions
  
  /** No options are specified and default behavior is used. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.UINs.PopupsNs.MessageDialogOptions
  
  /* 1 */ val acceptUserInputAfterDelay: acceptUserInputAfterDelay with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.PopupsNs.MessageDialogOptions with scala.Double] = js.native
}

