package typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs

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
  
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.RoamingStates.none with Double = js.native
  /* 1 */ val notRoaming: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.RoamingStates.notRoaming with Double = js.native
  /* 2 */ val roaming: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.RoamingStates.roaming with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RoamingStates with Double] = js.native
}

