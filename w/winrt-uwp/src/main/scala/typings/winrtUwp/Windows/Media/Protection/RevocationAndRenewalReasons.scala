package typings.winrtUwp.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RevocationAndRenewalReasons extends StObject
/** Defines reasons for the revocation and renewal of a certificate for a media component. */
@JSGlobal("Windows.Media.Protection.RevocationAndRenewalReasons")
@js.native
object RevocationAndRenewalReasons extends StObject {
  
  /** App component. */
  @js.native
  sealed trait appComponent
    extends StObject
       with RevocationAndRenewalReasons
  
  /** A boot driver could not be verified. */
  @js.native
  sealed trait bootDriverVerificationFailed
    extends StObject
       with RevocationAndRenewalReasons
  
  /** A certificate in a trusted component's certificate chain was revoked. */
  @js.native
  sealed trait componentCertificateRevoked
    extends StObject
       with RevocationAndRenewalReasons
  
  /** The high-security certificate for authenticating the protected environment (PE) was revoked. */
  @js.native
  sealed trait componentHighSecurityCertificateRevoked
    extends StObject
       with RevocationAndRenewalReasons
  
  /** The low-security certificate for authenticating the PE was revoked. */
  @js.native
  sealed trait componentLowSecurityCertificateRevoked
    extends StObject
       with RevocationAndRenewalReasons
  
  /** A trusted component was revoked. */
  @js.native
  sealed trait componentRevoked
    extends StObject
       with RevocationAndRenewalReasons
  
  /** A component was signed by a test certificate. */
  @js.native
  sealed trait componentSignedWithTestCertificate
    extends StObject
       with RevocationAndRenewalReasons
  
  /** A certificate chain was not well-formed, or a boot driver is unsigned or is signed with an untrusted certificate. */
  @js.native
  sealed trait encryptionFailure
    extends StObject
       with RevocationAndRenewalReasons
  
  /** The GRL was not found. */
  @js.native
  sealed trait globalRevocationListAbsent
    extends StObject
       with RevocationAndRenewalReasons
  
  /** Could not load the global revocation list (GRL). */
  @js.native
  sealed trait globalRevocationListLoadFailed
    extends StObject
       with RevocationAndRenewalReasons
  
  /** A certificate's extended key usage (EKU) object is invalid. */
  @js.native
  sealed trait invalidComponentCertificateExtendedKeyUse
    extends StObject
       with RevocationAndRenewalReasons
  
  /** The root certificate is not valid. */
  @js.native
  sealed trait invalidComponentCertificateRoot
    extends StObject
       with RevocationAndRenewalReasons
  
  /** The GRL signature is invalid. */
  @js.native
  sealed trait invalidGlobalRevocationListSignature
    extends StObject
       with RevocationAndRenewalReasons
  
  /** Kernel-mode component. */
  @js.native
  sealed trait kernelModeComponentLoad
    extends StObject
       with RevocationAndRenewalReasons
  
  /** User-mode component. */
  @js.native
  sealed trait userModeComponentLoad
    extends StObject
       with RevocationAndRenewalReasons
}
