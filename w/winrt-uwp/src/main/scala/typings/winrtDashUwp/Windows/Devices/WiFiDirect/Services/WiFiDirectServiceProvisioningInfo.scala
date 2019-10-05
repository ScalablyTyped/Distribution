package typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains provisioning information about a Wi-Fi Direct Service. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceProvisioningInfo")
@js.native
abstract class WiFiDirectServiceProvisioningInfo () extends js.Object {
  /** Gets a value indicating whether Wi-Fi Direct Point to Point (P2P) group formation is needed. */
  var isGroupFormationNeeded: Boolean = js.native
  /** Gets a value describing the configuration method in use. */
  var selectedConfigurationMethod: WiFiDirectServiceConfigurationMethod = js.native
}

