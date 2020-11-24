package typings.typeorm.tableOptionsMod

import typings.typeorm.tableCheckOptionsMod.TableCheckOptions
import typings.typeorm.tableColumnOptionsMod.TableColumnOptions
import typings.typeorm.tableExclusionOptionsMod.TableExclusionOptions
import typings.typeorm.tableForeignKeyOptionsMod.TableForeignKeyOptions
import typings.typeorm.tableIndexOptionsMod.TableIndexOptions
import typings.typeorm.tableUniqueOptionsMod.TableUniqueOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableOptions extends js.Object {
  
  /**
    * Table check constraints.
    */
  var checks: js.UndefOr[js.Array[TableCheckOptions]] = js.native
  
  /**
    * Table columns.
    */
  var columns: js.UndefOr[js.Array[TableColumnOptions]] = js.native
  
  /**
    * Table engine.
    */
  var engine: js.UndefOr[String] = js.native
  
  /**
    * Table check constraints.
    */
  var exclusions: js.UndefOr[js.Array[TableExclusionOptions]] = js.native
  
  /**
    * Table foreign keys.
    */
  var foreignKeys: js.UndefOr[js.Array[TableForeignKeyOptions]] = js.native
  
  /**
    * Table indices.
    */
  var indices: js.UndefOr[js.Array[TableIndexOptions]] = js.native
  
  /**
    * Indicates if table was just created.
    * This is needed, for example to check if we need to skip primary keys creation
    * for new tables.
    */
  var justCreated: js.UndefOr[Boolean] = js.native
  
  /**
    * Table name.
    */
  var name: String = js.native
  
  /**
    * Table unique constraints.
    */
  var uniques: js.UndefOr[js.Array[TableUniqueOptions]] = js.native
}
object TableOptions {
  
  @scala.inline
  def apply(name: String): TableOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOptions]
  }
  
  @scala.inline
  implicit class TableOptionsOps[Self <: TableOptions] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksVarargs(value: TableCheckOptions*): Self = this.set("checks", js.Array(value :_*))
    
    @scala.inline
    def setChecks(value: js.Array[TableCheckOptions]): Self = this.set("checks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecks: Self = this.set("checks", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: TableColumnOptions*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[TableColumnOptions]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    
    @scala.inline
    def setExclusionsVarargs(value: TableExclusionOptions*): Self = this.set("exclusions", js.Array(value :_*))
    
    @scala.inline
    def setExclusions(value: js.Array[TableExclusionOptions]): Self = this.set("exclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusions: Self = this.set("exclusions", js.undefined)
    
    @scala.inline
    def setForeignKeysVarargs(value: TableForeignKeyOptions*): Self = this.set("foreignKeys", js.Array(value :_*))
    
    @scala.inline
    def setForeignKeys(value: js.Array[TableForeignKeyOptions]): Self = this.set("foreignKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeignKeys: Self = this.set("foreignKeys", js.undefined)
    
    @scala.inline
    def setIndicesVarargs(value: TableIndexOptions*): Self = this.set("indices", js.Array(value :_*))
    
    @scala.inline
    def setIndices(value: js.Array[TableIndexOptions]): Self = this.set("indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndices: Self = this.set("indices", js.undefined)
    
    @scala.inline
    def setJustCreated(value: Boolean): Self = this.set("justCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustCreated: Self = this.set("justCreated", js.undefined)
    
    @scala.inline
    def setUniquesVarargs(value: TableUniqueOptions*): Self = this.set("uniques", js.Array(value :_*))
    
    @scala.inline
    def setUniques(value: js.Array[TableUniqueOptions]): Self = this.set("uniques", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniques: Self = this.set("uniques", js.undefined)
  }
}
