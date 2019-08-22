package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhileStatement
  extends IterationStatement
     with BaseNode
     with Node {
  var body: Statement
  var test: Expression
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.WhileStatement
}

object WhileStatement {
  @scala.inline
  def apply(
    body: Statement,
    loc: SourceLocation,
    range: Range,
    test: Expression,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.WhileStatement,
    parent: Node = null
  ): WhileStatement = {
    val __obj = js.Dynamic.literal(body = body, loc = loc, range = range, test = test)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[WhileStatement]
  }
}

