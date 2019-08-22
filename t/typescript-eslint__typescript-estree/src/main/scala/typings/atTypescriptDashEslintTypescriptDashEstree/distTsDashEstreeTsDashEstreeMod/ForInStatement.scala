package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForInStatement
  extends IterationStatement
     with BaseNode
     with Node {
  var body: Statement
  var left: ForInitialiser
  var right: Expression
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ForInStatement
}

object ForInStatement {
  @scala.inline
  def apply(
    body: Statement,
    left: ForInitialiser,
    loc: SourceLocation,
    range: Range,
    right: Expression,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ForInStatement,
    parent: Node = null
  ): ForInStatement = {
    val __obj = js.Dynamic.literal(body = body, left = left, loc = loc, range = range, right = right)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ForInStatement]
  }
}

