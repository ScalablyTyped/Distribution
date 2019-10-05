package typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services

import typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a Wi-Fi Direct Service session request. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionRequest")
@js.native
abstract class WiFiDirectServiceSessionRequest () extends js.Object {
  /** Gets device information for the requesting device. */
  var deviceInformation: DeviceInformation = js.native
  /** Gets information about how provisioning should be performed if the session is established. */
  var provisioningInfo: WiFiDirectServiceProvisioningInfo = js.native
  /** Gets the session information blob associated with this request. */
  var sessionInfo: IBuffer = js.native
  /** Closes the session request. Your server code calls this method to reject a session request. */
  def close(): Unit = js.native
}

