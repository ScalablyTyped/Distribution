package typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkConnectivityLevel extends js.Object

@JSGlobal("Windows.Networking.Connectivity.NetworkConnectivityLevel")
@js.native
object NetworkConnectivityLevel extends js.Object {
  @js.native
  sealed trait constrainedInternetAccess extends NetworkConnectivityLevel
  
  @js.native
  sealed trait internetAccess extends NetworkConnectivityLevel
  
  @js.native
  sealed trait localAccess extends NetworkConnectivityLevel
  
  @js.native
  sealed trait none extends NetworkConnectivityLevel
  
  /* 2 */ val constrainedInternetAccess: typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel.constrainedInternetAccess with Double = js.native
  /* 3 */ val internetAccess: typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel.internetAccess with Double = js.native
  /* 1 */ val localAccess: typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel.localAccess with Double = js.native
  /* 0 */ val none: typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs.NetworkConnectivityLevel.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkConnectivityLevel with Double] = js.native
}

