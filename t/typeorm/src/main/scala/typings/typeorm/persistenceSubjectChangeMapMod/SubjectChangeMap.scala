package typings.typeorm.persistenceSubjectChangeMapMod

import typings.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typings.typeorm.metadataRelationMetadataMod.RelationMetadata
import typings.typeorm.persistenceSubjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubjectChangeMap extends js.Object {
  
  /**
    * Column that needs to be changed.
    * Either column, either relation must be set in the change.
    */
  var column: js.UndefOr[ColumnMetadata] = js.native
  
  /**
    * Relation that needs to be changed.
    * Either column, either relation must be set in the change.
    */
  var relation: js.UndefOr[RelationMetadata] = js.native
  
  /**
    * Value needs to be inserted into given column.
    * This value can also be another subject, when this column has a referenced column.
    */
  var value: Subject | js.Any = js.native
}
object SubjectChangeMap {
  
  @scala.inline
  def apply(value: Subject | js.Any): SubjectChangeMap = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectChangeMap]
  }
  
  @scala.inline
  implicit class SubjectChangeMapOps[Self <: SubjectChangeMap] (val x: Self) extends AnyVal {
    
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
    def setValue(value: Subject | js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: ColumnMetadata): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setRelation(value: RelationMetadata): Self = this.set("relation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelation: Self = this.set("relation", js.undefined)
  }
}
