package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TryStatement
  extends BaseNode
     with Node
     with Statement {
  var block: BlockStatement
  var finalizer: BlockStatement
  var handler: CatchClause | Null
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TryStatement
}

object TryStatement {
  @scala.inline
  def apply(
    block: BlockStatement,
    finalizer: BlockStatement,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TryStatement,
    handler: CatchClause = null,
    parent: Node = null
  ): TryStatement = {
    val __obj = js.Dynamic.literal(block = block, finalizer = finalizer, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TryStatement]
  }
}

