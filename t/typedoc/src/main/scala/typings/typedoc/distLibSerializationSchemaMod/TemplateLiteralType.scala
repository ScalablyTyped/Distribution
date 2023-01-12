package typings.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.TemplateLiteralType, 'type' | 'head'> */
trait TemplateLiteralType extends StObject {
  
  var head: ToSerialized[String]
  
  var tail: js.Array[js.Tuple2[SomeType, String]]
  
  var `type`: ToSerialized[/* "template-literal" */ String]
}
object TemplateLiteralType {
  
  inline def apply(
    head: ToSerialized[String],
    tail: js.Array[js.Tuple2[SomeType, String]],
    `type`: ToSerialized[/* "template-literal" */ String]
  ): TemplateLiteralType = {
    val __obj = js.Dynamic.literal(head = head.asInstanceOf[js.Any], tail = tail.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateLiteralType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateLiteralType] (val x: Self) extends AnyVal {
    
    inline def setHead(value: ToSerialized[String]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setTail(value: js.Array[js.Tuple2[SomeType, String]]): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
    
    inline def setTailVarargs(value: (js.Tuple2[SomeType, String])*): Self = StObject.set(x, "tail", js.Array(value*))
    
    inline def setType(value: ToSerialized[/* "template-literal" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
