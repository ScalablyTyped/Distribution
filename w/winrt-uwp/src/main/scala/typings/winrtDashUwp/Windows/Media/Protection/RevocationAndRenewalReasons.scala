package typings.winrtDashUwp.Windows.Media.Protection

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Protection.RevocationAndRenewalReasons.appComponent
import typings.winrtDashUwp.Windows.Media.Protection.RevocationAndRenewalReasons.bootDriverVerificationFailed
import typings.winrtDashUwp.Windows.Media.Protection.RevocationAndRenewalReasons.componentCertificateRevoked
import typings.winrtDashUwp.Windows.Media.Protection.RevocationAndRenewalReasons.componentHighSecurityCertificateRevoked
import typings.winrtDashUwp.Windows.Media.Protection.RevocationAndRenewalReasons.componentLowSecurityCertificateRevoked
import typings.winrtDashUwp.Windows.Media.Protection.RevocationAndRenewalReasons.componentRevoked
import typings.winrtDashUwp.Windows.Media.Protection.RevocationAndRenewalReasons.componentSignedWithTestCertificate
import typings.winrtDashUwp.Windows.Media.Protection.RevocationAndRenewalReasons.encryptionFailure
import typings.winrtDashUwp.Windows.Media.Protection.RevocationAndRenewalReasons.globalRevocationListAbsent
import typings.winrtDashUwp.Windows.Media.Protection.RevocationAndRenewalReasons.globalRevocationListLoadFailed
import typings.winrtDashUwp.Windows.Media.Protection.RevocationAndRenewalReasons.invalidComponentCertificateExtendedKeyUse
import typings.winrtDashUwp.Windows.Media.Protection.RevocationAndRenewalReasons.invalidComponentCertificateRoot
import typings.winrtDashUwp.Windows.Media.Protection.RevocationAndRenewalReasons.invalidGlobalRevocationListSignature
import typings.winrtDashUwp.Windows.Media.Protection.RevocationAndRenewalReasons.kernelModeComponentLoad
import typings.winrtDashUwp.Windows.Media.Protection.RevocationAndRenewalReasons.userModeComponentLoad
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RevocationAndRenewalReasons with Double] = js.native
  /* 2 */ @js.native
  object appComponent extends TopLevel[appComponent with Double]
  
  /* 12 */ @js.native
  object bootDriverVerificationFailed extends TopLevel[bootDriverVerificationFailed with Double]
  
  /* 8 */ @js.native
  object componentCertificateRevoked extends TopLevel[componentCertificateRevoked with Double]
  
  /* 10 */ @js.native
  object componentHighSecurityCertificateRevoked extends TopLevel[componentHighSecurityCertificateRevoked with Double]
  
  /* 11 */ @js.native
  object componentLowSecurityCertificateRevoked extends TopLevel[componentLowSecurityCertificateRevoked with Double]
  
  /* 6 */ @js.native
  object componentRevoked extends TopLevel[componentRevoked with Double]
  
  /* 13 */ @js.native
  object componentSignedWithTestCertificate extends TopLevel[componentSignedWithTestCertificate with Double]
  
  /* 14 */ @js.native
  object encryptionFailure extends TopLevel[encryptionFailure with Double]
  
  /* 5 */ @js.native
  object globalRevocationListAbsent extends TopLevel[globalRevocationListAbsent with Double]
  
  /* 3 */ @js.native
  object globalRevocationListLoadFailed extends TopLevel[globalRevocationListLoadFailed with Double]
  
  /* 7 */ @js.native
  object invalidComponentCertificateExtendedKeyUse extends TopLevel[invalidComponentCertificateExtendedKeyUse with Double]
  
  /* 9 */ @js.native
  object invalidComponentCertificateRoot extends TopLevel[invalidComponentCertificateRoot with Double]
  
  /* 4 */ @js.native
  object invalidGlobalRevocationListSignature extends TopLevel[invalidGlobalRevocationListSignature with Double]
  
  /* 1 */ @js.native
  object kernelModeComponentLoad extends TopLevel[kernelModeComponentLoad with Double]
  
  /* 0 */ @js.native
  object userModeComponentLoad extends TopLevel[userModeComponentLoad with Double]
  
}

