package typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs

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
  sealed trait notSupported extends KeyCredentialAttestationStatus
  
  /** The operation was successful. */
  @js.native
  sealed trait success extends KeyCredentialAttestationStatus
  
  /** The operation temporarily failed. */
  @js.native
  sealed trait temporaryFailure extends KeyCredentialAttestationStatus
  
  /** The operation encountered an unknown error. */
  @js.native
  sealed trait unknownError extends KeyCredentialAttestationStatus
  
  /* 2 */ val notSupported: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialAttestationStatus.notSupported with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialAttestationStatus.success with Double = js.native
  /* 3 */ val temporaryFailure: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialAttestationStatus.temporaryFailure with Double = js.native
  /* 1 */ val unknownError: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialAttestationStatus.unknownError with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyCredentialAttestationStatus with Double] = js.native
}

