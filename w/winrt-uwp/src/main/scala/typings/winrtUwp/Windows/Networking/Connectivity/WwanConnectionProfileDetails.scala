package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to access information specific to a WWAN connection. */
trait WwanConnectionProfileDetails extends js.Object {
  /** Indicates the name of the access point used to establish the WWAN connection. */
  var accessPointName: String
  /** Indicates the Home Network Provider ID. */
  var homeProviderId: String
  /**
    * Indicates the class of data service offered by the network currently in use for the WWAN connection.
    * @return The class of data service currently provided.
    */
  def getCurrentDataClass(): WwanDataClass
  /**
    * Retrieves the current network registration state for the WWAN connection.
    * @return The current network registration state.
    */
  def getNetworkRegistrationState(): WwanNetworkRegistrationState
}

object WwanConnectionProfileDetails {
  @scala.inline
  def apply(
    accessPointName: String,
    getCurrentDataClass: () => WwanDataClass,
    getNetworkRegistrationState: () => WwanNetworkRegistrationState,
    homeProviderId: String
  ): WwanConnectionProfileDetails = {
    val __obj = js.Dynamic.literal(accessPointName = accessPointName.asInstanceOf[js.Any], getCurrentDataClass = js.Any.fromFunction0(getCurrentDataClass), getNetworkRegistrationState = js.Any.fromFunction0(getNetworkRegistrationState), homeProviderId = homeProviderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WwanConnectionProfileDetails]
  }
}

