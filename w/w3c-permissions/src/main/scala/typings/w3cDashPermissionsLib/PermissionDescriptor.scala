package typings
package w3cDashPermissionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/permissions/#permission-descriptor
trait PermissionDescriptor extends js.Object {
  var name: java.lang.String
}

object PermissionDescriptor {
  @scala.inline
  def apply(name: java.lang.String): PermissionDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[PermissionDescriptor]
  }
}

