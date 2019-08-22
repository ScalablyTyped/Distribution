package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinueStatement
  extends BaseNode
     with Node
     with Statement {
  var label: Identifier | Null
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ContinueStatement
}

object ContinueStatement {
  @scala.inline
  def apply(
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ContinueStatement,
    label: Identifier = null,
    parent: Node = null
  ): ContinueStatement = {
    val __obj = js.Dynamic.literal(loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (label != null) __obj.updateDynamic("label")(label)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ContinueStatement]
  }
}

