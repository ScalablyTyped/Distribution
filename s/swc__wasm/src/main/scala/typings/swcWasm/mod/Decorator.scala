package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decorator
  extends StObject
     with Node
     with HasSpan {
  
  var expression: Expression
  
  @JSName("type")
  var type_Decorator: typings.swcWasm.swcWasmStrings.Decorator
}
object Decorator {
  
  inline def apply(expression: Expression, span: Span): Decorator = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Decorator")
    __obj.asInstanceOf[Decorator]
  }
  
  extension [Self <: Decorator](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.Decorator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
