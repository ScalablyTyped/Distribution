package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructuredOutputKeys extends StObject {
  
  var structuredOutputKeys: js.Array[String]
}
object StructuredOutputKeys {
  
  inline def apply(structuredOutputKeys: js.Array[String]): StructuredOutputKeys = {
    val __obj = js.Dynamic.literal(structuredOutputKeys = structuredOutputKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructuredOutputKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StructuredOutputKeys] (val x: Self) extends AnyVal {
    
    inline def setStructuredOutputKeys(value: js.Array[String]): Self = StObject.set(x, "structuredOutputKeys", value.asInstanceOf[js.Any])
    
    inline def setStructuredOutputKeysVarargs(value: String*): Self = StObject.set(x, "structuredOutputKeys", js.Array(value*))
  }
}
