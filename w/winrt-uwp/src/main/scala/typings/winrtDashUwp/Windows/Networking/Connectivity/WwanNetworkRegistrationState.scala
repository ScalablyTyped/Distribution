package typings.winrtDashUwp.Windows.Networking.Connectivity

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
  
  /* 6 */ val denied: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState.denied with Double = js.native
  /* 1 */ val deregistered: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState.deregistered with Double = js.native
  /* 3 */ val home: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState.home with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState.none with Double = js.native
  /* 5 */ val partner: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState.partner with Double = js.native
  /* 4 */ val roaming: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState.roaming with Double = js.native
  /* 2 */ val searching: typings.winrtDashUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState.searching with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WwanNetworkRegistrationState with Double] = js.native
}

