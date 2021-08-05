package typings.typeorm.anon

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.metadataRelationMetadataMod.RelationMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var relation: RelationMetadata
  
  var value: ObjectLiteral
}
object Value {
  
  inline def apply(relation: RelationMetadata, value: ObjectLiteral): Value = {
    val __obj = js.Dynamic.literal(relation = relation.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setRelation(value: RelationMetadata): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ObjectLiteral): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
