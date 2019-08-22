package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeParameterInstantiation
  extends BaseNode
     with Node {
  var params: js.Array[TypeNode]
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypeParameterInstantiation
}

object TSTypeParameterInstantiation {
  @scala.inline
  def apply(
    loc: SourceLocation,
    params: js.Array[TypeNode],
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypeParameterInstantiation,
    parent: Node = null
  ): TSTypeParameterInstantiation = {
    val __obj = js.Dynamic.literal(loc = loc, params = params, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSTypeParameterInstantiation]
  }
}

