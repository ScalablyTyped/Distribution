package typings.winrt.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RevocationAndRenewalReasons extends StObject
@JSGlobal("Windows.Media.Protection.RevocationAndRenewalReasons")
@js.native
object RevocationAndRenewalReasons extends StObject {
  
  @js.native
  sealed trait appComponent
    extends StObject
       with RevocationAndRenewalReasons
  
  @js.native
  sealed trait bootDriverVerificationFailed
    extends StObject
       with RevocationAndRenewalReasons
  
  @js.native
  sealed trait componentCertificateRevoked
    extends StObject
       with RevocationAndRenewalReasons
  
  @js.native
  sealed trait componentHighSecurityCertificateRevoked
    extends StObject
       with RevocationAndRenewalReasons
  
  @js.native
  sealed trait componentLowSecurityCertificateRevoked
    extends StObject
       with RevocationAndRenewalReasons
  
  @js.native
  sealed trait componentRevoked
    extends StObject
       with RevocationAndRenewalReasons
  
  @js.native
  sealed trait componentSignedWithTestCertificate
    extends StObject
       with RevocationAndRenewalReasons
  
  @js.native
  sealed trait encryptionFailure
    extends StObject
       with RevocationAndRenewalReasons
  
  @js.native
  sealed trait globalRevocationListAbsent
    extends StObject
       with RevocationAndRenewalReasons
  
  @js.native
  sealed trait globalRevocationListLoadFailed
    extends StObject
       with RevocationAndRenewalReasons
  
  @js.native
  sealed trait invalidComponentCertificateExtendedKeyUse
    extends StObject
       with RevocationAndRenewalReasons
  
  @js.native
  sealed trait invalidComponentCertificateRoot
    extends StObject
       with RevocationAndRenewalReasons
  
  @js.native
  sealed trait invalidGlobalRevocationListSignature
    extends StObject
       with RevocationAndRenewalReasons
  
  @js.native
  sealed trait kernelModeComponentLoad
    extends StObject
       with RevocationAndRenewalReasons
  
  @js.native
  sealed trait userModeComponentLoad
    extends StObject
       with RevocationAndRenewalReasons
}
