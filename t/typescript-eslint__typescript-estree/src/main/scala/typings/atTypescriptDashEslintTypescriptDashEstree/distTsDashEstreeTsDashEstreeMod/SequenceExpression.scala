package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceExpression
  extends Expression
     with BaseNode
     with Node {
  var expressions: js.Array[Expression]
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.SequenceExpression
}

object SequenceExpression {
  @scala.inline
  def apply(
    expressions: js.Array[Expression],
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.SequenceExpression,
    parent: Node = null
  ): SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[SequenceExpression]
  }
}

