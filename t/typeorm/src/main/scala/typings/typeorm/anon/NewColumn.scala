package typings.typeorm.anon

import typings.typeorm.tableColumnMod.TableColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewColumn extends StObject {
  
  var newColumn: TableColumn = js.native
  
  var oldColumn: TableColumn = js.native
}
object NewColumn {
  
  @scala.inline
  def apply(newColumn: TableColumn, oldColumn: TableColumn): NewColumn = {
    val __obj = js.Dynamic.literal(newColumn = newColumn.asInstanceOf[js.Any], oldColumn = oldColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewColumn]
  }
  
  @scala.inline
  implicit class NewColumnMutableBuilder[Self <: NewColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewColumn(value: TableColumn): Self = StObject.set(x, "newColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldColumn(value: TableColumn): Self = StObject.set(x, "oldColumn", value.asInstanceOf[js.Any])
  }
}
