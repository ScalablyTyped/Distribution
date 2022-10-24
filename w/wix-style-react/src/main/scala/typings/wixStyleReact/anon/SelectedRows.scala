package typings.wixStyleReact.anon

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedRows extends StObject {
  
  var selectedRows: Map[Any, Any]
}
object SelectedRows {
  
  inline def apply(selectedRows: Map[Any, Any]): SelectedRows = {
    val __obj = js.Dynamic.literal(selectedRows = selectedRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedRows]
  }
  
  extension [Self <: SelectedRows](x: Self) {
    
    inline def setSelectedRows(value: Map[Any, Any]): Self = StObject.set(x, "selectedRows", value.asInstanceOf[js.Any])
  }
}
