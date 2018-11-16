package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

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
  sealed trait basicConstraintsError
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ChainValidationResult
  
  /** A certificate in the chain has expired. */
  @js.native
  sealed trait expired
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ChainValidationResult
  
  /** The certificate chain is missing one or more certificates. */
  @js.native
  sealed trait incompleteChain
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ChainValidationResult
  
  /** A certificate in the chain has a policy that is not valid. */
  @js.native
  sealed trait invalidCertificateAuthorityPolicy
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ChainValidationResult
  
  /** A certificate in the chain has a name that is not valid. The name is either not included in the permitted list or is explicitly excluded. */
  @js.native
  sealed trait invalidName
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ChainValidationResult
  
  /** The signature of a certificate in the chain cannot be verified. */
  @js.native
  sealed trait invalidSignature
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ChainValidationResult
  
  /** An unexpected error occurred while validating the certificate chain. */
  @js.native
  sealed trait otherErrors
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ChainValidationResult
  
  /** Unable to connect to the revocation server. */
  @js.native
  sealed trait revocationFailure
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ChainValidationResult
  
  /** No installed or registered DLL was found to verify revocation. */
  @js.native
  sealed trait revocationInformationMissing
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ChainValidationResult
  
  /** A certificate in the chain has been revoked. */
  @js.native
  sealed trait revoked
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ChainValidationResult
  
  /** The certificate chain was verified. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ChainValidationResult
  
  /** A certificate in the chain contains an unknown extension that is marked "critical". */
  @js.native
  sealed trait unknownCriticalExtension
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ChainValidationResult
  
  /** A certificate in the chain is not trusted. */
  @js.native
  sealed trait untrusted
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ChainValidationResult
  
  /** A certificate in the chain is being used for a purpose other than one specified by its CA. */
  @js.native
  sealed trait wrongUsage
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ChainValidationResult
  
  val basicConstraintsError: basicConstraintsError with java.lang.String = js.native
  val expired: expired with java.lang.String = js.native
  val incompleteChain: incompleteChain with java.lang.String = js.native
  val invalidCertificateAuthorityPolicy: invalidCertificateAuthorityPolicy with java.lang.String = js.native
  val invalidName: invalidName with java.lang.String = js.native
  val invalidSignature: invalidSignature with java.lang.String = js.native
  val otherErrors: otherErrors with java.lang.String = js.native
  val revocationFailure: revocationFailure with java.lang.String = js.native
  val revocationInformationMissing: revocationInformationMissing with java.lang.String = js.native
  val revoked: revoked with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  val unknownCriticalExtension: unknownCriticalExtension with java.lang.String = js.native
  val untrusted: untrusted with java.lang.String = js.native
  val wrongUsage: wrongUsage with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ChainValidationResult with java.lang.String
  ] = js.native
}

