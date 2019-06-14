package typings
package winrtLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoamingStates extends js.Object

@JSGlobal("Windows.Networking.Connectivity.RoamingStates")
@js.native
object RoamingStates extends js.Object {
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.RoamingStates
  
  @js.native
  sealed trait notRoaming
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.RoamingStates
  
  @js.native
  sealed trait roaming
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.RoamingStates
  
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val notRoaming: notRoaming with scala.Double = js.native
  /* 2 */ val roaming: roaming with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.RoamingStates with scala.Double] = js.native
}

