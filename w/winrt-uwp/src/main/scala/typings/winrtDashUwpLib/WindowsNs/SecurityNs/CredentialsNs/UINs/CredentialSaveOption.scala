package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CredentialSaveOption extends js.Object

/** Identifies the state of the dialog box option on whether to save credentials. */
@JSGlobal("Windows.Security.Credentials.UI.CredentialSaveOption")
@js.native
object CredentialSaveOption extends js.Object {
  /** The "Save credentials?" dialog box is not displayed at all. */
  @js.native
  sealed trait hidden
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.CredentialSaveOption
  
  /** The "Save credentials?" dialog box is selected, indicating that the user wants their credentials saved. */
  @js.native
  sealed trait selected
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.CredentialSaveOption
  
  /** The "Save credentials?" dialog box is not selected, indicating that the user doesn't want their credentials saved. */
  @js.native
  sealed trait unselected
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.CredentialSaveOption
  
  /* 2 */ val hidden: hidden with scala.Double = js.native
  /* 1 */ val selected: selected with scala.Double = js.native
  /* 0 */ val unselected: unselected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.CredentialSaveOption with scala.Double
  ] = js.native
}

