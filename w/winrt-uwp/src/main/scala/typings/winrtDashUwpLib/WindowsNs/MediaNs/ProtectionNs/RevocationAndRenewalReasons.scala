package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RevocationAndRenewalReasons extends js.Object

/** Defines reasons for the revocation and renewal of a certificate for a media component. */
@JSGlobal("Windows.Media.Protection.RevocationAndRenewalReasons")
@js.native
object RevocationAndRenewalReasons extends js.Object {
  /** App component. */
  @js.native
  sealed trait appComponent
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  /** A boot driver could not be verified. */
  @js.native
  sealed trait bootDriverVerificationFailed
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  /** A certificate in a trusted component's certificate chain was revoked. */
  @js.native
  sealed trait componentCertificateRevoked
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  /** The high-security certificate for authenticating the protected environment (PE) was revoked. */
  @js.native
  sealed trait componentHighSecurityCertificateRevoked
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  /** The low-security certificate for authenticating the PE was revoked. */
  @js.native
  sealed trait componentLowSecurityCertificateRevoked
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  /** A trusted component was revoked. */
  @js.native
  sealed trait componentRevoked
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  /** A component was signed by a test certificate. */
  @js.native
  sealed trait componentSignedWithTestCertificate
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  /** A certificate chain was not well-formed, or a boot driver is unsigned or is signed with an untrusted certificate. */
  @js.native
  sealed trait encryptionFailure
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  /** The GRL was not found. */
  @js.native
  sealed trait globalRevocationListAbsent
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  /** Could not load the global revocation list (GRL). */
  @js.native
  sealed trait globalRevocationListLoadFailed
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  /** A certificate's extended key usage (EKU) object is invalid. */
  @js.native
  sealed trait invalidComponentCertificateExtendedKeyUse
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  /** The root certificate is not valid. */
  @js.native
  sealed trait invalidComponentCertificateRoot
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  /** The GRL signature is invalid. */
  @js.native
  sealed trait invalidGlobalRevocationListSignature
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  /** Kernel-mode component. */
  @js.native
  sealed trait kernelModeComponentLoad
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  /** User-mode component. */
  @js.native
  sealed trait userModeComponentLoad
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  val appComponent: appComponent with java.lang.String = js.native
  val bootDriverVerificationFailed: bootDriverVerificationFailed with java.lang.String = js.native
  val componentCertificateRevoked: componentCertificateRevoked with java.lang.String = js.native
  val componentHighSecurityCertificateRevoked: componentHighSecurityCertificateRevoked with java.lang.String = js.native
  val componentLowSecurityCertificateRevoked: componentLowSecurityCertificateRevoked with java.lang.String = js.native
  val componentRevoked: componentRevoked with java.lang.String = js.native
  val componentSignedWithTestCertificate: componentSignedWithTestCertificate with java.lang.String = js.native
  val encryptionFailure: encryptionFailure with java.lang.String = js.native
  val globalRevocationListAbsent: globalRevocationListAbsent with java.lang.String = js.native
  val globalRevocationListLoadFailed: globalRevocationListLoadFailed with java.lang.String = js.native
  val invalidComponentCertificateExtendedKeyUse: invalidComponentCertificateExtendedKeyUse with java.lang.String = js.native
  val invalidComponentCertificateRoot: invalidComponentCertificateRoot with java.lang.String = js.native
  val invalidGlobalRevocationListSignature: invalidGlobalRevocationListSignature with java.lang.String = js.native
  val kernelModeComponentLoad: kernelModeComponentLoad with java.lang.String = js.native
  val userModeComponentLoad: userModeComponentLoad with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons with java.lang.String
  ] = js.native
}

