package typings.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.LiteralType, 'type' | 'value'> */
trait LiteralType extends StObject {
  
  var `type`: ToSerialized[/* "literal" */ String]
  
  var value: ToSerialized[String | Double | Boolean | Null | js.BigInt]
}
object LiteralType {
  
  inline def apply(
    `type`: ToSerialized[/* "literal" */ String],
    value: ToSerialized[String | Double | Boolean | Null | js.BigInt]
  ): LiteralType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralType]
  }
  
  extension [Self <: LiteralType](x: Self) {
    
    inline def setType(value: ToSerialized[/* "literal" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ToSerialized[String | Double | Boolean | Null | js.BigInt]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
