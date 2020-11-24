package typings.winrtUwp.Windows.Security.Credentials.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
