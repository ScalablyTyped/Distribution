package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryExpression
  extends StObject
     with ExpressionBase
     with Expression {
  
  var left: Expression
  
  var operator: BinaryOperator
  
  var right: Expression
  
  @JSName("type")
  var type_BinaryExpression: typings.swcCore.swcCoreStrings.BinaryExpression
}
object BinaryExpression {
  
  inline def apply(left: Expression, operator: BinaryOperator, right: Expression, span: Span): BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[BinaryExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BinaryExpression] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: Expression): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: BinaryOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.BinaryExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
