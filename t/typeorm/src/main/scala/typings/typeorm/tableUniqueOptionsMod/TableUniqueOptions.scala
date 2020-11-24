package typings.typeorm.tableUniqueOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableUniqueOptions extends js.Object {
  
  /**
    * Columns that contains this constraint.
    */
  var columnNames: js.Array[String] = js.native
  
  /**
    * Constraint name.
    */
  var name: js.UndefOr[String] = js.native
}
object TableUniqueOptions {
  
  @scala.inline
  def apply(columnNames: js.Array[String]): TableUniqueOptions = {
    val __obj = js.Dynamic.literal(columnNames = columnNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableUniqueOptions]
  }
  
  @scala.inline
  implicit class TableUniqueOptionsOps[Self <: TableUniqueOptions] (val x: Self) extends AnyVal {
    
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
    def setColumnNamesVarargs(value: String*): Self = this.set("columnNames", js.Array(value :_*))
    
    @scala.inline
    def setColumnNames(value: js.Array[String]): Self = this.set("columnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
