package typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs

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
  sealed trait denied extends WwanNetworkRegistrationState
  
  /** The connection is not registered with a network. */
  @js.native
  sealed trait deregistered extends WwanNetworkRegistrationState
  
  /** The connection is registered with a home network. */
  @js.native
  sealed trait home extends WwanNetworkRegistrationState
  
  /** No networks found for this connection. */
  @js.native
  sealed trait none extends WwanNetworkRegistrationState
  
  /** The connection is registered with a roaming network partner. */
  @js.native
  sealed trait partner extends WwanNetworkRegistrationState
  
  /** The connection is registered with a roaming network. */
  @js.native
  sealed trait roaming extends WwanNetworkRegistrationState
  
  /** Searching for available networks. */
  @js.native
  sealed trait searching extends WwanNetworkRegistrationState
  
  /* 6 */ val denied: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.WwanNetworkRegistrationState.denied with Double = js.native
  /* 1 */ val deregistered: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.WwanNetworkRegistrationState.deregistered with Double = js.native
  /* 3 */ val home: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.WwanNetworkRegistrationState.home with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.WwanNetworkRegistrationState.none with Double = js.native
  /* 5 */ val partner: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.WwanNetworkRegistrationState.partner with Double = js.native
  /* 4 */ val roaming: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.WwanNetworkRegistrationState.roaming with Double = js.native
  /* 2 */ val searching: typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs.WwanNetworkRegistrationState.searching with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WwanNetworkRegistrationState with Double] = js.native
}

