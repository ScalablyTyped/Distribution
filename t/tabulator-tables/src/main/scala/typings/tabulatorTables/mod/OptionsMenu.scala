package typings.tabulatorTables.mod

import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsMenu extends StObject {
  
  var groupClickMenu: js.UndefOr[GroupContextMenuSignature] = js.undefined
  
  var groupContextMenu: js.UndefOr[js.Array[MenuObject[GroupComponent]]] = js.undefined
  
  var popupContainer: js.UndefOr[Boolean | String | HTMLElement] = js.undefined
  
  var rowClickMenu: js.UndefOr[RowContextMenuSignature] = js.undefined
  
  var rowContextMenu: js.UndefOr[RowContextMenuSignature] = js.undefined
}
object OptionsMenu {
  
  inline def apply(): OptionsMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsMenu]
  }
  
  extension [Self <: OptionsMenu](x: Self) {
    
    inline def setGroupClickMenu(value: GroupContextMenuSignature): Self = StObject.set(x, "groupClickMenu", value.asInstanceOf[js.Any])
    
    inline def setGroupClickMenuFunction2(
      value: (/* component */ GroupComponent, /* e */ MouseEvent) => MenuObject[GroupComponent] | `false` | js.Array[Any]
    ): Self = StObject.set(x, "groupClickMenu", js.Any.fromFunction2(value))
    
    inline def setGroupClickMenuUndefined: Self = StObject.set(x, "groupClickMenu", js.undefined)
    
    inline def setGroupClickMenuVarargs(value: (MenuObject[GroupComponent] | MenuSeparator)*): Self = StObject.set(x, "groupClickMenu", js.Array(value*))
    
    inline def setGroupContextMenu(value: js.Array[MenuObject[GroupComponent]]): Self = StObject.set(x, "groupContextMenu", value.asInstanceOf[js.Any])
    
    inline def setGroupContextMenuUndefined: Self = StObject.set(x, "groupContextMenu", js.undefined)
    
    inline def setGroupContextMenuVarargs(value: MenuObject[GroupComponent]*): Self = StObject.set(x, "groupContextMenu", js.Array(value*))
    
    inline def setPopupContainer(value: Boolean | String | HTMLElement): Self = StObject.set(x, "popupContainer", value.asInstanceOf[js.Any])
    
    inline def setPopupContainerUndefined: Self = StObject.set(x, "popupContainer", js.undefined)
    
    inline def setRowClickMenu(value: RowContextMenuSignature): Self = StObject.set(x, "rowClickMenu", value.asInstanceOf[js.Any])
    
    inline def setRowClickMenuFunction2(
      value: (/* e */ MouseEvent, /* component */ RowComponent) => MenuObject[RowComponent] | `false` | js.Array[Any]
    ): Self = StObject.set(x, "rowClickMenu", js.Any.fromFunction2(value))
    
    inline def setRowClickMenuUndefined: Self = StObject.set(x, "rowClickMenu", js.undefined)
    
    inline def setRowClickMenuVarargs(value: (MenuObject[RowComponent] | MenuSeparator)*): Self = StObject.set(x, "rowClickMenu", js.Array(value*))
    
    inline def setRowContextMenu(value: RowContextMenuSignature): Self = StObject.set(x, "rowContextMenu", value.asInstanceOf[js.Any])
    
    inline def setRowContextMenuFunction2(
      value: (/* e */ MouseEvent, /* component */ RowComponent) => MenuObject[RowComponent] | `false` | js.Array[Any]
    ): Self = StObject.set(x, "rowContextMenu", js.Any.fromFunction2(value))
    
    inline def setRowContextMenuUndefined: Self = StObject.set(x, "rowContextMenu", js.undefined)
    
    inline def setRowContextMenuVarargs(value: (MenuObject[RowComponent] | MenuSeparator)*): Self = StObject.set(x, "rowContextMenu", js.Array(value*))
  }
}
