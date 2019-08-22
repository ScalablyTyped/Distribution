package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentExpression
  extends BinaryExpressionBase
     with Expression
     with Node {
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.AssignmentExpression
}

object AssignmentExpression {
  @scala.inline
  def apply(
    left: Expression,
    loc: SourceLocation,
    operator: String,
    range: Range,
    right: Expression,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.AssignmentExpression,
    parent: Node = null
  ): AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left, loc = loc, operator = operator, range = range, right = right)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[AssignmentExpression]
  }
}

