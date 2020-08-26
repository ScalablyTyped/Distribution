package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllPermissions extends js.Object {
  var allPermissions: scala.Double = js.native
  var delete: scala.Double = js.native
  var edit: scala.Double = js.native
  var manage: scala.Double = js.native
  var none: scala.Double = js.native
  var view: scala.Double = js.native
}

object AllPermissions {
  @scala.inline
  def apply(
    allPermissions: scala.Double,
    delete: scala.Double,
    edit: scala.Double,
    manage: scala.Double,
    none: scala.Double,
    view: scala.Double
  ): AllPermissions = {
    val __obj = js.Dynamic.literal(allPermissions = allPermissions.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], manage = manage.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllPermissions]
  }
  @scala.inline
  implicit class AllPermissionsOps[Self <: AllPermissions] (val x: Self) extends AnyVal {
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
    def setAllPermissions(value: scala.Double): Self = this.set("allPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: scala.Double): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdit(value: scala.Double): Self = this.set("edit", value.asInstanceOf[js.Any])
    @scala.inline
    def setManage(value: scala.Double): Self = this.set("manage", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: scala.Double): Self = this.set("view", value.asInstanceOf[js.Any])
  }
  
}

