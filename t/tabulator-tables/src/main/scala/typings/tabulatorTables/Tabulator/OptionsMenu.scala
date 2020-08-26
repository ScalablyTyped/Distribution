package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsMenu extends js.Object {
  var groupContextMenu: js.UndefOr[js.Array[MenuObject[GroupComponent]]] = js.native
  var rowContextMenu: js.UndefOr[
    (js.Array[MenuObject[RowComponent] | MenuSeparator]) | (js.Function1[/* component */ RowComponent, MenuObject[RowComponent] | `false` | js.Array[_]])
  ] = js.native
}

object OptionsMenu {
  @scala.inline
  def apply(): OptionsMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsMenu]
  }
  @scala.inline
  implicit class OptionsMenuOps[Self <: OptionsMenu] (val x: Self) extends AnyVal {
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
    def setGroupContextMenuVarargs(value: MenuObject[GroupComponent]*): Self = this.set("groupContextMenu", js.Array(value :_*))
    @scala.inline
    def setGroupContextMenu(value: js.Array[MenuObject[GroupComponent]]): Self = this.set("groupContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupContextMenu: Self = this.set("groupContextMenu", js.undefined)
    @scala.inline
    def setRowContextMenuVarargs(value: (MenuObject[RowComponent] | MenuSeparator)*): Self = this.set("rowContextMenu", js.Array(value :_*))
    @scala.inline
    def setRowContextMenuFunction1(value: /* component */ RowComponent => MenuObject[RowComponent] | `false` | js.Array[_]): Self = this.set("rowContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def setRowContextMenu(
      value: (js.Array[MenuObject[RowComponent] | MenuSeparator]) | (js.Function1[/* component */ RowComponent, MenuObject[RowComponent] | `false` | js.Array[_]])
    ): Self = this.set("rowContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowContextMenu: Self = this.set("rowContextMenu", js.undefined)
  }
  
}

