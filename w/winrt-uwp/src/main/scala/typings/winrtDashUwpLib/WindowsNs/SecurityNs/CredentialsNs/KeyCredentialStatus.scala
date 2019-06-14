package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs

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
  sealed trait credentialAlreadyExists
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialStatus
  
  /** The credential could not be found. */
  @js.native
  sealed trait notFound
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialStatus
  
  /** The security device was locked. */
  @js.native
  sealed trait securityDeviceLocked
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialStatus
  
  /** The operation was successful. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialStatus
  
  /** An unknown error occurred. */
  @js.native
  sealed trait unknownError
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialStatus
  
  /** The request was cancelled by the user. */
  @js.native
  sealed trait userCanceled
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialStatus
  
  /** The user prefers to enter a password. */
  @js.native
  sealed trait userPrefersPassword
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialStatus
  
  /* 5 */ val credentialAlreadyExists: credentialAlreadyExists with scala.Double = js.native
  /* 2 */ val notFound: notFound with scala.Double = js.native
  /* 6 */ val securityDeviceLocked: securityDeviceLocked with scala.Double = js.native
  /* 0 */ val success: success with scala.Double = js.native
  /* 1 */ val unknownError: unknownError with scala.Double = js.native
  /* 3 */ val userCanceled: userCanceled with scala.Double = js.native
  /* 4 */ val userPrefersPassword: userPrefersPassword with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialStatus with scala.Double
  ] = js.native
}

