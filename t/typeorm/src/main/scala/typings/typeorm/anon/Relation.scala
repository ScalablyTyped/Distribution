package typings.typeorm.anon

import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.relationMetadataMod.RelationMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Relation extends StObject {
  
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
  implicit class RelationMutableBuilder[Self <: Relation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelation(value: RelationMetadata): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ObjectLiteral): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
