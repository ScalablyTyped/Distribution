package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that launches a background task when the connection status of a device changes. */
trait DeviceConnectionChangeTrigger extends js.Object {
  /** Gets whether the system can maintain a connection to the specified device. */
  var canMaintainConnection: Boolean
  /** Gets the device Id associated with the device. */
  var deviceId: String
  /** Gets or sets whether the system should automatically attempt to keep the referenced device connected. */
  var maintainConnection: Boolean
}

object DeviceConnectionChangeTrigger {
  @scala.inline
  def apply(canMaintainConnection: Boolean, deviceId: String, maintainConnection: Boolean): DeviceConnectionChangeTrigger = {
    val __obj = js.Dynamic.literal(canMaintainConnection = canMaintainConnection.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], maintainConnection = maintainConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConnectionChangeTrigger]
  }
}

