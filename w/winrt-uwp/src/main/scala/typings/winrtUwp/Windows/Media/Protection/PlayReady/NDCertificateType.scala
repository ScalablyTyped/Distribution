package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NDCertificateType extends StObject
/** Indicates the type and purpose of a PlayReady-ND transmitter license. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDCertificateType")
@js.native
object NDCertificateType extends StObject {
  
  /** A leaf level certificate for a PlayReady client. */
  @js.native
  sealed trait application
    extends StObject
       with NDCertificateType
  
  /** A leaf level certificate used to sign CRLs issued by Microsoft. */
  @js.native
  sealed trait crlSigner
    extends StObject
       with NDCertificateType
  
  /** A leaf level certificate used by a device. */
  @js.native
  sealed trait device
    extends StObject
       with NDCertificateType
  
  /** A leaf level certificate used by a PC or a device when a member of a domain. */
  @js.native
  sealed trait domain
    extends StObject
       with NDCertificateType
  
  /** Can be an issuer of certificates for either an issuer or a leaf certificate. */
  @js.native
  sealed trait issuer
    extends StObject
       with NDCertificateType
  
  /** A leaf level certificate used by the cryptography server to sign the key file. */
  @js.native
  sealed trait keyFileSigner
    extends StObject
       with NDCertificateType
  
  /** A certificate used by a license signer. */
  @js.native
  sealed trait licenseSigner
    extends StObject
       with NDCertificateType
  
  /** A leaf level certificate used by digital rights management clients to encrypt metering data sent to a PlayReady SDK server. */
  @js.native
  sealed trait metering
    extends StObject
       with NDCertificateType
  
  /** A leaf level certificate used by the PC client. */
  @js.native
  sealed trait pc
    extends StObject
       with NDCertificateType
  
  /** A leaf level certificate used by the PlayReady server. */
  @js.native
  sealed trait server
    extends StObject
       with NDCertificateType
  
  /** A leaf level certificate used by services such as Secure Clock. Reserved for future use. */
  @js.native
  sealed trait service
    extends StObject
       with NDCertificateType
  
  /** A leaf level certificate for a Silverlight client. */
  @js.native
  sealed trait silverlight
    extends StObject
       with NDCertificateType
  
  /** An unknown certificate type. Apps should never use this value. */
  @js.native
  sealed trait unknown
    extends StObject
       with NDCertificateType
}
