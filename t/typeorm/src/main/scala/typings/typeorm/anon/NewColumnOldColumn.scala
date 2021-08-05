package typings.typeorm.anon

import typings.typeorm.tableTableColumnMod.TableColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewColumnOldColumn extends StObject {
  
  var newColumn: TableColumn
  
  var oldColumn: TableColumn
}
object NewColumnOldColumn {
  
  inline def apply(newColumn: TableColumn, oldColumn: TableColumn): NewColumnOldColumn = {
    val __obj = js.Dynamic.literal(newColumn = newColumn.asInstanceOf[js.Any], oldColumn = oldColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewColumnOldColumn]
  }
  
  extension [Self <: NewColumnOldColumn](x: Self) {
    
    inline def setNewColumn(value: TableColumn): Self = StObject.set(x, "newColumn", value.asInstanceOf[js.Any])
    
    inline def setOldColumn(value: TableColumn): Self = StObject.set(x, "oldColumn", value.asInstanceOf[js.Any])
  }
}
