package typings
package winrtLib.WindowsNs.MediaNs.ProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RevocationAndRenewalReasons extends js.Object

@JSGlobal("Windows.Media.Protection.RevocationAndRenewalReasons")
@js.native
object RevocationAndRenewalReasons extends js.Object {
  @js.native
  sealed trait appComponent
    extends winrtLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  @js.native
  sealed trait bootDriverVerificationFailed
    extends winrtLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  @js.native
  sealed trait componentCertificateRevoked
    extends winrtLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  @js.native
  sealed trait componentHighSecurityCertificateRevoked
    extends winrtLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  @js.native
  sealed trait componentLowSecurityCertificateRevoked
    extends winrtLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  @js.native
  sealed trait componentRevoked
    extends winrtLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  @js.native
  sealed trait componentSignedWithTestCertificate
    extends winrtLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  @js.native
  sealed trait encryptionFailure
    extends winrtLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  @js.native
  sealed trait globalRevocationListAbsent
    extends winrtLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  @js.native
  sealed trait globalRevocationListLoadFailed
    extends winrtLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  @js.native
  sealed trait invalidComponentCertificateExtendedKeyUse
    extends winrtLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  @js.native
  sealed trait invalidComponentCertificateRoot
    extends winrtLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  @js.native
  sealed trait invalidGlobalRevocationListSignature
    extends winrtLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  @js.native
  sealed trait kernelModeComponentLoad
    extends winrtLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  @js.native
  sealed trait userModeComponentLoad
    extends winrtLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons
  
  /* 2 */ val appComponent: appComponent with scala.Double = js.native
  /* 12 */ val bootDriverVerificationFailed: bootDriverVerificationFailed with scala.Double = js.native
  /* 8 */ val componentCertificateRevoked: componentCertificateRevoked with scala.Double = js.native
  /* 10 */ val componentHighSecurityCertificateRevoked: componentHighSecurityCertificateRevoked with scala.Double = js.native
  /* 11 */ val componentLowSecurityCertificateRevoked: componentLowSecurityCertificateRevoked with scala.Double = js.native
  /* 6 */ val componentRevoked: componentRevoked with scala.Double = js.native
  /* 13 */ val componentSignedWithTestCertificate: componentSignedWithTestCertificate with scala.Double = js.native
  /* 14 */ val encryptionFailure: encryptionFailure with scala.Double = js.native
  /* 5 */ val globalRevocationListAbsent: globalRevocationListAbsent with scala.Double = js.native
  /* 3 */ val globalRevocationListLoadFailed: globalRevocationListLoadFailed with scala.Double = js.native
  /* 7 */ val invalidComponentCertificateExtendedKeyUse: invalidComponentCertificateExtendedKeyUse with scala.Double = js.native
  /* 9 */ val invalidComponentCertificateRoot: invalidComponentCertificateRoot with scala.Double = js.native
  /* 4 */ val invalidGlobalRevocationListSignature: invalidGlobalRevocationListSignature with scala.Double = js.native
  /* 1 */ val kernelModeComponentLoad: kernelModeComponentLoad with scala.Double = js.native
  /* 0 */ val userModeComponentLoad: userModeComponentLoad with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons with scala.Double
  ] = js.native
}

