package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

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
  sealed trait tcp
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDProximityDetectionType
  
  /** Proximity detection can use either UDP or TCP as the transport protocol. */
  @js.native
  sealed trait transportAgnostic
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDProximityDetectionType
  
  /** Proximity detection uses the UDP transport protocol. */
  @js.native
  sealed trait udp
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDProximityDetectionType
  
  /* 1 */ val tcp: tcp with scala.Double = js.native
  /* 2 */ val transportAgnostic: transportAgnostic with scala.Double = js.native
  /* 0 */ val udp: udp with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDProximityDetectionType with scala.Double
  ] = js.native
}

