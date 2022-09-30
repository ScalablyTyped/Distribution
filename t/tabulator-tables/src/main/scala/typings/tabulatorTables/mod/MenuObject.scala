package typings.tabulatorTables.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuObject[T /* <: RowComponent | CellComponent | ColumnComponent | GroupComponent */] extends StObject {
  
  var action: js.UndefOr[js.Function2[/* e */ Any, /* component */ T, Any]] = js.undefined
  
  var disabled: js.UndefOr[Boolean | (js.Function1[/* component */ T, Boolean])] = js.undefined
  
  var label: String | HTMLElement | (js.Function1[/* component */ T, String | HTMLElement])
  
  var menu: js.UndefOr[js.Array[MenuObject[T]]] = js.undefined
}
object MenuObject {
  
  inline def apply[T /* <: RowComponent | CellComponent | ColumnComponent | GroupComponent */](label: String | HTMLElement | (js.Function1[/* component */ T, String | HTMLElement])): MenuObject[T] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuObject[T]]
  }
  
  extension [Self <: MenuObject[?], T /* <: RowComponent | CellComponent | ColumnComponent | GroupComponent */](x: Self & MenuObject[T]) {
    
    inline def setAction(value: (/* e */ Any, /* component */ T) => Any): Self = StObject.set(x, "action", js.Any.fromFunction2(value))
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDisabled(value: Boolean | (js.Function1[/* component */ T, Boolean])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledFunction1(value: /* component */ T => Boolean): Self = StObject.set(x, "disabled", js.Any.fromFunction1(value))
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLabel(value: String | HTMLElement | (js.Function1[/* component */ T, String | HTMLElement])): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFunction1(value: /* component */ T => String | HTMLElement): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setMenu(value: js.Array[MenuObject[T]]): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    inline def setMenuVarargs(value: MenuObject[T]*): Self = StObject.set(x, "menu", js.Array(value*))
  }
}
