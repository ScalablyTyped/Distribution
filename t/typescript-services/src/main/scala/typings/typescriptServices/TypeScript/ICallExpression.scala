package typings.typescriptServices.TypeScript

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
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], argumentList = argumentList.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), expression = expression.asInstanceOf[js.Any], start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[ICallExpression]
  }
}

