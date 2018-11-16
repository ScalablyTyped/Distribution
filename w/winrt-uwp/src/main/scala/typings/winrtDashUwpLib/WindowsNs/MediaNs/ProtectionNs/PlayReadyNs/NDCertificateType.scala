package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NDCertificateType extends js.Object

/** Indicates the type and purpose of a PlayReady-ND transmitter license. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDCertificateType")
@js.native
object NDCertificateType extends js.Object {
  /** A leaf level certificate for a PlayReady client. */
  @js.native
  sealed trait application
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType
  
  /** A leaf level certificate used to sign CRLs issued by Microsoft. */
  @js.native
  sealed trait crlSigner
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType
  
  /** A leaf level certificate used by a device. */
  @js.native
  sealed trait device
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType
  
  /** A leaf level certificate used by a PC or a device when a member of a domain. */
  @js.native
  sealed trait domain
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType
  
  /** Can be an issuer of certificates for either an issuer or a leaf certificate. */
  @js.native
  sealed trait issuer
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType
  
  /** A leaf level certificate used by the cryptography server to sign the key file. */
  @js.native
  sealed trait keyFileSigner
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType
  
  /** A certificate used by a license signer. */
  @js.native
  sealed trait licenseSigner
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType
  
  /** A leaf level certificate used by digital rights management clients to encrypt metering data sent to a PlayReady SDK server. */
  @js.native
  sealed trait metering
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType
  
  /** A leaf level certificate used by the PC client. */
  @js.native
  sealed trait pc
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType
  
  /** A leaf level certificate used by the PlayReady server. */
  @js.native
  sealed trait server
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType
  
  /** A leaf level certificate used by services such as Secure Clock. Reserved for future use. */
  @js.native
  sealed trait service
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType
  
  /** A leaf level certificate for a Silverlight client. */
  @js.native
  sealed trait silverlight
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType
  
  /** An unknown certificate type. Apps should never use this value. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType
  
  val application: application with java.lang.String = js.native
  val crlSigner: crlSigner with java.lang.String = js.native
  val device: device with java.lang.String = js.native
  val domain: domain with java.lang.String = js.native
  val issuer: issuer with java.lang.String = js.native
  val keyFileSigner: keyFileSigner with java.lang.String = js.native
  val licenseSigner: licenseSigner with java.lang.String = js.native
  val metering: metering with java.lang.String = js.native
  val pc: pc with java.lang.String = js.native
  val server: server with java.lang.String = js.native
  val service: service with java.lang.String = js.native
  val silverlight: silverlight with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType with java.lang.String
  ] = js.native
}

