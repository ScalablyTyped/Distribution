package typings.winrt.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RevocationAndRenewalReasons extends js.Object

@JSGlobal("Windows.Media.Protection.RevocationAndRenewalReasons")
@js.native
object RevocationAndRenewalReasons extends js.Object {
  @js.native
  sealed trait appComponent extends RevocationAndRenewalReasons
  
  @js.native
  sealed trait bootDriverVerificationFailed extends RevocationAndRenewalReasons
  
  @js.native
  sealed trait componentCertificateRevoked extends RevocationAndRenewalReasons
  
  @js.native
  sealed trait componentHighSecurityCertificateRevoked extends RevocationAndRenewalReasons
  
  @js.native
  sealed trait componentLowSecurityCertificateRevoked extends RevocationAndRenewalReasons
  
  @js.native
  sealed trait componentRevoked extends RevocationAndRenewalReasons
  
  @js.native
  sealed trait componentSignedWithTestCertificate extends RevocationAndRenewalReasons
  
  @js.native
  sealed trait encryptionFailure extends RevocationAndRenewalReasons
  
  @js.native
  sealed trait globalRevocationListAbsent extends RevocationAndRenewalReasons
  
  @js.native
  sealed trait globalRevocationListLoadFailed extends RevocationAndRenewalReasons
  
  @js.native
  sealed trait invalidComponentCertificateExtendedKeyUse extends RevocationAndRenewalReasons
  
  @js.native
  sealed trait invalidComponentCertificateRoot extends RevocationAndRenewalReasons
  
  @js.native
  sealed trait invalidGlobalRevocationListSignature extends RevocationAndRenewalReasons
  
  @js.native
  sealed trait kernelModeComponentLoad extends RevocationAndRenewalReasons
  
  @js.native
  sealed trait userModeComponentLoad extends RevocationAndRenewalReasons
  
  /* 2 */ val appComponent: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.appComponent with Double = js.native
  /* 12 */ val bootDriverVerificationFailed: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.bootDriverVerificationFailed with Double = js.native
  /* 8 */ val componentCertificateRevoked: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.componentCertificateRevoked with Double = js.native
  /* 10 */ val componentHighSecurityCertificateRevoked: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.componentHighSecurityCertificateRevoked with Double = js.native
  /* 11 */ val componentLowSecurityCertificateRevoked: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.componentLowSecurityCertificateRevoked with Double = js.native
  /* 6 */ val componentRevoked: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.componentRevoked with Double = js.native
  /* 13 */ val componentSignedWithTestCertificate: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.componentSignedWithTestCertificate with Double = js.native
  /* 14 */ val encryptionFailure: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.encryptionFailure with Double = js.native
  /* 5 */ val globalRevocationListAbsent: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.globalRevocationListAbsent with Double = js.native
  /* 3 */ val globalRevocationListLoadFailed: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.globalRevocationListLoadFailed with Double = js.native
  /* 7 */ val invalidComponentCertificateExtendedKeyUse: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.invalidComponentCertificateExtendedKeyUse with Double = js.native
  /* 9 */ val invalidComponentCertificateRoot: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.invalidComponentCertificateRoot with Double = js.native
  /* 4 */ val invalidGlobalRevocationListSignature: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.invalidGlobalRevocationListSignature with Double = js.native
  /* 1 */ val kernelModeComponentLoad: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.kernelModeComponentLoad with Double = js.native
  /* 0 */ val userModeComponentLoad: typings.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.userModeComponentLoad with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RevocationAndRenewalReasons with Double] = js.native
}

