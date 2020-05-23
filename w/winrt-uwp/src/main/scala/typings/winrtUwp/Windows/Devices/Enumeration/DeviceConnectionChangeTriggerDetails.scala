package typings.winrtUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the device that caused this trigger to fire. */
trait DeviceConnectionChangeTriggerDetails extends js.Object {
  /** Gets the device Id of the device that caused this trigger to fire. */
  var deviceId: String
}

object DeviceConnectionChangeTriggerDetails {
  @scala.inline
  def apply(deviceId: String): DeviceConnectionChangeTriggerDetails = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConnectionChangeTriggerDetails]
  }
}

