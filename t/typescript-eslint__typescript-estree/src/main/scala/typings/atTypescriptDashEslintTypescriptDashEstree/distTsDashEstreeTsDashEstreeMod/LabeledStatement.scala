package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabeledStatement
  extends BaseNode
     with Node
     with Statement {
  var body: Statement
  var label: Identifier
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.LabeledStatement
}

object LabeledStatement {
  @scala.inline
  def apply(
    body: Statement,
    label: Identifier,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.LabeledStatement,
    parent: Node = null
  ): LabeledStatement = {
    val __obj = js.Dynamic.literal(body = body, label = label, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[LabeledStatement]
  }
}

