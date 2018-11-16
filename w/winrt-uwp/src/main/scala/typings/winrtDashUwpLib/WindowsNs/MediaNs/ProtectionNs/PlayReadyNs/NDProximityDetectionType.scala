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
  
  val tcp: tcp with java.lang.String = js.native
  val transportAgnostic: transportAgnostic with java.lang.String = js.native
  val udp: udp with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDProximityDetectionType with java.lang.String
  ] = js.native
}

