package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICallExpression extends IASTSpan {
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
    val __obj = js.Dynamic.literal(_end = _end, _start = _start, argumentList = argumentList, end = js.Any.fromFunction0(end), expression = expression, start = js.Any.fromFunction0(start))
  
    __obj.asInstanceOf[ICallExpression]
  }
}

