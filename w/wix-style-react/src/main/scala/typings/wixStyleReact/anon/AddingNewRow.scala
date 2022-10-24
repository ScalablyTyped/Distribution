package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddingNewRow extends StObject {
  
  var addingNewRow: Boolean
  
  var editingRow: Null
}
object AddingNewRow {
  
  inline def apply(addingNewRow: Boolean, editingRow: Null): AddingNewRow = {
    val __obj = js.Dynamic.literal(addingNewRow = addingNewRow.asInstanceOf[js.Any], editingRow = editingRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddingNewRow]
  }
  
  extension [Self <: AddingNewRow](x: Self) {
    
    inline def setAddingNewRow(value: Boolean): Self = StObject.set(x, "addingNewRow", value.asInstanceOf[js.Any])
    
    inline def setEditingRow(value: Null): Self = StObject.set(x, "editingRow", value.asInstanceOf[js.Any])
  }
}
