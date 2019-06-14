package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyCredentialAttestationStatus extends js.Object

/** Represents key credential attestation statuses. */
@JSGlobal("Windows.Security.Credentials.KeyCredentialAttestationStatus")
@js.native
object KeyCredentialAttestationStatus extends js.Object {
  /** The operation was not supported. */
  @js.native
  sealed trait notSupported
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialAttestationStatus
  
  /** The operation was successful. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialAttestationStatus
  
  /** The operation temporarily failed. */
  @js.native
  sealed trait temporaryFailure
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialAttestationStatus
  
  /** The operation encountered an unknown error. */
  @js.native
  sealed trait unknownError
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialAttestationStatus
  
  /* 2 */ val notSupported: notSupported with scala.Double = js.native
  /* 0 */ val success: success with scala.Double = js.native
  /* 3 */ val temporaryFailure: temporaryFailure with scala.Double = js.native
  /* 1 */ val unknownError: unknownError with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialAttestationStatus with scala.Double
  ] = js.native
}

