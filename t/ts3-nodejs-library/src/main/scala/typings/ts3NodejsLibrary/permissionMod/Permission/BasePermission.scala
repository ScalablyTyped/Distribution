package typings.ts3NodejsLibrary.permissionMod.Permission

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasePermission extends js.Object {
  var negate: js.UndefOr[Boolean] = js.native
  var permvalue: Double = js.native
  var skip: js.UndefOr[Boolean] = js.native
}

object BasePermission {
  @scala.inline
  def apply(permvalue: Double): BasePermission = {
    val __obj = js.Dynamic.literal(permvalue = permvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePermission]
  }
  @scala.inline
  implicit class BasePermissionOps[Self <: BasePermission] (val x: Self) extends AnyVal {
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
    def setPermvalue(value: Double): Self = this.set("permvalue", value.asInstanceOf[js.Any])
    @scala.inline
    def setNegate(value: Boolean): Self = this.set("negate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegate: Self = this.set("negate", js.undefined)
    @scala.inline
    def setSkip(value: Boolean): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
  }
  
}

