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
  
  val credentialAlreadyExists: credentialAlreadyExists with java.lang.String = js.native
  val notFound: notFound with java.lang.String = js.native
  val securityDeviceLocked: securityDeviceLocked with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  val unknownError: unknownError with java.lang.String = js.native
  val userCanceled: userCanceled with java.lang.String = js.native
  val userPrefersPassword: userPrefersPassword with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.KeyCredentialStatus with java.lang.String
  ] = js.native
}

