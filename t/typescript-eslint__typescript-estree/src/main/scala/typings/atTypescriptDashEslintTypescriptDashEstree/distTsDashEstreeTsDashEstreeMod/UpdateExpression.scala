package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateExpression
  extends TSUnaryExpression
     with UnaryExpressionBase
     with Node {
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.UpdateExpression
}

object UpdateExpression {
  @scala.inline
  def apply(
    argument: LeftHandSideExpression | Literal | UnaryExpression,
    loc: SourceLocation,
    operator: String,
    prefix: Boolean,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.UpdateExpression,
    parent: Node = null
  ): UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], loc = loc, operator = operator, prefix = prefix, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[UpdateExpression]
  }
}

