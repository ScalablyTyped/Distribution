package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NDProximityDetectionType with Double] = js.native
  /* 1 */ @js.native
  object tcp extends TopLevel[tcp with Double]
  
  /* 2 */ @js.native
  object transportAgnostic extends TopLevel[transportAgnostic with Double]
  
  /* 0 */ @js.native
  object udp extends TopLevel[udp with Double]
  
}

