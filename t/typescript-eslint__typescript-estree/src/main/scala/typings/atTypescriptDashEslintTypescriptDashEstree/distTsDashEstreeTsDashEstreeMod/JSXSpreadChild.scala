package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXSpreadChild
  extends Expression
     with BaseNode
     with JSXExpression
     with Node {
  var expression: Expression | JSXEmptyExpression
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.JSXSpreadChild
}

object JSXSpreadChild {
  @scala.inline
  def apply(
    expression: Expression | JSXEmptyExpression,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.JSXSpreadChild,
    parent: Node = null
  ): JSXSpreadChild = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[JSXSpreadChild]
  }
}

