package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mobile broadband account and related information about the network provider for the account. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount")
@js.native
abstract class MobileBroadbandAccount () extends js.Object {
  /** Gets the mobile broadband device information associated with this account. */
  var currentDeviceInformation: MobileBroadbandDeviceInformation = js.native
  /** Gets the Mobile Broadband network object for this account. */
  var currentNetwork: MobileBroadbandNetwork = js.native
  /** Gets a unique identifier for the mobile broadband account. */
  var networkAccountId: java.lang.String = js.native
  /** A unique identifier for the network provider for the mobile broadband account. */
  var serviceProviderGuid: java.lang.String = js.native
  /** The name of the network provider for the mobile broadband account. */
  var serviceProviderName: java.lang.String = js.native
  /**
    * Retrieves an array of ConnectionProfile objects that represent connections associated with the Mobile Broadband account.
    * @return An array of ConnectionProfile objects.
    */
  def getConnectionProfiles(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.ConnectionProfile] = js.native
}

/** Represents a mobile broadband account and related information about the network provider for the account. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount")
@js.native
object MobileBroadbandAccount extends js.Object {
  /** A list of all network account IDs for the network service provider. */
  var availableNetworkAccountIds: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /**
    * Creates a mobile broadband account for the mobile device associated with the supplied network account ID.
    * @param networkAccountId The network account ID to use to select the corresponding mobile broadband device to use for the account.
    * @return A mobile broadband account for the mobile device associated with the supplied network account ID.
    */
  def createFromNetworkAccountId(networkAccountId: java.lang.String): winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccount = js.native
}

