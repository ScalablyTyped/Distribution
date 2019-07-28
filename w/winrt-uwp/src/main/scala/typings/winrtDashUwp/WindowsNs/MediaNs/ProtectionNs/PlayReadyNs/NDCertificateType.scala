package typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

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
  sealed trait application extends NDCertificateType
  
  /** A leaf level certificate used to sign CRLs issued by Microsoft. */
  @js.native
  sealed trait crlSigner extends NDCertificateType
  
  /** A leaf level certificate used by a device. */
  @js.native
  sealed trait device extends NDCertificateType
  
  /** A leaf level certificate used by a PC or a device when a member of a domain. */
  @js.native
  sealed trait domain extends NDCertificateType
  
  /** Can be an issuer of certificates for either an issuer or a leaf certificate. */
  @js.native
  sealed trait issuer extends NDCertificateType
  
  /** A leaf level certificate used by the cryptography server to sign the key file. */
  @js.native
  sealed trait keyFileSigner extends NDCertificateType
  
  /** A certificate used by a license signer. */
  @js.native
  sealed trait licenseSigner extends NDCertificateType
  
  /** A leaf level certificate used by digital rights management clients to encrypt metering data sent to a PlayReady SDK server. */
  @js.native
  sealed trait metering extends NDCertificateType
  
  /** A leaf level certificate used by the PC client. */
  @js.native
  sealed trait pc extends NDCertificateType
  
  /** A leaf level certificate used by the PlayReady server. */
  @js.native
  sealed trait server extends NDCertificateType
  
  /** A leaf level certificate used by services such as Secure Clock. Reserved for future use. */
  @js.native
  sealed trait service extends NDCertificateType
  
  /** A leaf level certificate for a Silverlight client. */
  @js.native
  sealed trait silverlight extends NDCertificateType
  
  /** An unknown certificate type. Apps should never use this value. */
  @js.native
  sealed trait unknown extends NDCertificateType
  
  /* 8 */ val application: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType.application with Double = js.native
  /* 5 */ val crlSigner: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType.crlSigner with Double = js.native
  /* 2 */ val device: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType.device with Double = js.native
  /* 3 */ val domain: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType.domain with Double = js.native
  /* 4 */ val issuer: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType.issuer with Double = js.native
  /* 10 */ val keyFileSigner: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType.keyFileSigner with Double = js.native
  /* 12 */ val licenseSigner: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType.licenseSigner with Double = js.native
  /* 9 */ val metering: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType.metering with Double = js.native
  /* 1 */ val pc: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType.pc with Double = js.native
  /* 11 */ val server: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType.server with Double = js.native
  /* 6 */ val service: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType.service with Double = js.native
  /* 7 */ val silverlight: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType.silverlight with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateType.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NDCertificateType with Double] = js.native
}

