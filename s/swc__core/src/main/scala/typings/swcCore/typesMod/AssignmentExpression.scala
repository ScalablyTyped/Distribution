package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignmentExpression
  extends StObject
     with ExpressionBase
     with Expression {
  
  var left: Expression | Pattern
  
  var operator: AssignmentOperator
  
  var right: Expression
  
  @JSName("type")
  var type_AssignmentExpression: typings.swcCore.swcCoreStrings.AssignmentExpression
}
object AssignmentExpression {
  
  inline def apply(left: Expression | Pattern, operator: AssignmentOperator, right: Expression, span: Span): AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentExpression")
    __obj.asInstanceOf[AssignmentExpression]
  }
  
  extension [Self <: AssignmentExpression](x: Self) {
    
    inline def setLeft(value: Expression | Pattern): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: AssignmentOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.AssignmentExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
