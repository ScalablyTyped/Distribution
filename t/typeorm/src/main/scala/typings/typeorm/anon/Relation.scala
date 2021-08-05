package typings.typeorm.anon

import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.relationMetadataMod.RelationMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Relation extends StObject {
  
  var relation: RelationMetadata
  
  var value: ObjectLiteral
}
object Relation {
  
  inline def apply(relation: RelationMetadata, value: ObjectLiteral): Relation = {
    val __obj = js.Dynamic.literal(relation = relation.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relation]
  }
  
  extension [Self <: Relation](x: Self) {
    
    inline def setRelation(value: RelationMetadata): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ObjectLiteral): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
