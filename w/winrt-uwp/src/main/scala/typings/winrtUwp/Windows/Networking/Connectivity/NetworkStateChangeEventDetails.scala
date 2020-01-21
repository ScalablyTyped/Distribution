package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Indicates which properties of a network have changed after a network state change background trigger. */
@JSGlobal("Windows.Networking.Connectivity.NetworkStateChangeEventDetails")
@js.native
abstract class NetworkStateChangeEventDetails () extends js.Object {
  /** Indicates if a connected network has a new connection cost. */
  var hasNewConnectionCost: Boolean = js.native
  /** Indicates a connected network has a new domain connectivity level. */
  var hasNewDomainConnectivityLevel: Boolean = js.native
  /** Indicates if the list of host names returned by GetHostNames has changed. */
  var hasNewHostNameList: Boolean = js.native
  /** Indicates if the local machine has a new connection profile associated with the current internet connection. */
  var hasNewInternetConnectionProfile: Boolean = js.native
  /** Indicates if the network connectivity level for any connection profiles has changed. */
  var hasNewNetworkConnectivityLevel: Boolean = js.native
  /** Gets a value indicating whether the network state change event shows a new tethering client count. */
  var hasNewTetheringClientCount: Boolean = js.native
  /** Gets a value that indicates whether the tethering operational state has changed. */
  var hasNewTetheringOperationalState: Boolean = js.native
  /** Indicates if the network state change event represents a change to the registration state of a WWAN connection. The current registration state can be retrieved from WwanConnectionProfileDetails.GetNetworkRegistrationState . */
  var hasNewWwanRegistrationState: Boolean = js.native
}

