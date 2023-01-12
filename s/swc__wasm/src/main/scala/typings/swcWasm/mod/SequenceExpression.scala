package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequenceExpression
  extends StObject
     with ExpressionBase
     with Expression {
  
  var expressions: js.Array[Expression]
  
  @JSName("type")
  var type_SequenceExpression: typings.swcWasm.swcWasmStrings.SequenceExpression
}
object SequenceExpression {
  
  inline def apply(expressions: js.Array[Expression], span: Span): SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SequenceExpression")
    __obj.asInstanceOf[SequenceExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SequenceExpression] (val x: Self) extends AnyVal {
    
    inline def setExpressions(value: js.Array[Expression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsVarargs(value: Expression*): Self = StObject.set(x, "expressions", js.Array(value*))
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.SequenceExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
