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
  
  val hidden: hidden with java.lang.String = js.native
  val selected: selected with java.lang.String = js.native
  val unselected: unselected with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs.CredentialSaveOption with java.lang.String
  ] = js.native
}

