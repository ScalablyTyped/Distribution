package typings.winrt.Windows.Security.Credentials.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CredentialSaveOption extends js.Object
@JSGlobal("Windows.Security.Credentials.UI.CredentialSaveOption")
@js.native
object CredentialSaveOption extends js.Object {
  
  @js.native
  sealed trait hidden extends CredentialSaveOption
  
  @js.native
  sealed trait selected extends CredentialSaveOption
  
  @js.native
  sealed trait unselected extends CredentialSaveOption
}
