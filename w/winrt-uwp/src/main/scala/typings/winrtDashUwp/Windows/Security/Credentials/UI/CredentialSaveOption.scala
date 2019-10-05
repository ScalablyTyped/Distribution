package typings.winrtDashUwp.Windows.Security.Credentials.UI

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
  sealed trait hidden extends CredentialSaveOption
  
  /** The "Save credentials?" dialog box is selected, indicating that the user wants their credentials saved. */
  @js.native
  sealed trait selected extends CredentialSaveOption
  
  /** The "Save credentials?" dialog box is not selected, indicating that the user doesn't want their credentials saved. */
  @js.native
  sealed trait unselected extends CredentialSaveOption
  
  /* 2 */ val hidden: typings.winrtDashUwp.Windows.Security.Credentials.UI.CredentialSaveOption.hidden with Double = js.native
  /* 1 */ val selected: typings.winrtDashUwp.Windows.Security.Credentials.UI.CredentialSaveOption.selected with Double = js.native
  /* 0 */ val unselected: typings.winrtDashUwp.Windows.Security.Credentials.UI.CredentialSaveOption.unselected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CredentialSaveOption with Double] = js.native
}

