package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NDProximityDetectionType extends js.Object

/** Indicates the transport protocol that the proximity detection process uses. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDProximityDetectionType")
@js.native
object NDProximityDetectionType extends js.Object {
  /** Proximity detection uses the TCP transport protocol. */
  @js.native
  sealed trait tcp extends NDProximityDetectionType
  
  /** Proximity detection can use either UDP or TCP as the transport protocol. */
  @js.native
  sealed trait transportAgnostic extends NDProximityDetectionType
  
  /** Proximity detection uses the UDP transport protocol. */
  @js.native
  sealed trait udp extends NDProximityDetectionType
  
  /* 1 */ val tcp: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDProximityDetectionType.tcp with Double = js.native
  /* 2 */ val transportAgnostic: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDProximityDetectionType.transportAgnostic with Double = js.native
  /* 0 */ val udp: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDProximityDetectionType.udp with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NDProximityDetectionType with Double] = js.native
}

