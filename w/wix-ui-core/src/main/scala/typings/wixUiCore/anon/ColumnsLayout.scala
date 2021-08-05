package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnsLayout extends StObject {
  
  var columnsLayout: String
  
  var gridLayout: String
  
  var item: String
  
  var menu: String
}
object ColumnsLayout {
  
  inline def apply(columnsLayout: String, gridLayout: String, item: String, menu: String): ColumnsLayout = {
    val __obj = js.Dynamic.literal(columnsLayout = columnsLayout.asInstanceOf[js.Any], gridLayout = gridLayout.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnsLayout]
  }
  
  extension [Self <: ColumnsLayout](x: Self) {
    
    inline def setColumnsLayout(value: String): Self = StObject.set(x, "columnsLayout", value.asInstanceOf[js.Any])
    
    inline def setGridLayout(value: String): Self = StObject.set(x, "gridLayout", value.asInstanceOf[js.Any])
    
    inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setMenu(value: String): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
  }
}
