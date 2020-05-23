package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mobile broadband account and related information about the network provider for the account. */
trait MobileBroadbandAccount extends js.Object {
  /** Gets the mobile broadband device information associated with this account. */
  var currentDeviceInformation: MobileBroadbandDeviceInformation
  /** Gets the Mobile Broadband network object for this account. */
  var currentNetwork: MobileBroadbandNetwork
  /** Gets a unique identifier for the mobile broadband account. */
  var networkAccountId: String
  /** A unique identifier for the network provider for the mobile broadband account. */
  var serviceProviderGuid: String
  /** The name of the network provider for the mobile broadband account. */
  var serviceProviderName: String
  /**
    * Retrieves an array of ConnectionProfile objects that represent connections associated with the Mobile Broadband account.
    * @return An array of ConnectionProfile objects.
    */
  def getConnectionProfiles(): IVectorView[ConnectionProfile]
}

object MobileBroadbandAccount {
  @scala.inline
  def apply(
    currentDeviceInformation: MobileBroadbandDeviceInformation,
    currentNetwork: MobileBroadbandNetwork,
    getConnectionProfiles: () => IVectorView[ConnectionProfile],
    networkAccountId: String,
    serviceProviderGuid: String,
    serviceProviderName: String
  ): MobileBroadbandAccount = {
    val __obj = js.Dynamic.literal(currentDeviceInformation = currentDeviceInformation.asInstanceOf[js.Any], currentNetwork = currentNetwork.asInstanceOf[js.Any], getConnectionProfiles = js.Any.fromFunction0(getConnectionProfiles), networkAccountId = networkAccountId.asInstanceOf[js.Any], serviceProviderGuid = serviceProviderGuid.asInstanceOf[js.Any], serviceProviderName = serviceProviderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandAccount]
  }
}

