package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details for a network device service notification. */
trait MobileBroadbandDeviceServiceTriggerDetails extends js.Object {
  /** Gets the device ID of the device that triggered a broadband device service event. */
  var deviceId: String
  /** Gets the device service identifier for the device service trigger event. */
  var deviceServiceId: String
  /** Gets the received data associated with the triggered event. */
  var receivedData: IBuffer
}

object MobileBroadbandDeviceServiceTriggerDetails {
  @scala.inline
  def apply(deviceId: String, deviceServiceId: String, receivedData: IBuffer): MobileBroadbandDeviceServiceTriggerDetails = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], deviceServiceId = deviceServiceId.asInstanceOf[js.Any], receivedData = receivedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandDeviceServiceTriggerDetails]
  }
}

