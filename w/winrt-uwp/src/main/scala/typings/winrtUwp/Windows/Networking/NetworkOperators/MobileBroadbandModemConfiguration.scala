package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details about the mobile broadband modem configuration. */
@js.native
trait MobileBroadbandModemConfiguration extends js.Object {
  /** Gets the home provider ID associated with the mobile broadband modem. */
  var homeProviderId: String = js.native
  /** Gets the home provider name for the mobile broadband modem. */
  var homeProviderName: String = js.native
  /** Gets an object representing the Universal Integrated Circuit Card (UICC), commonly called a "SIM card", associated with the mobile broadband modem. */
  var uicc: MobileBroadbandUicc = js.native
}

object MobileBroadbandModemConfiguration {
  @scala.inline
  def apply(homeProviderId: String, homeProviderName: String, uicc: MobileBroadbandUicc): MobileBroadbandModemConfiguration = {
    val __obj = js.Dynamic.literal(homeProviderId = homeProviderId.asInstanceOf[js.Any], homeProviderName = homeProviderName.asInstanceOf[js.Any], uicc = uicc.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandModemConfiguration]
  }
  @scala.inline
  implicit class MobileBroadbandModemConfigurationOps[Self <: MobileBroadbandModemConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHomeProviderId(value: String): Self = this.set("homeProviderId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHomeProviderName(value: String): Self = this.set("homeProviderName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUicc(value: MobileBroadbandUicc): Self = this.set("uicc", value.asInstanceOf[js.Any])
  }
  
}

