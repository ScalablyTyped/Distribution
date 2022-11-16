package typings.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.TupleType, 'type'> */
trait TupleType extends StObject {
  
  var elements: js.UndefOr[ModelToObject[js.Array[typings.typedoc.distLibModelsTypesMod.SomeType]]] = js.undefined
  
  var `type`: ToSerialized[/* "tuple" */ String]
}
object TupleType {
  
  inline def apply(`type`: ToSerialized[/* "tuple" */ String]): TupleType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TupleType]
  }
  
  extension [Self <: TupleType](x: Self) {
    
    inline def setElements(value: ModelToObject[js.Array[typings.typedoc.distLibModelsTypesMod.SomeType]]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: typings.typedoc.distLibModelsTypesMod.SomeType*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setType(value: ToSerialized[/* "tuple" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
