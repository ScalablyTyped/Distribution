package typings.winrtDashUwp.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.basicConstraintsError
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.expired
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.incompleteChain
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.invalidCertificateAuthorityPolicy
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.invalidName
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.invalidSignature
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.otherErrors
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.revocationFailure
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.revocationInformationMissing
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.revoked
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.success
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.unknownCriticalExtension
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.untrusted
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.wrongUsage
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChainValidationResult with Double] = js.native
  /* 9 */ @js.native
  object basicConstraintsError extends TopLevel[basicConstraintsError with Double]
  
  /* 3 */ @js.native
  object expired extends TopLevel[expired with Double]
  
  /* 4 */ @js.native
  object incompleteChain extends TopLevel[incompleteChain with Double]
  
  /* 8 */ @js.native
  object invalidCertificateAuthorityPolicy extends TopLevel[invalidCertificateAuthorityPolicy with Double]
  
  /* 7 */ @js.native
  object invalidName extends TopLevel[invalidName with Double]
  
  /* 5 */ @js.native
  object invalidSignature extends TopLevel[invalidSignature with Double]
  
  /* 13 */ @js.native
  object otherErrors extends TopLevel[otherErrors with Double]
  
  /* 12 */ @js.native
  object revocationFailure extends TopLevel[revocationFailure with Double]
  
  /* 11 */ @js.native
  object revocationInformationMissing extends TopLevel[revocationInformationMissing with Double]
  
  /* 2 */ @js.native
  object revoked extends TopLevel[revoked with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 10 */ @js.native
  object unknownCriticalExtension extends TopLevel[unknownCriticalExtension with Double]
  
  /* 1 */ @js.native
  object untrusted extends TopLevel[untrusted with Double]
  
  /* 6 */ @js.native
  object wrongUsage extends TopLevel[wrongUsage with Double]
  
}

