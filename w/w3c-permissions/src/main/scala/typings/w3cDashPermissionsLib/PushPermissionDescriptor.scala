package typings
package w3cDashPermissionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/permissions/#push
trait PushPermissionDescriptor extends PermissionDescriptor {
  var userVisibleOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object PushPermissionDescriptor {
  @scala.inline
  def apply(name: java.lang.String, userVisibleOnly: js.UndefOr[scala.Boolean] = js.undefined): PushPermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(userVisibleOnly)) __obj.updateDynamic("userVisibleOnly")(userVisibleOnly)
    __obj.asInstanceOf[PushPermissionDescriptor]
  }
}

