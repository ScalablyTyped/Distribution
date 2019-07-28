package typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkTypes extends js.Object

/** Defines the network connection types. */
@JSGlobal("Windows.Networking.Connectivity.NetworkTypes")
@js.native
object NetworkTypes extends js.Object {
  /** Internet. */
  @js.native
  sealed trait internet extends NetworkTypes
  
  /** No network. */
  @js.native
  sealed trait none extends NetworkTypes
  
  /** Private network. */
  @js.native
  sealed trait privateNetwork extends NetworkTypes
  
  /* 1 */ val internet: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.NetworkTypes.internet with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.NetworkTypes.none with Double = js.native
  /* 2 */ val privateNetwork: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.NetworkTypes.privateNetwork with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkTypes with Double] = js.native
}

