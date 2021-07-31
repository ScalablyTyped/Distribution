package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICallExpression
  extends StObject
     with IASTSpan {
  
  var argumentList: ArgumentList
  
  var expression: AST
}
object ICallExpression {
  
  @scala.inline
  def apply(
    _end: Double,
    _start: Double,
    argumentList: ArgumentList,
    end: () => Double,
    expression: AST,
    start: () => Double
  ): ICallExpression = {
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], argumentList = argumentList.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), expression = expression.asInstanceOf[js.Any], start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[ICallExpression]
  }
  
  @scala.inline
  implicit class ICallExpressionMutableBuilder[Self <: ICallExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgumentList(value: ArgumentList): Self = StObject.set(x, "argumentList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: AST): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
  }
}
