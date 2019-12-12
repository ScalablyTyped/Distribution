package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificateType.application
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificateType.crlSigner
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificateType.device
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificateType.domain
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificateType.issuer
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificateType.keyFileSigner
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificateType.licenseSigner
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificateType.metering
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificateType.pc
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificateType.server
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificateType.service
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificateType.silverlight
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificateType.unknown
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NDCertificateType with Double] = js.native
  /* 8 */ @js.native
  object application extends TopLevel[application with Double]
  
  /* 5 */ @js.native
  object crlSigner extends TopLevel[crlSigner with Double]
  
  /* 2 */ @js.native
  object device extends TopLevel[device with Double]
  
  /* 3 */ @js.native
  object domain extends TopLevel[domain with Double]
  
  /* 4 */ @js.native
  object issuer extends TopLevel[issuer with Double]
  
  /* 10 */ @js.native
  object keyFileSigner extends TopLevel[keyFileSigner with Double]
  
  /* 12 */ @js.native
  object licenseSigner extends TopLevel[licenseSigner with Double]
  
  /* 9 */ @js.native
  object metering extends TopLevel[metering with Double]
  
  /* 1 */ @js.native
  object pc extends TopLevel[pc with Double]
  
  /* 11 */ @js.native
  object server extends TopLevel[server with Double]
  
  /* 6 */ @js.native
  object service extends TopLevel[service with Double]
  
  /* 7 */ @js.native
  object silverlight extends TopLevel[silverlight with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

