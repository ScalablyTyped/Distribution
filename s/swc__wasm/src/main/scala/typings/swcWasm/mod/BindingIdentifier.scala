package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingIdentifier
  extends StObject
     with PatternBase
     with Pattern
     with TsFnParameter
     with TsParameterPropertyParameter {
  
  var optional: Boolean
  
  @JSName("type")
  var type_BindingIdentifier: typings.swcWasm.swcWasmStrings.Identifier
  
  var value: String
}
object BindingIdentifier {
  
  inline def apply(optional: Boolean, span: Span, value: String): BindingIdentifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[BindingIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BindingIdentifier] (val x: Self) extends AnyVal {
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.Identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
