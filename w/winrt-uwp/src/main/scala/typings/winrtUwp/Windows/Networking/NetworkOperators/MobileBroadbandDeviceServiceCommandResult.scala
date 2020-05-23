package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a mobile broadband device service command. */
trait MobileBroadbandDeviceServiceCommandResult extends js.Object {
  /** Gets the response data from the command execution on a mobile broadband device service. */
  var responseData: IBuffer
  /** Gets the status code of the command execution on a mobile broadband device service. */
  var statusCode: Double
}

object MobileBroadbandDeviceServiceCommandResult {
  @scala.inline
  def apply(responseData: IBuffer, statusCode: Double): MobileBroadbandDeviceServiceCommandResult = {
    val __obj = js.Dynamic.literal(responseData = responseData.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandDeviceServiceCommandResult]
  }
}

