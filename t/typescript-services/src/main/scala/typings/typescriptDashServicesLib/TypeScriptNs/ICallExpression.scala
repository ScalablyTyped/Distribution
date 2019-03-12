package typings
package typescriptDashServicesLib.TypeScriptNs

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
    _end: scala.Double,
    _start: scala.Double,
    argumentList: ArgumentList,
    end: () => scala.Double,
    expression: AST,
    start: () => scala.Double
  ): ICallExpression = {
    val __obj = js.Dynamic.literal(_end = _end, _start = _start, argumentList = argumentList, end = js.Any.fromFunction0(end), expression = expression, start = js.Any.fromFunction0(start))
  
    __obj.asInstanceOf[ICallExpression]
  }
}

