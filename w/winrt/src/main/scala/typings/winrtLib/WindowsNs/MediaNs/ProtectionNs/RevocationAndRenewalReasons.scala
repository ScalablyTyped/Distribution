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
    winrtLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalReasons with java.lang.String
  ] = js.native
}

