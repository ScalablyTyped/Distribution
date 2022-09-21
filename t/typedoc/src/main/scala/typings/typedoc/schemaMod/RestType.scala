package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.RestType, 'type' | 'elementType'> */
trait RestType extends StObject {
  
  var elementType: ToSerialized[typings.typedoc.modelsTypesMod.SomeType]
  
  var `type`: ToSerialized[/* "rest" */ String]
}
object RestType {
  
  inline def apply(
    elementType: ToSerialized[typings.typedoc.modelsTypesMod.SomeType],
    `type`: ToSerialized[/* "rest" */ String]
  ): RestType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestType]
  }
  
  extension [Self <: RestType](x: Self) {
    
    inline def setElementType(value: ToSerialized[typings.typedoc.modelsTypesMod.SomeType]): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setElementTypeVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "elementType", js.Array(value*))
    
    inline def setType(value: ToSerialized[/* "rest" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
