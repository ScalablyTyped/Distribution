package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithStatement
  extends BaseNode
     with Node
     with Statement {
  var body: Statement
  var `object`: Expression
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.WithStatement
}

object WithStatement {
  @scala.inline
  def apply(
    body: Statement,
    loc: SourceLocation,
    `object`: Expression,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.WithStatement,
    parent: Node = null
  ): WithStatement = {
    val __obj = js.Dynamic.literal(body = body, loc = loc, range = range)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[WithStatement]
  }
}

