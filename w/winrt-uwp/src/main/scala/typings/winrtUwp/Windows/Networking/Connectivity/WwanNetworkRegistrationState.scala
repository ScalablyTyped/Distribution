package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WwanNetworkRegistrationState with Double] = js.native
  /* 6 */ @js.native
  object denied extends TopLevel[denied with Double]
  
  /* 1 */ @js.native
  object deregistered extends TopLevel[deregistered with Double]
  
  /* 3 */ @js.native
  object home extends TopLevel[home with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 5 */ @js.native
  object partner extends TopLevel[partner with Double]
  
  /* 4 */ @js.native
  object roaming extends TopLevel[roaming with Double]
  
  /* 2 */ @js.native
  object searching extends TopLevel[searching with Double]
  
}

