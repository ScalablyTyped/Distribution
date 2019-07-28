package typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs

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
  sealed trait doNotCare extends TriStates
  
  /** The corresponding state is not set. */
  @js.native
  sealed trait no extends TriStates
  
  /** The corresponding state is set. */
  @js.native
  sealed trait yes extends TriStates
  
  /* 0 */ val doNotCare: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.TriStates.doNotCare with Double = js.native
  /* 1 */ val no: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.TriStates.no with Double = js.native
  /* 2 */ val yes: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.TriStates.yes with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TriStates with Double] = js.native
}

