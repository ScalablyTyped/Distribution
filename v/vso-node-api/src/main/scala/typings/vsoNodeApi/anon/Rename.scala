package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rename extends js.Object {
  var add: scala.Double = js.native
  var delete: scala.Double = js.native
  var edit: scala.Double = js.native
  var none: scala.Double = js.native
  var rename: scala.Double = js.native
}

object Rename {
  @scala.inline
  def apply(
    add: scala.Double,
    delete: scala.Double,
    edit: scala.Double,
    none: scala.Double,
    rename: scala.Double
  ): Rename = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rename]
  }
  @scala.inline
  implicit class RenameOps[Self <: Rename] (val x: Self) extends AnyVal {
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
    def setAdd(value: scala.Double): Self = this.set("add", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: scala.Double): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdit(value: scala.Double): Self = this.set("edit", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setRename(value: scala.Double): Self = this.set("rename", value.asInstanceOf[js.Any])
  }
  
}

