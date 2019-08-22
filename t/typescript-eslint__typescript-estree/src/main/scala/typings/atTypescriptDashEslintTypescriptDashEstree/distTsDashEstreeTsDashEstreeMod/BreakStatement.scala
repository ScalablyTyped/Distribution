package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakStatement
  extends BaseNode
     with Node
     with Statement {
  var label: Identifier | Null
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.BreakStatement
}

object BreakStatement {
  @scala.inline
  def apply(
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.BreakStatement,
    label: Identifier = null,
    parent: Node = null
  ): BreakStatement = {
    val __obj = js.Dynamic.literal(loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (label != null) __obj.updateDynamic("label")(label)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[BreakStatement]
  }
}

