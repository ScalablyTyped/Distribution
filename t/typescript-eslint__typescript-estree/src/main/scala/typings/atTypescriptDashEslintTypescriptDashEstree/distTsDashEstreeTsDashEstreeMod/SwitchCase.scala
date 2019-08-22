package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchCase
  extends BaseNode
     with Node {
  var consequent: js.Array[Statement]
  var test: Expression | Null
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.SwitchCase
}

object SwitchCase {
  @scala.inline
  def apply(
    consequent: js.Array[Statement],
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.SwitchCase,
    parent: Node = null,
    test: Expression = null
  ): SwitchCase = {
    val __obj = js.Dynamic.literal(consequent = consequent, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (test != null) __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[SwitchCase]
  }
}

