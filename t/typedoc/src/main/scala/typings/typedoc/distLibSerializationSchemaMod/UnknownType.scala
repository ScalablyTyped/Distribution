package typings.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.UnknownType, 'type' | 'name'> */
trait UnknownType extends StObject {
  
  var name: ToSerialized[String]
  
  var `type`: ToSerialized[/* "unknown" */ String]
}
object UnknownType {
  
  inline def apply(name: ToSerialized[String], `type`: ToSerialized[/* "unknown" */ String]): UnknownType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnknownType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnknownType] (val x: Self) extends AnyVal {
    
    inline def setName(value: ToSerialized[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ToSerialized[/* "unknown" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
