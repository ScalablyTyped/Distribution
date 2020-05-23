package typings.winrtUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NDCertificateFeature extends js.Object

/** Indicates the PlayReady-ND feature to which the certificate controls access. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDCertificateFeature")
@js.native
object NDCertificateFeature extends js.Object {
  /** Device implements anti-rollback clock. */
  @js.native
  sealed trait antiRollBackClock extends NDCertificateFeature
  
  /** Entity supports certificate revocation lists. */
  @js.native
  sealed trait crls extends NDCertificateFeature
  
  /** Entity supports PlayReady version 3.x features such as per-stream keys. */
  @js.native
  sealed trait playReady3Features extends NDCertificateFeature
  
  /** Entity implements receiver functionality. */
  @js.native
  sealed trait receiver extends NDCertificateFeature
  
  /** Device implements SecureClock. */
  @js.native
  sealed trait secureClock extends NDCertificateFeature
  
  /** Entity shares receiver key across multiple devices. */
  @js.native
  sealed trait sharedCertificate extends NDCertificateFeature
  
  /** Entity implements transmitter functionality. */
  @js.native
  sealed trait transmitter extends NDCertificateFeature
  
}

