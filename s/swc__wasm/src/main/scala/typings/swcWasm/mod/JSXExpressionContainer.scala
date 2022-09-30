package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXExpressionContainer
  extends StObject
     with Node
     with HasSpan
     with JSXAttrValue
     with JSXElementChild {
  
  var expression: JSXExpression
  
  @JSName("type")
  var type_JSXExpressionContainer: typings.swcWasm.swcWasmStrings.JSXExpressionContainer
}
object JSXExpressionContainer {
  
  inline def apply(expression: JSXExpression, span: Span): JSXExpressionContainer = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXExpressionContainer")
    __obj.asInstanceOf[JSXExpressionContainer]
  }
  
  extension [Self <: JSXExpressionContainer](x: Self) {
    
    inline def setExpression(value: JSXExpression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.JSXExpressionContainer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
