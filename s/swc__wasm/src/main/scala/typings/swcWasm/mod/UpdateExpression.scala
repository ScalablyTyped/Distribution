package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateExpression
  extends StObject
     with ExpressionBase
     with Expression {
  
  var argument: Expression
  
  var operator: UpdateOperator
  
  var prefix: Boolean
  
  @JSName("type")
  var type_UpdateExpression: typings.swcWasm.swcWasmStrings.UpdateExpression
}
object UpdateExpression {
  
  inline def apply(argument: Expression, operator: UpdateOperator, prefix: Boolean, span: Span): UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UpdateExpression")
    __obj.asInstanceOf[UpdateExpression]
  }
  
  extension [Self <: UpdateExpression](x: Self) {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: UpdateOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.UpdateExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
