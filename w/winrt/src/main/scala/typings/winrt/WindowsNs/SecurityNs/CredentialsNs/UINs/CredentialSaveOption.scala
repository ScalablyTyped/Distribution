package typings.winrt.WindowsNs.SecurityNs.CredentialsNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 2 */ val hidden: typings.winrt.WindowsNs.SecurityNs.CredentialsNs.UINs.CredentialSaveOption.hidden with Double = js.native
  /* 1 */ val selected: typings.winrt.WindowsNs.SecurityNs.CredentialsNs.UINs.CredentialSaveOption.selected with Double = js.native
  /* 0 */ val unselected: typings.winrt.WindowsNs.SecurityNs.CredentialsNs.UINs.CredentialSaveOption.unselected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CredentialSaveOption with Double] = js.native
}

