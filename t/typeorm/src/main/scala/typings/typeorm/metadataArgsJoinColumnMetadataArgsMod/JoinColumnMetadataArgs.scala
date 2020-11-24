package typings.typeorm.metadataArgsJoinColumnMetadataArgsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JoinColumnMetadataArgs extends js.Object {
  
  /**
    * Name of the column.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Class's property name to which this column is applied.
    */
  var propertyName: String = js.native
  
  /**
    * Name of the column in the entity to which this column is referenced.
    * This is column property name, not a column database name.
    */
  var referencedColumnName: js.UndefOr[String] = js.native
  
  /**
    * Class to which this column is applied.
    */
  var target: js.Function | String = js.native
}
object JoinColumnMetadataArgs {
  
  @scala.inline
  def apply(propertyName: String, target: js.Function | String): JoinColumnMetadataArgs = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinColumnMetadataArgs]
  }
  
  @scala.inline
  implicit class JoinColumnMetadataArgsOps[Self <: JoinColumnMetadataArgs] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setReferencedColumnName(value: String): Self = this.set("referencedColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferencedColumnName: Self = this.set("referencedColumnName", js.undefined)
  }
}
