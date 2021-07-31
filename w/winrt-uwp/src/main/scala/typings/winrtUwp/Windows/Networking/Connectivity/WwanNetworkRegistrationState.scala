package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WwanNetworkRegistrationState extends StObject
/** Defines the network registration states for a WWAN connection. */
@JSGlobal("Windows.Networking.Connectivity.WwanNetworkRegistrationState")
@js.native
object WwanNetworkRegistrationState extends StObject {
  
  /** Registration of the connection with all available networks is denied. However, emergency voice calls may still be made. This value applies only to voice connections, and not to data connections. */
  @js.native
  sealed trait denied
    extends StObject
       with WwanNetworkRegistrationState
  
  /** The connection is not registered with a network. */
  @js.native
  sealed trait deregistered
    extends StObject
       with WwanNetworkRegistrationState
  
  /** The connection is registered with a home network. */
  @js.native
  sealed trait home
    extends StObject
       with WwanNetworkRegistrationState
  
  /** No networks found for this connection. */
  @js.native
  sealed trait none
    extends StObject
       with WwanNetworkRegistrationState
  
  /** The connection is registered with a roaming network partner. */
  @js.native
  sealed trait partner
    extends StObject
       with WwanNetworkRegistrationState
  
  /** The connection is registered with a roaming network. */
  @js.native
  sealed trait roaming
    extends StObject
       with WwanNetworkRegistrationState
  
  /** Searching for available networks. */
  @js.native
  sealed trait searching
    extends StObject
       with WwanNetworkRegistrationState
}
