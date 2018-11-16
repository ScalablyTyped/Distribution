package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a Wi-Fi Direct Service session request. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionRequest")
@js.native
abstract class WiFiDirectServiceSessionRequest () extends js.Object {
  /** Gets device information for the requesting device. */
  var deviceInformation: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation = js.native
  /** Gets information about how provisioning should be performed if the session is established. */
  var provisioningInfo: WiFiDirectServiceProvisioningInfo = js.native
  /** Gets the session information blob associated with this request. */
  var sessionInfo: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Closes the session request. Your server code calls this method to reject a session request. */
  def close(): scala.Unit = js.native
}

