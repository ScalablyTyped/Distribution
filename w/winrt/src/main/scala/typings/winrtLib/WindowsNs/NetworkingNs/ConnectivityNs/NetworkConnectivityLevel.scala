package typings
package winrtLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkConnectivityLevel extends js.Object

@JSGlobal("Windows.Networking.Connectivity.NetworkConnectivityLevel")
@js.native
object NetworkConnectivityLevel extends js.Object {
  @js.native
  sealed trait constrainedInternetAccess
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel
  
  @js.native
  sealed trait internetAccess
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel
  
  @js.native
  sealed trait localAccess
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel
  
  /* 2 */ val constrainedInternetAccess: constrainedInternetAccess with scala.Double = js.native
  /* 3 */ val internetAccess: internetAccess with scala.Double = js.native
  /* 1 */ val localAccess: localAccess with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel with scala.Double
  ] = js.native
}

