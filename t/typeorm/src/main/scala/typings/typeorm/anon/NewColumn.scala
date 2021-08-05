package typings.typeorm.anon

import typings.typeorm.tableColumnMod.TableColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewColumn extends StObject {
  
  var newColumn: TableColumn
  
  var oldColumn: TableColumn
}
object NewColumn {
  
  inline def apply(newColumn: TableColumn, oldColumn: TableColumn): NewColumn = {
    val __obj = js.Dynamic.literal(newColumn = newColumn.asInstanceOf[js.Any], oldColumn = oldColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewColumn]
  }
  
  extension [Self <: NewColumn](x: Self) {
    
    inline def setNewColumn(value: TableColumn): Self = StObject.set(x, "newColumn", value.asInstanceOf[js.Any])
    
    inline def setOldColumn(value: TableColumn): Self = StObject.set(x, "oldColumn", value.asInstanceOf[js.Any])
  }
}
