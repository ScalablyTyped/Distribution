package typings.winrt.Windows.Media.Protection

import org.scalablytyped.runtime.TopLevel
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

