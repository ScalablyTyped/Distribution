package typings.typeorm.anon

import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.relationMetadataMod.RelationMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Relation extends js.Object {
  
  var relation: RelationMetadata = js.native
  
  var value: ObjectLiteral = js.native
}
object Relation {
  
  @scala.inline
  def apply(relation: RelationMetadata, value: ObjectLiteral): Relation = {
    val __obj = js.Dynamic.literal(relation = relation.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relation]
  }
  
  @scala.inline
  implicit class RelationOps[Self <: Relation] (val x: Self) extends AnyVal {
    
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
    def setRelation(value: RelationMetadata): Self = this.set("relation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ObjectLiteral): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
