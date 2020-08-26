package typings.winrtUwp.Windows.Networking.XboxLive

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@js.native
trait XboxLiveQualityOfServicePrivatePayloadResult extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var deviceAddress: XboxLiveDeviceAddress = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var status: XboxLiveQualityOfServiceMeasurementStatus = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var value: IBuffer = js.native
}

object XboxLiveQualityOfServicePrivatePayloadResult {
  @scala.inline
  def apply(
    deviceAddress: XboxLiveDeviceAddress,
    status: XboxLiveQualityOfServiceMeasurementStatus,
    value: IBuffer
  ): XboxLiveQualityOfServicePrivatePayloadResult = {
    val __obj = js.Dynamic.literal(deviceAddress = deviceAddress.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[XboxLiveQualityOfServicePrivatePayloadResult]
  }
  @scala.inline
  implicit class XboxLiveQualityOfServicePrivatePayloadResultOps[Self <: XboxLiveQualityOfServicePrivatePayloadResult] (val x: Self) extends AnyVal {
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
    def setDeviceAddress(value: XboxLiveDeviceAddress): Self = this.set("deviceAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: XboxLiveQualityOfServiceMeasurementStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: IBuffer): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

