package typings.typeorm.joinTableMetadataArgsMod

import typings.typeorm.joinColumnMetadataArgsMod.JoinColumnMetadataArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JoinTableMetadataArgs extends js.Object {
  
  /**
    * Database where join table will be created.
    * Works only in some databases (like mysql and mssql).
    */
  val database: js.UndefOr[String] = js.native
  
  /**
    * Second (inverse) column of the join table.
    */
  val inverseJoinColumns: js.UndefOr[js.Array[JoinColumnMetadataArgs]] = js.native
  
  /**
    * First column of the join table.
    */
  val joinColumns: js.UndefOr[js.Array[JoinColumnMetadataArgs]] = js.native
  
  /**
    * Name of the table that will be created to store values of the both tables (join table).
    * By default is auto generated.
    */
  val name: js.UndefOr[String] = js.native
  
  /**
    * Class's property name to which this column is applied.
    */
  val propertyName: String = js.native
  
  /**
    * Schema where join table will be created.
    * Works only in some databases (like postgres and mssql).
    */
  val schema: js.UndefOr[String] = js.native
  
  /**
    * Class to which this column is applied.
    */
  val target: js.Function | String = js.native
}
object JoinTableMetadataArgs {
  
  @scala.inline
  def apply(propertyName: String, target: js.Function | String): JoinTableMetadataArgs = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinTableMetadataArgs]
  }
  
  @scala.inline
  implicit class JoinTableMetadataArgsOps[Self <: JoinTableMetadataArgs] (val x: Self) extends AnyVal {
    
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
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Function | String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    
    @scala.inline
    def setInverseJoinColumnsVarargs(value: JoinColumnMetadataArgs*): Self = this.set("inverseJoinColumns", js.Array(value :_*))
    
    @scala.inline
    def setInverseJoinColumns(value: js.Array[JoinColumnMetadataArgs]): Self = this.set("inverseJoinColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverseJoinColumns: Self = this.set("inverseJoinColumns", js.undefined)
    
    @scala.inline
    def setJoinColumnsVarargs(value: JoinColumnMetadataArgs*): Self = this.set("joinColumns", js.Array(value :_*))
    
    @scala.inline
    def setJoinColumns(value: js.Array[JoinColumnMetadataArgs]): Self = this.set("joinColumns", value.asInstanceOf[js.Any])
    
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
