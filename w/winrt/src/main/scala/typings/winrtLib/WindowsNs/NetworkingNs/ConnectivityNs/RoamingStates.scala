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
  
  val none: none with java.lang.String = js.native
  val notRoaming: notRoaming with java.lang.String = js.native
  val roaming: roaming with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.RoamingStates with java.lang.String
  ] = js.native
}

