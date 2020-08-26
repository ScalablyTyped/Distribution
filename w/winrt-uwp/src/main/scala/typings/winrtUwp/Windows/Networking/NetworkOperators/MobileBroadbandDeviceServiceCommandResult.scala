package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a mobile broadband device service command. */
@js.native
trait MobileBroadbandDeviceServiceCommandResult extends js.Object {
  /** Gets the response data from the command execution on a mobile broadband device service. */
  var responseData: IBuffer = js.native
  /** Gets the status code of the command execution on a mobile broadband device service. */
  var statusCode: Double = js.native
}

object MobileBroadbandDeviceServiceCommandResult {
  @scala.inline
  def apply(responseData: IBuffer, statusCode: Double): MobileBroadbandDeviceServiceCommandResult = {
    val __obj = js.Dynamic.literal(responseData = responseData.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandDeviceServiceCommandResult]
  }
  @scala.inline
  implicit class MobileBroadbandDeviceServiceCommandResultOps[Self <: MobileBroadbandDeviceServiceCommandResult] (val x: Self) extends AnyVal {
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
    def setResponseData(value: IBuffer): Self = this.set("responseData", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
  
}

