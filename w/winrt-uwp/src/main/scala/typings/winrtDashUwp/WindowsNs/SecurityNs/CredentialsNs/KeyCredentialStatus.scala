package typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyCredentialStatus extends js.Object

/** Represents the status of a key credential request. */
@JSGlobal("Windows.Security.Credentials.KeyCredentialStatus")
@js.native
object KeyCredentialStatus extends js.Object {
  /** The credential already exists. */
  @js.native
  sealed trait credentialAlreadyExists extends KeyCredentialStatus
  
  /** The credential could not be found. */
  @js.native
  sealed trait notFound extends KeyCredentialStatus
  
  /** The security device was locked. */
  @js.native
  sealed trait securityDeviceLocked extends KeyCredentialStatus
  
  /** The operation was successful. */
  @js.native
  sealed trait success extends KeyCredentialStatus
  
  /** An unknown error occurred. */
  @js.native
  sealed trait unknownError extends KeyCredentialStatus
  
  /** The request was cancelled by the user. */
  @js.native
  sealed trait userCanceled extends KeyCredentialStatus
  
  /** The user prefers to enter a password. */
  @js.native
  sealed trait userPrefersPassword extends KeyCredentialStatus
  
  /* 5 */ val credentialAlreadyExists: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialStatus.credentialAlreadyExists with Double = js.native
  /* 2 */ val notFound: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialStatus.notFound with Double = js.native
  /* 6 */ val securityDeviceLocked: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialStatus.securityDeviceLocked with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialStatus.success with Double = js.native
  /* 1 */ val unknownError: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialStatus.unknownError with Double = js.native
  /* 3 */ val userCanceled: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialStatus.userCanceled with Double = js.native
  /* 4 */ val userPrefersPassword: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialStatus.userPrefersPassword with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyCredentialStatus with Double] = js.native
}

