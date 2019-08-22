package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryExpressionBase extends BaseNode {
  var left: Expression
  var operator: String
  var right: Expression
}

object BinaryExpressionBase {
  @scala.inline
  def apply(
    left: Expression,
    loc: SourceLocation,
    operator: String,
    range: Range,
    right: Expression,
    parent: Node = null
  ): BinaryExpressionBase = {
    val __obj = js.Dynamic.literal(left = left, loc = loc, operator = operator, range = range, right = right)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[BinaryExpressionBase]
  }
}

