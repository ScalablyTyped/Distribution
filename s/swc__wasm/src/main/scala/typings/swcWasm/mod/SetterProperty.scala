package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetterProperty
  extends StObject
     with PropBase
     with HasSpan
     with Property {
  
  var body: js.UndefOr[BlockStatement] = js.undefined
  
  var param: Pattern
  
  @JSName("type")
  var type_SetterProperty: typings.swcWasm.swcWasmStrings.SetterProperty
}
object SetterProperty {
  
  inline def apply(key: PropertyName, param: Pattern, span: Span): SetterProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SetterProperty")
    __obj.asInstanceOf[SetterProperty]
  }
  
  extension [Self <: SetterProperty](x: Self) {
    
    inline def setBody(value: BlockStatement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setParam(value: Pattern): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.SetterProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
