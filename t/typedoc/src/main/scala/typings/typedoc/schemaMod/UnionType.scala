package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.UnionType, 'type' | 'types'> */
trait UnionType extends StObject {
  
  var `type`: ToSerialized[/* "union" */ String]
  
  var types: ToSerialized[js.Array[typings.typedoc.modelsTypesMod.SomeType]]
}
object UnionType {
  
  inline def apply(
    `type`: ToSerialized[/* "union" */ String],
    types: ToSerialized[js.Array[typings.typedoc.modelsTypesMod.SomeType]]
  ): UnionType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionType]
  }
  
  extension [Self <: UnionType](x: Self) {
    
    inline def setType(value: ToSerialized[/* "union" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setTypes(value: ToSerialized[js.Array[typings.typedoc.modelsTypesMod.SomeType]]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: (typings.typedoc.modelsTypesMod.SomeType | _ModelToObject[Any])*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
