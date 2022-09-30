package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsConstAssertion
  extends StObject
     with ExpressionBase
     with Expression {
  
  var expression: Expression
  
  @JSName("type")
  var type_TsConstAssertion: typings.swcWasm.swcWasmStrings.TsConstAssertion
}
object TsConstAssertion {
  
  inline def apply(expression: Expression, span: Span): TsConstAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConstAssertion")
    __obj.asInstanceOf[TsConstAssertion]
  }
  
  extension [Self <: TsConstAssertion](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsConstAssertion): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
