package typings.typeorm.optionsJoinTableMultipleColumnsOptionsMod

import typings.typeorm.optionsJoinColumnOptionsMod.JoinColumnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JoinTableMultipleColumnsOptions extends js.Object {
  
  /**
    * Database where join table will be created.
    * Works only in some databases (like mysql and mssql).
    */
  var database: js.UndefOr[String] = js.native
  
  /**
    * Second (inverse) column of the join table.
    */
  var inverseJoinColumns: js.UndefOr[js.Array[JoinColumnOptions]] = js.native
  
  /**
    * First column of the join table.
    */
  var joinColumns: js.UndefOr[js.Array[JoinColumnOptions]] = js.native
  
  /**
    * Name of the table that will be created to store values of the both tables (join table).
    * By default is auto generated.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Schema where join table will be created.
    * Works only in some databases (like postgres and mssql).
    */
  var schema: js.UndefOr[String] = js.native
}
object JoinTableMultipleColumnsOptions {
  
  @scala.inline
  def apply(): JoinTableMultipleColumnsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JoinTableMultipleColumnsOptions]
  }
  
  @scala.inline
  implicit class JoinTableMultipleColumnsOptionsOps[Self <: JoinTableMultipleColumnsOptions] (val x: Self) extends AnyVal {
    
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
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    
    @scala.inline
    def setInverseJoinColumnsVarargs(value: JoinColumnOptions*): Self = this.set("inverseJoinColumns", js.Array(value :_*))
    
    @scala.inline
    def setInverseJoinColumns(value: js.Array[JoinColumnOptions]): Self = this.set("inverseJoinColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverseJoinColumns: Self = this.set("inverseJoinColumns", js.undefined)
    
    @scala.inline
    def setJoinColumnsVarargs(value: JoinColumnOptions*): Self = this.set("joinColumns", js.Array(value :_*))
    
    @scala.inline
    def setJoinColumns(value: js.Array[JoinColumnOptions]): Self = this.set("joinColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinColumns: Self = this.set("joinColumns", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
}
