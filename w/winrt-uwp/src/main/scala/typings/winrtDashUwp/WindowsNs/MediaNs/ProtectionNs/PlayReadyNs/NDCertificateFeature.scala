package typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

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
  
  /* 4 */ val antiRollBackClock: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature.antiRollBackClock with Double = js.native
  /* 5 */ val crls: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature.crls with Double = js.native
  /* 6 */ val playReady3Features: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature.playReady3Features with Double = js.native
  /* 1 */ val receiver: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature.receiver with Double = js.native
  /* 3 */ val secureClock: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature.secureClock with Double = js.native
  /* 2 */ val sharedCertificate: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature.sharedCertificate with Double = js.native
  /* 0 */ val transmitter: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature.transmitter with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NDCertificateFeature with Double] = js.native
}

