package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a Wi-Fi Direct Service session request. */
@js.native
trait WiFiDirectServiceSessionRequest extends js.Object {
  /** Gets device information for the requesting device. */
  var deviceInformation: DeviceInformation = js.native
  /** Gets information about how provisioning should be performed if the session is established. */
  var provisioningInfo: WiFiDirectServiceProvisioningInfo = js.native
  /** Gets the session information blob associated with this request. */
  var sessionInfo: IBuffer = js.native
  /** Closes the session request. Your server code calls this method to reject a session request. */
  def close(): Unit = js.native
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
  @scala.inline
  implicit class WiFiDirectServiceSessionRequestOps[Self <: WiFiDirectServiceSessionRequest] (val x: Self) extends AnyVal {
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setDeviceInformation(value: DeviceInformation): Self = this.set("deviceInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvisioningInfo(value: WiFiDirectServiceProvisioningInfo): Self = this.set("provisioningInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionInfo(value: IBuffer): Self = this.set("sessionInfo", value.asInstanceOf[js.Any])
  }
  
}

