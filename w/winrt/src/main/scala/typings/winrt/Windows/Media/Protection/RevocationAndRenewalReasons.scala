package typings.winrt.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RevocationAndRenewalReasons extends StObject
@JSGlobal("Windows.Media.Protection.RevocationAndRenewalReasons")
@js.native
object RevocationAndRenewalReasons extends StObject {
  
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
}
