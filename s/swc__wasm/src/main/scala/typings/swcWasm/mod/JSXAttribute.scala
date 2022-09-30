package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXAttribute
  extends StObject
     with Node
     with HasSpan
     with JSXAttributeOrSpread {
  
  var name: JSXAttributeName
  
  @JSName("type")
  var type_JSXAttribute: typings.swcWasm.swcWasmStrings.JSXAttribute
  
  var value: js.UndefOr[JSXAttrValue] = js.undefined
}
object JSXAttribute {
  
  inline def apply(name: JSXAttributeName, span: Span): JSXAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXAttribute")
    __obj.asInstanceOf[JSXAttribute]
  }
  
  extension [Self <: JSXAttribute](x: Self) {
    
    inline def setName(value: JSXAttributeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.JSXAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: JSXAttrValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
