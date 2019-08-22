package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThrowStatement
  extends BaseNode
     with Node
     with Statement {
  var argument: Statement | TSAsExpression | Null
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ThrowStatement
}

object ThrowStatement {
  @scala.inline
  def apply(
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ThrowStatement,
    argument: Statement | TSAsExpression = null,
    parent: Node = null
  ): ThrowStatement = {
    val __obj = js.Dynamic.literal(loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (argument != null) __obj.updateDynamic("argument")(argument.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ThrowStatement]
  }
}

