package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NDProximityDetectionType extends StObject
/** Indicates the transport protocol that the proximity detection process uses. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDProximityDetectionType")
@js.native
object NDProximityDetectionType extends StObject {
  
  /** Proximity detection uses the TCP transport protocol. */
  @js.native
  sealed trait tcp
    extends StObject
       with NDProximityDetectionType
  
  /** Proximity detection can use either UDP or TCP as the transport protocol. */
  @js.native
  sealed trait transportAgnostic
    extends StObject
       with NDProximityDetectionType
  
  /** Proximity detection uses the UDP transport protocol. */
  @js.native
  sealed trait udp
    extends StObject
       with NDProximityDetectionType
}
