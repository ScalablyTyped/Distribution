package typings.unimodulesPermissionsInterface.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionResponse extends js.Object {
  var canAskAgain: Boolean
  var expires: PermissionExpiration
  var granted: Boolean
  var status: PermissionStatus
}

object PermissionResponse {
  @scala.inline
  def apply(canAskAgain: Boolean, expires: PermissionExpiration, granted: Boolean, status: PermissionStatus): PermissionResponse = {
    val __obj = js.Dynamic.literal(canAskAgain = canAskAgain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionResponse]
  }
}

