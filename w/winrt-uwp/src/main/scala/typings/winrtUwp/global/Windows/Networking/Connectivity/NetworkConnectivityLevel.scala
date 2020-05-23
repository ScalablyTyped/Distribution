package typings.winrtUwp.global.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the level of connectivity currently available. */
@JSGlobal("Windows.Networking.Connectivity.NetworkConnectivityLevel")
@js.native
object NetworkConnectivityLevel extends js.Object {
  /* 2 */ val constrainedInternetAccess: typings.winrtUwp.Windows.Networking.Connectivity.NetworkConnectivityLevel.constrainedInternetAccess with Double = js.native
  /* 3 */ val internetAccess: typings.winrtUwp.Windows.Networking.Connectivity.NetworkConnectivityLevel.internetAccess with Double = js.native
  /* 1 */ val localAccess: typings.winrtUwp.Windows.Networking.Connectivity.NetworkConnectivityLevel.localAccess with Double = js.native
  /* 0 */ val none: typings.winrtUwp.Windows.Networking.Connectivity.NetworkConnectivityLevel.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Networking.Connectivity.NetworkConnectivityLevel with Double
  ] = js.native
}

