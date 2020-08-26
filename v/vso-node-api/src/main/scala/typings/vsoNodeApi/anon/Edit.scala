package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edit extends js.Object {
  var edit: scala.Double = js.native
  var manage: scala.Double = js.native
  var managePermissions: scala.Double = js.native
  var none: scala.Double = js.native
}

object Edit {
  @scala.inline
  def apply(edit: scala.Double, manage: scala.Double, managePermissions: scala.Double, none: scala.Double): Edit = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], manage = manage.asInstanceOf[js.Any], managePermissions = managePermissions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edit]
  }
  @scala.inline
  implicit class EditOps[Self <: Edit] (val x: Self) extends AnyVal {
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
    def setEdit(value: scala.Double): Self = this.set("edit", value.asInstanceOf[js.Any])
    @scala.inline
    def setManage(value: scala.Double): Self = this.set("manage", value.asInstanceOf[js.Any])
    @scala.inline
    def setManagePermissions(value: scala.Double): Self = this.set("managePermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
  }
  
}

