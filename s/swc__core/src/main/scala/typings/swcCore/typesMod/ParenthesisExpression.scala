package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParenthesisExpression
  extends StObject
     with ExpressionBase
     with Expression {
  
  var expression: Expression
  
  @JSName("type")
  var type_ParenthesisExpression: typings.swcCore.swcCoreStrings.ParenthesisExpression
}
object ParenthesisExpression {
  
  inline def apply(expression: Expression, span: Span): ParenthesisExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParenthesisExpression")
    __obj.asInstanceOf[ParenthesisExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParenthesisExpression] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.ParenthesisExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
