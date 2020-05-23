package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details about the mobile broadband modem configuration. */
trait MobileBroadbandModemConfiguration extends js.Object {
  /** Gets the home provider ID associated with the mobile broadband modem. */
  var homeProviderId: String
  /** Gets the home provider name for the mobile broadband modem. */
  var homeProviderName: String
  /** Gets an object representing the Universal Integrated Circuit Card (UICC), commonly called a "SIM card", associated with the mobile broadband modem. */
  var uicc: MobileBroadbandUicc
}

object MobileBroadbandModemConfiguration {
  @scala.inline
  def apply(homeProviderId: String, homeProviderName: String, uicc: MobileBroadbandUicc): MobileBroadbandModemConfiguration = {
    val __obj = js.Dynamic.literal(homeProviderId = homeProviderId.asInstanceOf[js.Any], homeProviderName = homeProviderName.asInstanceOf[js.Any], uicc = uicc.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandModemConfiguration]
  }
}

