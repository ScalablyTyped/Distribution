package typings.winrtUwp.Windows.Security.Credentials

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyCredentialStatus with Double] = js.native
  /* 5 */ @js.native
  object credentialAlreadyExists extends TopLevel[credentialAlreadyExists with Double]
  
  /* 2 */ @js.native
  object notFound extends TopLevel[notFound with Double]
  
  /* 6 */ @js.native
  object securityDeviceLocked extends TopLevel[securityDeviceLocked with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 1 */ @js.native
  object unknownError extends TopLevel[unknownError with Double]
  
  /* 3 */ @js.native
  object userCanceled extends TopLevel[userCanceled with Double]
  
  /* 4 */ @js.native
  object userPrefersPassword extends TopLevel[userPrefersPassword with Double]
  
}

