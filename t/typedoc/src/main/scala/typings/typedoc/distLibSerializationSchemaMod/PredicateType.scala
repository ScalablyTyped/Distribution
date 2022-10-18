package typings.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.PredicateType, 'type' | 'name' | 'asserts' | 'targetType'> */
trait PredicateType extends StObject {
  
  var asserts: ToSerialized[Boolean]
  
  var name: ToSerialized[String]
  
  var targetType: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.SomeType]]
  
  var `type`: ToSerialized[/* "predicate" */ String]
}
object PredicateType {
  
  inline def apply(
    asserts: ToSerialized[Boolean],
    name: ToSerialized[String],
    targetType: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.SomeType]],
    `type`: ToSerialized[/* "predicate" */ String]
  ): PredicateType = {
    val __obj = js.Dynamic.literal(asserts = asserts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredicateType]
  }
  
  extension [Self <: PredicateType](x: Self) {
    
    inline def setAsserts(value: ToSerialized[Boolean]): Self = StObject.set(x, "asserts", value.asInstanceOf[js.Any])
    
    inline def setName(value: ToSerialized[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTargetType(value: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.SomeType]]): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    inline def setType(value: ToSerialized[/* "predicate" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
