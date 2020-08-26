package typings.tinymce.mod.settings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Menu extends js.Object {
  var edit: js.UndefOr[MenuItem] = js.native
  var file: js.UndefOr[MenuItem] = js.native
  var format: js.UndefOr[MenuItem] = js.native
  var insert: js.UndefOr[MenuItem] = js.native
  var table: js.UndefOr[MenuItem] = js.native
  var tools: js.UndefOr[MenuItem] = js.native
  var view: js.UndefOr[MenuItem] = js.native
}

object Menu {
  @scala.inline
  def apply(): Menu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Menu]
  }
  @scala.inline
  implicit class MenuOps[Self <: Menu] (val x: Self) extends AnyVal {
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
    def setEdit(value: MenuItem): Self = this.set("edit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    @scala.inline
    def setFile(value: MenuItem): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setFormat(value: MenuItem): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setInsert(value: MenuItem): Self = this.set("insert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    @scala.inline
    def setTable(value: MenuItem): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    @scala.inline
    def setTools(value: MenuItem): Self = this.set("tools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTools: Self = this.set("tools", js.undefined)
    @scala.inline
    def setView(value: MenuItem): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

