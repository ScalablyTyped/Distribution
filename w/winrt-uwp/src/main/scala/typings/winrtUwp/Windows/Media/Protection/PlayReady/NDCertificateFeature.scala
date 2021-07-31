package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NDCertificateFeature extends StObject
/** Indicates the PlayReady-ND feature to which the certificate controls access. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDCertificateFeature")
@js.native
object NDCertificateFeature extends StObject {
  
  /** Device implements anti-rollback clock. */
  @js.native
  sealed trait antiRollBackClock
    extends StObject
       with NDCertificateFeature
  
  /** Entity supports certificate revocation lists. */
  @js.native
  sealed trait crls
    extends StObject
       with NDCertificateFeature
  
  /** Entity supports PlayReady version 3.x features such as per-stream keys. */
  @js.native
  sealed trait playReady3Features
    extends StObject
       with NDCertificateFeature
  
  /** Entity implements receiver functionality. */
  @js.native
  sealed trait receiver
    extends StObject
       with NDCertificateFeature
  
  /** Device implements SecureClock. */
  @js.native
  sealed trait secureClock
    extends StObject
       with NDCertificateFeature
  
  /** Entity shares receiver key across multiple devices. */
  @js.native
  sealed trait sharedCertificate
    extends StObject
       with NDCertificateFeature
  
  /** Entity implements transmitter functionality. */
  @js.native
  sealed trait transmitter
    extends StObject
       with NDCertificateFeature
}
