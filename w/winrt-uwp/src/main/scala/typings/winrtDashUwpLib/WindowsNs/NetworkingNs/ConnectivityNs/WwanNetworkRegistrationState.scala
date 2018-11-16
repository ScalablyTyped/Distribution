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
  
  val denied: denied with java.lang.String = js.native
  val deregistered: deregistered with java.lang.String = js.native
  val home: home with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val partner: partner with java.lang.String = js.native
  val roaming: roaming with java.lang.String = js.native
  val searching: searching with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.WwanNetworkRegistrationState with java.lang.String
  ] = js.native
}

