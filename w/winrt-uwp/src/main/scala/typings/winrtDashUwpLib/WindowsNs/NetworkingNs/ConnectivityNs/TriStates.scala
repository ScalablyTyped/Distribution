package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TriStates extends js.Object

/** Used with the NetworkUsageStates structure to define the desired roaming state and shared state of a network connection. */
@JSGlobal("Windows.Networking.Connectivity.TriStates")
@js.native
object TriStates extends js.Object {
  /** Used when the corresponding state should not be used as a filter, e.g., both yes and no. */
  @js.native
  sealed trait doNotCare
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.TriStates
  
  /** The corresponding state is not set. */
  @js.native
  sealed trait no
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.TriStates
  
  /** The corresponding state is set. */
  @js.native
  sealed trait yes
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.TriStates
  
  /* 0 */ val doNotCare: doNotCare with scala.Double = js.native
  /* 1 */ val no: no with scala.Double = js.native
  /* 2 */ val yes: yes with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.TriStates with scala.Double
  ] = js.native
}

