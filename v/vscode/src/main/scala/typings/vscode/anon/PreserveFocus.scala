package typings.vscode.anon

import typings.vscode.mod.ViewColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreserveFocus extends js.Object {
  var preserveFocus: js.UndefOr[Boolean] = js.native
  var viewColumn: ViewColumn = js.native
}

object PreserveFocus {
  @scala.inline
  def apply(viewColumn: ViewColumn): PreserveFocus = {
    val __obj = js.Dynamic.literal(viewColumn = viewColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreserveFocus]
  }
  @scala.inline
  implicit class PreserveFocusOps[Self <: PreserveFocus] (val x: Self) extends AnyVal {
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
    def setViewColumn(value: ViewColumn): Self = this.set("viewColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreserveFocus(value: Boolean): Self = this.set("preserveFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveFocus: Self = this.set("preserveFocus", js.undefined)
  }
  
}

