package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchStatement
  extends BaseNode
     with Node
     with Statement {
  var cases: js.Array[SwitchCase]
  var discriminant: Expression
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.SwitchStatement
}

object SwitchStatement {
  @scala.inline
  def apply(
    cases: js.Array[SwitchCase],
    discriminant: Expression,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.SwitchStatement,
    parent: Node = null
  ): SwitchStatement = {
    val __obj = js.Dynamic.literal(cases = cases, discriminant = discriminant, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[SwitchStatement]
  }
}

