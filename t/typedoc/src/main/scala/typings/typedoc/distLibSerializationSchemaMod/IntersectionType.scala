package typings.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.IntersectionType, 'type' | 'types'> */
trait IntersectionType extends StObject {
  
  var `type`: ToSerialized[/* "intersection" */ String]
  
  var types: ToSerialized[js.Array[typings.typedoc.distLibModelsTypesMod.SomeType]]
}
object IntersectionType {
  
  inline def apply(
    `type`: ToSerialized[/* "intersection" */ String],
    types: ToSerialized[js.Array[typings.typedoc.distLibModelsTypesMod.SomeType]]
  ): IntersectionType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionType]
  }
  
  extension [Self <: IntersectionType](x: Self) {
    
    inline def setType(value: ToSerialized[/* "intersection" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: ToSerialized[js.Array[typings.typedoc.distLibModelsTypesMod.SomeType]]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: typings.typedoc.distLibModelsTypesMod.SomeType*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
