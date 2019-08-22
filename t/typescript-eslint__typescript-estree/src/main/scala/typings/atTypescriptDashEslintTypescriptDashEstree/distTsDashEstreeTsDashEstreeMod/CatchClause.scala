package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatchClause
  extends BaseNode
     with Node {
  var body: BlockStatement
  var param: BindingName | Null
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.CatchClause
}

object CatchClause {
  @scala.inline
  def apply(
    body: BlockStatement,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.CatchClause,
    param: BindingName = null,
    parent: Node = null
  ): CatchClause = {
    val __obj = js.Dynamic.literal(body = body, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (param != null) __obj.updateDynamic("param")(param)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[CatchClause]
  }
}

