package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains provisioning information about a Wi-Fi Direct Service. */
@js.native
trait WiFiDirectServiceProvisioningInfo extends js.Object {
  /** Gets a value indicating whether Wi-Fi Direct Point to Point (P2P) group formation is needed. */
  var isGroupFormationNeeded: Boolean = js.native
  /** Gets a value describing the configuration method in use. */
  var selectedConfigurationMethod: WiFiDirectServiceConfigurationMethod = js.native
}

object WiFiDirectServiceProvisioningInfo {
  @scala.inline
  def apply(isGroupFormationNeeded: Boolean, selectedConfigurationMethod: WiFiDirectServiceConfigurationMethod): WiFiDirectServiceProvisioningInfo = {
    val __obj = js.Dynamic.literal(isGroupFormationNeeded = isGroupFormationNeeded.asInstanceOf[js.Any], selectedConfigurationMethod = selectedConfigurationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectServiceProvisioningInfo]
  }
  @scala.inline
  implicit class WiFiDirectServiceProvisioningInfoOps[Self <: WiFiDirectServiceProvisioningInfo] (val x: Self) extends AnyVal {
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
    def setIsGroupFormationNeeded(value: Boolean): Self = this.set("isGroupFormationNeeded", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedConfigurationMethod(value: WiFiDirectServiceConfigurationMethod): Self = this.set("selectedConfigurationMethod", value.asInstanceOf[js.Any])
  }
  
}

