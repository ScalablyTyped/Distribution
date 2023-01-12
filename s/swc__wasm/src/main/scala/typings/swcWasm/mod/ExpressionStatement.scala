package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionStatement
  extends StObject
     with Node
     with HasSpan
     with Statement {
  
  var expression: Expression
  
  @JSName("type")
  var type_ExpressionStatement: typings.swcWasm.swcWasmStrings.ExpressionStatement
}
object ExpressionStatement {
  
  inline def apply(expression: Expression, span: Span): ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[ExpressionStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpressionStatement] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.ExpressionStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
