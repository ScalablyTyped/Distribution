package typings.typeorm.anon

import typings.typeorm.tableTableColumnMod.TableColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewColumnTableColumn extends StObject {
  
  var newColumn: TableColumn
  
  var oldColumn: TableColumn
}
object NewColumnTableColumn {
  
  @scala.inline
  def apply(newColumn: TableColumn, oldColumn: TableColumn): NewColumnTableColumn = {
    val __obj = js.Dynamic.literal(newColumn = newColumn.asInstanceOf[js.Any], oldColumn = oldColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewColumnTableColumn]
  }
  
  @scala.inline
  implicit class NewColumnTableColumnMutableBuilder[Self <: NewColumnTableColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewColumn(value: TableColumn): Self = StObject.set(x, "newColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldColumn(value: TableColumn): Self = StObject.set(x, "oldColumn", value.asInstanceOf[js.Any])
  }
}
