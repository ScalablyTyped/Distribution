package typings.winrtDashUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoamingStates extends js.Object

/** Defines the roaming states. */
@JSGlobal("Windows.Networking.Connectivity.RoamingStates")
@js.native
object RoamingStates extends js.Object {
  /** No roaming information. */
  @js.native
  sealed trait none extends RoamingStates
  
  /** The connection is not currently roaming. */
  @js.native
  sealed trait notRoaming extends RoamingStates
  
  /** The connection is currently roaming. */
  @js.native
  sealed trait roaming extends RoamingStates
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RoamingStates with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object notRoaming extends TopLevel[notRoaming with Double]
  
  /* 2 */ @js.native
  object roaming extends TopLevel[roaming with Double]
  
}

