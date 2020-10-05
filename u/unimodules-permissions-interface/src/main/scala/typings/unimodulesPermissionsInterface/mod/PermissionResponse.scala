package typings.unimodulesPermissionsInterface.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionResponse extends js.Object {
  var canAskAgain: Boolean = js.native
  var expires: PermissionExpiration = js.native
  var granted: Boolean = js.native
  var status: PermissionStatus = js.native
}

object PermissionResponse {
  @scala.inline
  def apply(canAskAgain: Boolean, expires: PermissionExpiration, granted: Boolean, status: PermissionStatus): PermissionResponse = {
    val __obj = js.Dynamic.literal(canAskAgain = canAskAgain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionResponse]
  }
  @scala.inline
  implicit class PermissionResponseOps[Self <: PermissionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCanAskAgain(value: Boolean): Self = this.set("canAskAgain", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpires(value: PermissionExpiration): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def setGranted(value: Boolean): Self = this.set("granted", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: PermissionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

