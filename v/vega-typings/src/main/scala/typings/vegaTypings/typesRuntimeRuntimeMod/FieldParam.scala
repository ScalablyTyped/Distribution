package typings.vegaTypings.typesRuntimeRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldParam
  extends StObject
     with AccessorParameters
     with BuiltinParameter {
  
  @JSName("$field")
  var $field: String | Null
  
  @JSName("$name")
  var $name: js.UndefOr[String] = js.undefined
}
object FieldParam {
  
  inline def apply(): FieldParam = {
    val __obj = js.Dynamic.literal($field = null)
    __obj.asInstanceOf[FieldParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldParam] (val x: Self) extends AnyVal {
    
    inline def set$field(value: String): Self = StObject.set(x, "$field", value.asInstanceOf[js.Any])
    
    inline def set$fieldNull: Self = StObject.set(x, "$field", null)
    
    inline def set$name(value: String): Self = StObject.set(x, "$name", value.asInstanceOf[js.Any])
    
    inline def set$nameUndefined: Self = StObject.set(x, "$name", js.undefined)
  }
}
