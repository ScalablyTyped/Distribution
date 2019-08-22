package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfStatement
  extends BaseNode
     with Node
     with Statement {
  var alternate: Statement | Null
  var consequent: Statement
  var test: Expression
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.IfStatement
}

object IfStatement {
  @scala.inline
  def apply(
    consequent: Statement,
    loc: SourceLocation,
    range: Range,
    test: Expression,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.IfStatement,
    alternate: Statement = null,
    parent: Node = null
  ): IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent, loc = loc, range = range, test = test)
    __obj.updateDynamic("type")(`type`)
    if (alternate != null) __obj.updateDynamic("alternate")(alternate)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[IfStatement]
  }
}

