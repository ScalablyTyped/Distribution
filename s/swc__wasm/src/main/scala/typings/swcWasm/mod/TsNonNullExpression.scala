package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsNonNullExpression
  extends StObject
     with ExpressionBase
     with Expression {
  
  var expression: Expression
  
  @JSName("type")
  var type_TsNonNullExpression: typings.swcWasm.swcWasmStrings.TsNonNullExpression
}
object TsNonNullExpression {
  
  inline def apply(expression: Expression, span: Span): TsNonNullExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsNonNullExpression")
    __obj.asInstanceOf[TsNonNullExpression]
  }
  
  extension [Self <: TsNonNullExpression](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsNonNullExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
