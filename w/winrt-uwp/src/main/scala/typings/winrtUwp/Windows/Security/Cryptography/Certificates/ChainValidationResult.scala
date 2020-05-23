package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChainValidationResult extends js.Object

/** Describes the result of a certificate chain verification operation. */
@JSGlobal("Windows.Security.Cryptography.Certificates.ChainValidationResult")
@js.native
object ChainValidationResult extends js.Object {
  /** The basic constraint extension of a certificate in the chain has not been observed. */
  @js.native
  sealed trait basicConstraintsError extends ChainValidationResult
  
  /** A certificate in the chain has expired. */
  @js.native
  sealed trait expired extends ChainValidationResult
  
  /** The certificate chain is missing one or more certificates. */
  @js.native
  sealed trait incompleteChain extends ChainValidationResult
  
  /** A certificate in the chain has a policy that is not valid. */
  @js.native
  sealed trait invalidCertificateAuthorityPolicy extends ChainValidationResult
  
  /** A certificate in the chain has a name that is not valid. The name is either not included in the permitted list or is explicitly excluded. */
  @js.native
  sealed trait invalidName extends ChainValidationResult
  
  /** The signature of a certificate in the chain cannot be verified. */
  @js.native
  sealed trait invalidSignature extends ChainValidationResult
  
  /** An unexpected error occurred while validating the certificate chain. */
  @js.native
  sealed trait otherErrors extends ChainValidationResult
  
  /** Unable to connect to the revocation server. */
  @js.native
  sealed trait revocationFailure extends ChainValidationResult
  
  /** No installed or registered DLL was found to verify revocation. */
  @js.native
  sealed trait revocationInformationMissing extends ChainValidationResult
  
  /** A certificate in the chain has been revoked. */
  @js.native
  sealed trait revoked extends ChainValidationResult
  
  /** The certificate chain was verified. */
  @js.native
  sealed trait success extends ChainValidationResult
  
  /** A certificate in the chain contains an unknown extension that is marked "critical". */
  @js.native
  sealed trait unknownCriticalExtension extends ChainValidationResult
  
  /** A certificate in the chain is not trusted. */
  @js.native
  sealed trait untrusted extends ChainValidationResult
  
  /** A certificate in the chain is being used for a purpose other than one specified by its CA. */
  @js.native
  sealed trait wrongUsage extends ChainValidationResult
  
}

