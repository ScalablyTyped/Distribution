package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnaryExpressionBase extends BaseNode {
  var argument: LeftHandSideExpression | Literal | UnaryExpression
  var operator: String
  var prefix: Boolean
}

object UnaryExpressionBase {
  @scala.inline
  def apply(
    argument: LeftHandSideExpression | Literal | UnaryExpression,
    loc: SourceLocation,
    operator: String,
    prefix: Boolean,
    range: Range,
    parent: Node = null
  ): UnaryExpressionBase = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], loc = loc, operator = operator, prefix = prefix, range = range)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[UnaryExpressionBase]
  }
}

