package typings.typeorm.tableForeignKeyOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableForeignKeyOptions extends js.Object {
  
  /**
    * Column names which included by this foreign key.
    */
  var columnNames: js.Array[String] = js.native
  
  /**
    * Set this foreign key constraint as "DEFERRABLE" e.g. check constraints at start
    * or at the end of a transaction
    */
  var deferrable: js.UndefOr[String] = js.native
  
  /**
    * Name of the table which contains this foreign key.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * "ON DELETE" of this foreign key, e.g. what action database should perform when
    * referenced stuff is being deleted.
    */
  var onDelete: js.UndefOr[String] = js.native
  
  /**
    * "ON UPDATE" of this foreign key, e.g. what action database should perform when
    * referenced stuff is being updated.
    */
  var onUpdate: js.UndefOr[String] = js.native
  
  /**
    * Column names which included by this foreign key.
    */
  var referencedColumnNames: js.Array[String] = js.native
  
  /**
    * Table referenced in the foreign key.
    */
  var referencedTableName: String = js.native
}
object TableForeignKeyOptions {
  
  @scala.inline
  def apply(
    columnNames: js.Array[String],
    referencedColumnNames: js.Array[String],
    referencedTableName: String
  ): TableForeignKeyOptions = {
    val __obj = js.Dynamic.literal(columnNames = columnNames.asInstanceOf[js.Any], referencedColumnNames = referencedColumnNames.asInstanceOf[js.Any], referencedTableName = referencedTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableForeignKeyOptions]
  }
  
  @scala.inline
  implicit class TableForeignKeyOptionsOps[Self <: TableForeignKeyOptions] (val x: Self) extends AnyVal {
    
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
    def setReferencedColumnNamesVarargs(value: String*): Self = this.set("referencedColumnNames", js.Array(value :_*))
    
    @scala.inline
    def setReferencedColumnNames(value: js.Array[String]): Self = this.set("referencedColumnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencedTableName(value: String): Self = this.set("referencedTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferrable(value: String): Self = this.set("deferrable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferrable: Self = this.set("deferrable", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnDelete(value: String): Self = this.set("onDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDelete: Self = this.set("onDelete", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: String): Self = this.set("onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
  }
}
