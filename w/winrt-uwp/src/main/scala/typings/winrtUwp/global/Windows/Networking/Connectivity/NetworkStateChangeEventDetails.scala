package typings.winrtUwp.global.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Indicates which properties of a network have changed after a network state change background trigger. */
@JSGlobal("Windows.Networking.Connectivity.NetworkStateChangeEventDetails")
@js.native
abstract class NetworkStateChangeEventDetails ()
  extends typings.winrtUwp.Windows.Networking.Connectivity.NetworkStateChangeEventDetails {
  /** Indicates if a connected network has a new connection cost. */
  /* CompleteClass */
  override var hasNewConnectionCost: Boolean = js.native
  /** Indicates a connected network has a new domain connectivity level. */
  /* CompleteClass */
  override var hasNewDomainConnectivityLevel: Boolean = js.native
  /** Indicates if the list of host names returned by GetHostNames has changed. */
  /* CompleteClass */
  override var hasNewHostNameList: Boolean = js.native
  /** Indicates if the local machine has a new connection profile associated with the current internet connection. */
  /* CompleteClass */
  override var hasNewInternetConnectionProfile: Boolean = js.native
  /** Indicates if the network connectivity level for any connection profiles has changed. */
  /* CompleteClass */
  override var hasNewNetworkConnectivityLevel: Boolean = js.native
  /** Gets a value indicating whether the network state change event shows a new tethering client count. */
  /* CompleteClass */
  override var hasNewTetheringClientCount: Boolean = js.native
  /** Gets a value that indicates whether the tethering operational state has changed. */
  /* CompleteClass */
  override var hasNewTetheringOperationalState: Boolean = js.native
  /** Indicates if the network state change event represents a change to the registration state of a WWAN connection. The current registration state can be retrieved from WwanConnectionProfileDetails.GetNetworkRegistrationState . */
  /* CompleteClass */
  override var hasNewWwanRegistrationState: Boolean = js.native
}

