package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.OptionalType, 'type' | 'elementType'> */
trait OptionalType extends StObject {
  
  var elementType: ToSerialized[typings.typedoc.modelsTypesMod.SomeType]
  
  var `type`: ToSerialized[/* "optional" */ String]
}
object OptionalType {
  
  inline def apply(
    elementType: ToSerialized[typings.typedoc.modelsTypesMod.SomeType],
    `type`: ToSerialized[/* "optional" */ String]
  ): OptionalType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalType]
  }
  
  extension [Self <: OptionalType](x: Self) {
    
    inline def setElementType(value: ToSerialized[typings.typedoc.modelsTypesMod.SomeType]): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setElementTypeVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "elementType", js.Array(value*))
    
    inline def setType(value: ToSerialized[/* "optional" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
