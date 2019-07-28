package typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs

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
  sealed trait failIfExists extends KeyCredentialCreationOption
  
  /** Replace any existing key credentials. */
  @js.native
  sealed trait replaceExisting extends KeyCredentialCreationOption
  
  /* 1 */ val failIfExists: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialCreationOption.failIfExists with Double = js.native
  /* 0 */ val replaceExisting: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialCreationOption.replaceExisting with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyCredentialCreationOption with Double] = js.native
}

