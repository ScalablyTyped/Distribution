package typings.typeorm.tableIndexOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableIndexOptions extends js.Object {
  
  /**
    * Columns included in this index.
    */
  var columnNames: js.Array[String] = js.native
  
  /**
    * The FULLTEXT modifier indexes the entire column and does not allow prefixing.
    * Supported only in MySQL & SAP HANA.
    */
  var isFulltext: js.UndefOr[Boolean] = js.native
  
  /**
    * The SPATIAL modifier indexes the entire column and does not allow indexed columns to contain NULL values.
    * Works only in MySQL.
    */
  var isSpatial: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if this index is unique.
    */
  var isUnique: js.UndefOr[Boolean] = js.native
  
  /**
    * Constraint name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Fulltext parser.
    * Works only in MySQL.
    */
  var parser: js.UndefOr[String] = js.native
  
  /**
    * Index filter condition.
    */
  var where: js.UndefOr[String] = js.native
}
object TableIndexOptions {
  
  @scala.inline
  def apply(columnNames: js.Array[String]): TableIndexOptions = {
    val __obj = js.Dynamic.literal(columnNames = columnNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableIndexOptions]
  }
  
  @scala.inline
  implicit class TableIndexOptionsOps[Self <: TableIndexOptions] (val x: Self) extends AnyVal {
    
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
    def setIsFulltext(value: Boolean): Self = this.set("isFulltext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFulltext: Self = this.set("isFulltext", js.undefined)
    
    @scala.inline
    def setIsSpatial(value: Boolean): Self = this.set("isSpatial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSpatial: Self = this.set("isSpatial", js.undefined)
    
    @scala.inline
    def setIsUnique(value: Boolean): Self = this.set("isUnique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUnique: Self = this.set("isUnique", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParser(value: String): Self = this.set("parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    
    @scala.inline
    def setWhere(value: String): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
}
