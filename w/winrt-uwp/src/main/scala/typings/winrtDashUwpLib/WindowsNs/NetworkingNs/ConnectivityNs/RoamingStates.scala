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
  
  val none: none with java.lang.String = js.native
  val notRoaming: notRoaming with java.lang.String = js.native
  val roaming: roaming with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.RoamingStates with java.lang.String
  ] = js.native
}

