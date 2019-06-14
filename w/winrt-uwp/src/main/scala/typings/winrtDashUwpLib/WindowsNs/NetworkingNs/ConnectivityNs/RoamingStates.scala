package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

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
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.RoamingStates
  
  /** The connection is not currently roaming. */
  @js.native
  sealed trait notRoaming
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.RoamingStates
  
  /** The connection is currently roaming. */
  @js.native
  sealed trait roaming
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.RoamingStates
  
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val notRoaming: notRoaming with scala.Double = js.native
  /* 2 */ val roaming: roaming with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.RoamingStates with scala.Double
  ] = js.native
}

