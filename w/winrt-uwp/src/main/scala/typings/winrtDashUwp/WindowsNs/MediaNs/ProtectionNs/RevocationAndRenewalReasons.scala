package typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs

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
  sealed trait appComponent extends RevocationAndRenewalReasons
  
  /** A boot driver could not be verified. */
  @js.native
  sealed trait bootDriverVerificationFailed extends RevocationAndRenewalReasons
  
  /** A certificate in a trusted component's certificate chain was revoked. */
  @js.native
  sealed trait componentCertificateRevoked extends RevocationAndRenewalReasons
  
  /** The high-security certificate for authenticating the protected environment (PE) was revoked. */
  @js.native
  sealed trait componentHighSecurityCertificateRevoked extends RevocationAndRenewalReasons
  
  /** The low-security certificate for authenticating the PE was revoked. */
  @js.native
  sealed trait componentLowSecurityCertificateRevoked extends RevocationAndRenewalReasons
  
  /** A trusted component was revoked. */
  @js.native
  sealed trait componentRevoked extends RevocationAndRenewalReasons
  
  /** A component was signed by a test certificate. */
  @js.native
  sealed trait componentSignedWithTestCertificate extends RevocationAndRenewalReasons
  
  /** A certificate chain was not well-formed, or a boot driver is unsigned or is signed with an untrusted certificate. */
  @js.native
  sealed trait encryptionFailure extends RevocationAndRenewalReasons
  
  /** The GRL was not found. */
  @js.native
  sealed trait globalRevocationListAbsent extends RevocationAndRenewalReasons
  
  /** Could not load the global revocation list (GRL). */
  @js.native
  sealed trait globalRevocationListLoadFailed extends RevocationAndRenewalReasons
  
  /** A certificate's extended key usage (EKU) object is invalid. */
  @js.native
  sealed trait invalidComponentCertificateExtendedKeyUse extends RevocationAndRenewalReasons
  
  /** The root certificate is not valid. */
  @js.native
  sealed trait invalidComponentCertificateRoot extends RevocationAndRenewalReasons
  
  /** The GRL signature is invalid. */
  @js.native
  sealed trait invalidGlobalRevocationListSignature extends RevocationAndRenewalReasons
  
  /** Kernel-mode component. */
  @js.native
  sealed trait kernelModeComponentLoad extends RevocationAndRenewalReasons
  
  /** User-mode component. */
  @js.native
  sealed trait userModeComponentLoad extends RevocationAndRenewalReasons
  
  /* 2 */ val appComponent: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons.appComponent with Double = js.native
  /* 12 */ val bootDriverVerificationFailed: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons.bootDriverVerificationFailed with Double = js.native
  /* 8 */ val componentCertificateRevoked: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons.componentCertificateRevoked with Double = js.native
  /* 10 */ val componentHighSecurityCertificateRevoked: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons.componentHighSecurityCertificateRevoked with Double = js.native
  /* 11 */ val componentLowSecurityCertificateRevoked: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons.componentLowSecurityCertificateRevoked with Double = js.native
  /* 6 */ val componentRevoked: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons.componentRevoked with Double = js.native
  /* 13 */ val componentSignedWithTestCertificate: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons.componentSignedWithTestCertificate with Double = js.native
  /* 14 */ val encryptionFailure: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons.encryptionFailure with Double = js.native
  /* 5 */ val globalRevocationListAbsent: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons.globalRevocationListAbsent with Double = js.native
  /* 3 */ val globalRevocationListLoadFailed: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons.globalRevocationListLoadFailed with Double = js.native
  /* 7 */ val invalidComponentCertificateExtendedKeyUse: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons.invalidComponentCertificateExtendedKeyUse with Double = js.native
  /* 9 */ val invalidComponentCertificateRoot: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons.invalidComponentCertificateRoot with Double = js.native
  /* 4 */ val invalidGlobalRevocationListSignature: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons.invalidGlobalRevocationListSignature with Double = js.native
  /* 1 */ val kernelModeComponentLoad: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons.kernelModeComponentLoad with Double = js.native
  /* 0 */ val userModeComponentLoad: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons.userModeComponentLoad with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RevocationAndRenewalReasons with Double] = js.native
}

