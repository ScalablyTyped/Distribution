package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChainValidationResult extends StObject
/** Describes the result of a certificate chain verification operation. */
@JSGlobal("Windows.Security.Cryptography.Certificates.ChainValidationResult")
@js.native
object ChainValidationResult extends StObject {
  
  /** The basic constraint extension of a certificate in the chain has not been observed. */
  @js.native
  sealed trait basicConstraintsError
    extends StObject
       with ChainValidationResult
  
  /** A certificate in the chain has expired. */
  @js.native
  sealed trait expired
    extends StObject
       with ChainValidationResult
  
  /** The certificate chain is missing one or more certificates. */
  @js.native
  sealed trait incompleteChain
    extends StObject
       with ChainValidationResult
  
  /** A certificate in the chain has a policy that is not valid. */
  @js.native
  sealed trait invalidCertificateAuthorityPolicy
    extends StObject
       with ChainValidationResult
  
  /** A certificate in the chain has a name that is not valid. The name is either not included in the permitted list or is explicitly excluded. */
  @js.native
  sealed trait invalidName
    extends StObject
       with ChainValidationResult
  
  /** The signature of a certificate in the chain cannot be verified. */
  @js.native
  sealed trait invalidSignature
    extends StObject
       with ChainValidationResult
  
  /** An unexpected error occurred while validating the certificate chain. */
  @js.native
  sealed trait otherErrors
    extends StObject
       with ChainValidationResult
  
  /** Unable to connect to the revocation server. */
  @js.native
  sealed trait revocationFailure
    extends StObject
       with ChainValidationResult
  
  /** No installed or registered DLL was found to verify revocation. */
  @js.native
  sealed trait revocationInformationMissing
    extends StObject
       with ChainValidationResult
  
  /** A certificate in the chain has been revoked. */
  @js.native
  sealed trait revoked
    extends StObject
       with ChainValidationResult
  
  /** The certificate chain was verified. */
  @js.native
  sealed trait success
    extends StObject
       with ChainValidationResult
  
  /** A certificate in the chain contains an unknown extension that is marked "critical". */
  @js.native
  sealed trait unknownCriticalExtension
    extends StObject
       with ChainValidationResult
  
  /** A certificate in the chain is not trusted. */
  @js.native
  sealed trait untrusted
    extends StObject
       with ChainValidationResult
  
  /** A certificate in the chain is being used for a purpose other than one specified by its CA. */
  @js.native
  sealed trait wrongUsage
    extends StObject
       with ChainValidationResult
}
