package typings
package winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CredentialSaveOption extends js.Object

@JSGlobal("Windows.Security.Credentials.UI.CredentialSaveOption")
@js.native
object CredentialSaveOption extends js.Object {
  @js.native
  sealed trait hidden
    extends winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs.CredentialSaveOption
  
  @js.native
  sealed trait selected
    extends winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs.CredentialSaveOption
  
  @js.native
  sealed trait unselected
    extends winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs.CredentialSaveOption
  
  /* 2 */ val hidden: hidden with scala.Double = js.native
  /* 1 */ val selected: selected with scala.Double = js.native
  /* 0 */ val unselected: unselected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs.CredentialSaveOption with scala.Double
  ] = js.native
}

