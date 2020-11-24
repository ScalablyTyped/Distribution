package typings.typeorm.anon

import typings.typeorm.tableColumnMod.TableColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OldColumn extends js.Object {
  
  var newColumn: TableColumn = js.native
  
  var oldColumn: TableColumn = js.native
}
object OldColumn {
  
  @scala.inline
  def apply(newColumn: TableColumn, oldColumn: TableColumn): OldColumn = {
    val __obj = js.Dynamic.literal(newColumn = newColumn.asInstanceOf[js.Any], oldColumn = oldColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldColumn]
  }
  
  @scala.inline
  implicit class OldColumnOps[Self <: OldColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNewColumn(value: TableColumn): Self = this.set("newColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldColumn(value: TableColumn): Self = this.set("oldColumn", value.asInstanceOf[js.Any])
  }
}
