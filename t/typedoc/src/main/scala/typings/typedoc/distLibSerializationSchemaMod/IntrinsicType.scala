package typings.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.IntrinsicType, 'type' | 'name'> */
trait IntrinsicType extends StObject {
  
  var name: ToSerialized[String]
  
  var `type`: ToSerialized[/* "intrinsic" */ String]
}
object IntrinsicType {
  
  inline def apply(name: ToSerialized[String], `type`: ToSerialized[/* "intrinsic" */ String]): IntrinsicType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrinsicType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntrinsicType] (val x: Self) extends AnyVal {
    
    inline def setName(value: ToSerialized[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ToSerialized[/* "intrinsic" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
