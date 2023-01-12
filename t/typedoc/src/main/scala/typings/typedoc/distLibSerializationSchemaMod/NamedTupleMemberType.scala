package typings.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.NamedTupleMember, 'type' | 'name' | 'isOptional' | 'element'> */
trait NamedTupleMemberType extends StObject {
  
  var element: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType]
  
  var isOptional: ToSerialized[Boolean]
  
  var name: ToSerialized[String]
  
  var `type`: ToSerialized[/* "named-tuple-member" */ String]
}
object NamedTupleMemberType {
  
  inline def apply(
    element: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType],
    isOptional: ToSerialized[Boolean],
    name: ToSerialized[String],
    `type`: ToSerialized[/* "named-tuple-member" */ String]
  ): NamedTupleMemberType = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedTupleMemberType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NamedTupleMemberType] (val x: Self) extends AnyVal {
    
    inline def setElement(value: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setIsOptional(value: ToSerialized[Boolean]): Self = StObject.set(x, "isOptional", value.asInstanceOf[js.Any])
    
    inline def setName(value: ToSerialized[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ToSerialized[/* "named-tuple-member" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
