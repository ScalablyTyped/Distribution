package typings
package w3cDashPermissionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/permissions/#media-devices
trait DevicePermissionDescriptor extends PermissionDescriptor {
  var deviceId: java.lang.String
}

object DevicePermissionDescriptor {
  @scala.inline
  def apply(deviceId: java.lang.String, name: java.lang.String): DevicePermissionDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deviceId")(deviceId)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DevicePermissionDescriptor]
  }
}

