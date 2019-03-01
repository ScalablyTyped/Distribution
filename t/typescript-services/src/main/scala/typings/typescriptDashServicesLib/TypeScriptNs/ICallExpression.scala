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
    end: js.Function0[scala.Double],
    expression: AST,
    start: js.Function0[scala.Double]
  ): ICallExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_end")(_end)
    __obj.updateDynamic("_start")(_start)
    __obj.updateDynamic("argumentList")(argumentList)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("expression")(expression)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[ICallExpression]
  }
}

