package typings.tabulatorTables.Tabulator

import typings.std.MouseEvent
import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsMenu extends js.Object {
  
  var groupClickMenu: js.UndefOr[GroupContextMenuSignature] = js.native
  
  var groupContextMenu: js.UndefOr[js.Array[MenuObject[GroupComponent]]] = js.native
  
  var rowClickMenu: js.UndefOr[RowContextMenuSignature] = js.native
  
  var rowContextMenu: js.UndefOr[RowContextMenuSignature] = js.native
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
    def setGroupClickMenuFunction2(
      value: (/* component */ GroupComponent, /* e */ MouseEvent) => MenuObject[GroupComponent] | `false` | js.Array[js.Any]
    ): Self = this.set("groupClickMenu", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGroupClickMenuVarargs(value: (MenuObject[GroupComponent] | MenuSeparator)*): Self = this.set("groupClickMenu", js.Array(value :_*))
    
    @scala.inline
    def setGroupClickMenu(value: GroupContextMenuSignature): Self = this.set("groupClickMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupClickMenu: Self = this.set("groupClickMenu", js.undefined)
    
    @scala.inline
    def setGroupContextMenuVarargs(value: MenuObject[GroupComponent]*): Self = this.set("groupContextMenu", js.Array(value :_*))
    
    @scala.inline
    def setGroupContextMenu(value: js.Array[MenuObject[GroupComponent]]): Self = this.set("groupContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupContextMenu: Self = this.set("groupContextMenu", js.undefined)
    
    @scala.inline
    def setRowClickMenuFunction2(
      value: (/* component */ RowComponent, /* e */ MouseEvent) => MenuObject[RowComponent] | `false` | js.Array[js.Any]
    ): Self = this.set("rowClickMenu", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRowClickMenuVarargs(value: (MenuObject[RowComponent] | MenuSeparator)*): Self = this.set("rowClickMenu", js.Array(value :_*))
    
    @scala.inline
    def setRowClickMenu(value: RowContextMenuSignature): Self = this.set("rowClickMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowClickMenu: Self = this.set("rowClickMenu", js.undefined)
    
    @scala.inline
    def setRowContextMenuFunction2(
      value: (/* component */ RowComponent, /* e */ MouseEvent) => MenuObject[RowComponent] | `false` | js.Array[js.Any]
    ): Self = this.set("rowContextMenu", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRowContextMenuVarargs(value: (MenuObject[RowComponent] | MenuSeparator)*): Self = this.set("rowContextMenu", js.Array(value :_*))
    
    @scala.inline
    def setRowContextMenu(value: RowContextMenuSignature): Self = this.set("rowContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowContextMenu: Self = this.set("rowContextMenu", js.undefined)
  }
}
