package typings.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.OptionalType, 'type' | 'elementType'> */
trait OptionalType extends StObject {
  
  var elementType: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType]
  
  var `type`: ToSerialized[/* "optional" */ String]
}
object OptionalType {
  
  inline def apply(
    elementType: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType],
    `type`: ToSerialized[/* "optional" */ String]
  ): OptionalType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionalType] (val x: Self) extends AnyVal {
    
    inline def setElementType(value: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType]): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setType(value: ToSerialized[/* "optional" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
