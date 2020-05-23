package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a Wi-Fi Direct Service session request. */
trait WiFiDirectServiceSessionRequest extends js.Object {
  /** Gets device information for the requesting device. */
  var deviceInformation: DeviceInformation
  /** Gets information about how provisioning should be performed if the session is established. */
  var provisioningInfo: WiFiDirectServiceProvisioningInfo
  /** Gets the session information blob associated with this request. */
  var sessionInfo: IBuffer
  /** Closes the session request. Your server code calls this method to reject a session request. */
  def close(): Unit
}

object WiFiDirectServiceSessionRequest {
  @scala.inline
  def apply(
    close: () => Unit,
    deviceInformation: DeviceInformation,
    provisioningInfo: WiFiDirectServiceProvisioningInfo,
    sessionInfo: IBuffer
  ): WiFiDirectServiceSessionRequest = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), deviceInformation = deviceInformation.asInstanceOf[js.Any], provisioningInfo = provisioningInfo.asInstanceOf[js.Any], sessionInfo = sessionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectServiceSessionRequest]
  }
}

