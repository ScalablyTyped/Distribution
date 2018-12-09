package typings
package w3cDashPermissionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Permissions")
@js.native
class Permissions () extends js.Object {
  def query(permissionDesc: PermissionDescriptor): js.Promise[PermissionStatus] = js.native
}

