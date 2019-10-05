package typings.winrt.Windows.Networking.Connectivity

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
  
  /* 2 */ val constrainedInternetAccess: typings.winrt.Windows.Networking.Connectivity.NetworkConnectivityLevel.constrainedInternetAccess with Double = js.native
  /* 3 */ val internetAccess: typings.winrt.Windows.Networking.Connectivity.NetworkConnectivityLevel.internetAccess with Double = js.native
  /* 1 */ val localAccess: typings.winrt.Windows.Networking.Connectivity.NetworkConnectivityLevel.localAccess with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.Networking.Connectivity.NetworkConnectivityLevel.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkConnectivityLevel with Double] = js.native
}

