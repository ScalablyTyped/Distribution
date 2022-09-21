package typings.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableEditorProps extends StObject {
  
  var addTool: js.UndefOr[js.Function1[/* columns */ js.Object, js.Object]] = js.undefined
  
  var columns: ColumnSchema
  
  var editable: js.UndefOr[Boolean] = js.undefined
  
  var value: js.Array[Record]
}
object TableEditorProps {
  
  inline def apply(columns: ColumnSchema, value: js.Array[Record]): TableEditorProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableEditorProps]
  }
  
  extension [Self <: TableEditorProps](x: Self) {
    
    inline def setAddTool(value: /* columns */ js.Object => js.Object): Self = StObject.set(x, "addTool", js.Any.fromFunction1(value))
    
    inline def setAddToolUndefined: Self = StObject.set(x, "addTool", js.undefined)
    
    inline def setColumns(value: ColumnSchema): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setValue(value: js.Array[Record]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Record*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
