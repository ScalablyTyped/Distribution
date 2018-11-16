package typings
package w3cDashPermissionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Permissions")
@js.native
class Permissions () extends js.Object {
  def query(permissionDesc: PermissionDescriptor): stdLib.Promise[PermissionStatus] = js.native
}

