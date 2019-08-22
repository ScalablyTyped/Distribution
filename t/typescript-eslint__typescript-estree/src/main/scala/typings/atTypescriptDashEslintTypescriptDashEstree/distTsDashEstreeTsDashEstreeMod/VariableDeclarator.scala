package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDeclarator
  extends BaseNode
     with Node {
  var definite: js.UndefOr[Boolean] = js.undefined
  var id: BindingName
  var init: Expression | Null
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.VariableDeclarator
}

object VariableDeclarator {
  @scala.inline
  def apply(
    id: BindingName,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.VariableDeclarator,
    definite: js.UndefOr[Boolean] = js.undefined,
    init: Expression = null,
    parent: Node = null
  ): VariableDeclarator = {
    val __obj = js.Dynamic.literal(id = id, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(definite)) __obj.updateDynamic("definite")(definite)
    if (init != null) __obj.updateDynamic("init")(init)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[VariableDeclarator]
  }
}

