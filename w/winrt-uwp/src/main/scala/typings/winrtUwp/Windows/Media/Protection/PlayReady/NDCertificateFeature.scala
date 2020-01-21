package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NDCertificateFeature with Double] = js.native
  /* 4 */ @js.native
  object antiRollBackClock extends TopLevel[antiRollBackClock with Double]
  
  /* 5 */ @js.native
  object crls extends TopLevel[crls with Double]
  
  /* 6 */ @js.native
  object playReady3Features extends TopLevel[playReady3Features with Double]
  
  /* 1 */ @js.native
  object receiver extends TopLevel[receiver with Double]
  
  /* 3 */ @js.native
  object secureClock extends TopLevel[secureClock with Double]
  
  /* 2 */ @js.native
  object sharedCertificate extends TopLevel[sharedCertificate with Double]
  
  /* 0 */ @js.native
  object transmitter extends TopLevel[transmitter with Double]
  
}

