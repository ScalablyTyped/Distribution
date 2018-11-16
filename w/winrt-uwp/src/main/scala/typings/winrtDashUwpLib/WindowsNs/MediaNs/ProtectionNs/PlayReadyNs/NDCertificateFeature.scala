package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

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
  sealed trait antiRollBackClock
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature
  
  /** Entity supports certificate revocation lists. */
  @js.native
  sealed trait crls
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature
  
  /** Entity supports PlayReady version 3.x features such as per-stream keys. */
  @js.native
  sealed trait playReady3Features
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature
  
  /** Entity implements receiver functionality. */
  @js.native
  sealed trait receiver
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature
  
  /** Device implements SecureClock. */
  @js.native
  sealed trait secureClock
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature
  
  /** Entity shares receiver key across multiple devices. */
  @js.native
  sealed trait sharedCertificate
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature
  
  /** Entity implements transmitter functionality. */
  @js.native
  sealed trait transmitter
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature
  
  val antiRollBackClock: antiRollBackClock with java.lang.String = js.native
  val crls: crls with java.lang.String = js.native
  val playReady3Features: playReady3Features with java.lang.String = js.native
  val receiver: receiver with java.lang.String = js.native
  val secureClock: secureClock with java.lang.String = js.native
  val sharedCertificate: sharedCertificate with java.lang.String = js.native
  val transmitter: transmitter with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature with java.lang.String
  ] = js.native
}

