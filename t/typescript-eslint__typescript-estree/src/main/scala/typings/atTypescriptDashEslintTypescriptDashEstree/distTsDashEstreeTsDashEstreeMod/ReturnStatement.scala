package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnStatement
  extends BaseNode
     with Node
     with Statement {
  var argument: Expression | Null
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ReturnStatement
}

object ReturnStatement {
  @scala.inline
  def apply(
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ReturnStatement,
    argument: Expression = null,
    parent: Node = null
  ): ReturnStatement = {
    val __obj = js.Dynamic.literal(loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (argument != null) __obj.updateDynamic("argument")(argument)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ReturnStatement]
  }
}

