package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyCredentialCreationOption extends js.Object

/** Represents the options for creating key credentials. */
@JSGlobal("Windows.Security.Credentials.KeyCredentialCreationOption")
@js.native
object KeyCredentialCreationOption extends js.Object {
  /** Fail if a key credential already exists. */
  @js.native
  sealed trait failIfExists
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialCreationOption
  
  /** Replace any existing key credentials. */
  @js.native
  sealed trait replaceExisting
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialCreationOption
  
  val failIfExists: failIfExists with java.lang.String = js.native
  val replaceExisting: replaceExisting with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialCreationOption with java.lang.String
  ] = js.native
}

