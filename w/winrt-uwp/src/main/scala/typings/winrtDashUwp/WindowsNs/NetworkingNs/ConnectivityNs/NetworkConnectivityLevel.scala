package typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkConnectivityLevel extends js.Object

/** Defines the level of connectivity currently available. */
@JSGlobal("Windows.Networking.Connectivity.NetworkConnectivityLevel")
@js.native
object NetworkConnectivityLevel extends js.Object {
  /** Limited internet access. */
  @js.native
  sealed trait constrainedInternetAccess extends NetworkConnectivityLevel
  
  /** Local and Internet access. */
  @js.native
  sealed trait internetAccess extends NetworkConnectivityLevel
  
  /** Local network access only. */
  @js.native
  sealed trait localAccess extends NetworkConnectivityLevel
  
  /** No connectivity. */
  @js.native
  sealed trait none extends NetworkConnectivityLevel
  
  /* 2 */ val constrainedInternetAccess: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel.constrainedInternetAccess with Double = js.native
  /* 3 */ val internetAccess: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel.internetAccess with Double = js.native
  /* 1 */ val localAccess: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel.localAccess with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkConnectivityLevel with Double] = js.native
}

