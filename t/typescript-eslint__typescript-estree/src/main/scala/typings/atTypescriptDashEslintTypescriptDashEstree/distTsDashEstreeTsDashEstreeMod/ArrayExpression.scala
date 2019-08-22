package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayExpression
  extends PrimaryExpression
     with BaseNode
     with Node {
  var elements: js.Array[Expression]
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ArrayExpression
}

object ArrayExpression {
  @scala.inline
  def apply(
    elements: js.Array[Expression],
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ArrayExpression,
    parent: Node = null
  ): ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ArrayExpression]
  }
}

