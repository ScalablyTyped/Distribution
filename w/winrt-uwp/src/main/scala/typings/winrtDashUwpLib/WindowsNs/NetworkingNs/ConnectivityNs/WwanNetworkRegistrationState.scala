package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WwanNetworkRegistrationState extends js.Object

/** Defines the network registration states for a WWAN connection. */
@JSGlobal("Windows.Networking.Connectivity.WwanNetworkRegistrationState")
@js.native
object WwanNetworkRegistrationState extends js.Object {
  /** Registration of the connection with all available networks is denied. However, emergency voice calls may still be made. This value applies only to voice connections, and not to data connections. */
  @js.native
  sealed trait denied
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanNetworkRegistrationState
  
  /** The connection is not registered with a network. */
  @js.native
  sealed trait deregistered
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanNetworkRegistrationState
  
  /** The connection is registered with a home network. */
  @js.native
  sealed trait home
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanNetworkRegistrationState
  
  /** No networks found for this connection. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanNetworkRegistrationState
  
  /** The connection is registered with a roaming network partner. */
  @js.native
  sealed trait partner
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanNetworkRegistrationState
  
  /** The connection is registered with a roaming network. */
  @js.native
  sealed trait roaming
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanNetworkRegistrationState
  
  /** Searching for available networks. */
  @js.native
  sealed trait searching
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanNetworkRegistrationState
  
  /* 6 */ val denied: denied with scala.Double = js.native
  /* 1 */ val deregistered: deregistered with scala.Double = js.native
  /* 3 */ val home: home with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 5 */ val partner: partner with scala.Double = js.native
  /* 4 */ val roaming: roaming with scala.Double = js.native
  /* 2 */ val searching: searching with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanNetworkRegistrationState with scala.Double
  ] = js.native
}

