package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a mobile broadband device service. */
trait MobileBroadbandDeviceServiceInformation extends js.Object {
  /** Gets the unique device service identifier for the mobile broadband device. */
  var deviceServiceId: String
  /** Determines if the mobile broadband device service is able to read data. */
  var isDataReadSupported: Boolean
  /** Determines if the mobile broadband device service is able to write data. */
  var isDataWriteSupported: Boolean
}

object MobileBroadbandDeviceServiceInformation {
  @scala.inline
  def apply(deviceServiceId: String, isDataReadSupported: Boolean, isDataWriteSupported: Boolean): MobileBroadbandDeviceServiceInformation = {
    val __obj = js.Dynamic.literal(deviceServiceId = deviceServiceId.asInstanceOf[js.Any], isDataReadSupported = isDataReadSupported.asInstanceOf[js.Any], isDataWriteSupported = isDataWriteSupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandDeviceServiceInformation]
  }
}

