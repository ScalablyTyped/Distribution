package typings.winrtUwp.Windows.Security.Credentials

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KeyCredentialStatus extends StObject
/** Represents the status of a key credential request. */
@JSGlobal("Windows.Security.Credentials.KeyCredentialStatus")
@js.native
object KeyCredentialStatus extends StObject {
  
  /** The credential already exists. */
  @js.native
  sealed trait credentialAlreadyExists
    extends StObject
       with KeyCredentialStatus
  
  /** The credential could not be found. */
  @js.native
  sealed trait notFound
    extends StObject
       with KeyCredentialStatus
  
  /** The security device was locked. */
  @js.native
  sealed trait securityDeviceLocked
    extends StObject
       with KeyCredentialStatus
  
  /** The operation was successful. */
  @js.native
  sealed trait success
    extends StObject
       with KeyCredentialStatus
  
  /** An unknown error occurred. */
  @js.native
  sealed trait unknownError
    extends StObject
       with KeyCredentialStatus
  
  /** The request was cancelled by the user. */
  @js.native
  sealed trait userCanceled
    extends StObject
       with KeyCredentialStatus
  
  /** The user prefers to enter a password. */
  @js.native
  sealed trait userPrefersPassword
    extends StObject
       with KeyCredentialStatus
}
