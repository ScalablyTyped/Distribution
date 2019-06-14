package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

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
  sealed trait constrainedInternetAccess
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel
  
  /** Local and Internet access. */
  @js.native
  sealed trait internetAccess
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel
  
  /** Local network access only. */
  @js.native
  sealed trait localAccess
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel
  
  /** No connectivity. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel
  
  /* 2 */ val constrainedInternetAccess: constrainedInternetAccess with scala.Double = js.native
  /* 3 */ val internetAccess: internetAccess with scala.Double = js.native
  /* 1 */ val localAccess: localAccess with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel with scala.Double
  ] = js.native
}

