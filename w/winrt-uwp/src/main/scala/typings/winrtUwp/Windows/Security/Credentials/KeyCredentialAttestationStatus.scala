package typings.winrtUwp.Windows.Security.Credentials

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KeyCredentialAttestationStatus extends StObject
/** Represents key credential attestation statuses. */
@JSGlobal("Windows.Security.Credentials.KeyCredentialAttestationStatus")
@js.native
object KeyCredentialAttestationStatus extends StObject {
  
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
}
