package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.PredicateType, 'type' | 'name' | 'asserts' | 'targetType'> */
trait PredicateType extends StObject {
  
  var asserts: ToSerialized[Boolean]
  
  var name: ToSerialized[String]
  
  var targetType: ToSerialized[js.UndefOr[typings.typedoc.modelsTypesMod.SomeType]]
  
  var `type`: ToSerialized[/* "predicate" */ String]
}
object PredicateType {
  
  inline def apply(
    asserts: ToSerialized[Boolean],
    name: ToSerialized[String],
    `type`: ToSerialized[/* "predicate" */ String]
  ): PredicateType = {
    val __obj = js.Dynamic.literal(asserts = asserts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredicateType]
  }
  
  extension [Self <: PredicateType](x: Self) {
    
    inline def setAsserts(value: ToSerialized[Boolean]): Self = StObject.set(x, "asserts", value.asInstanceOf[js.Any])
    
    inline def setAssertsVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "asserts", js.Array(value*))
    
    inline def setName(value: ToSerialized[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setTargetType(value: ToSerialized[js.UndefOr[typings.typedoc.modelsTypesMod.SomeType]]): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    
    inline def setTargetTypeVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "targetType", js.Array(value*))
    
    inline def setType(value: ToSerialized[/* "predicate" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
