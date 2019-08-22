package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForOfStatement
  extends IterationStatement
     with BaseNode
     with Node {
  var await: Boolean
  var body: Statement
  var left: ForInitialiser
  var right: Expression
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ForOfStatement
}

object ForOfStatement {
  @scala.inline
  def apply(
    await: Boolean,
    body: Statement,
    left: ForInitialiser,
    loc: SourceLocation,
    range: Range,
    right: Expression,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ForOfStatement,
    parent: Node = null
  ): ForOfStatement = {
    val __obj = js.Dynamic.literal(await = await, body = body, left = left, loc = loc, range = range, right = right)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ForOfStatement]
  }
}

