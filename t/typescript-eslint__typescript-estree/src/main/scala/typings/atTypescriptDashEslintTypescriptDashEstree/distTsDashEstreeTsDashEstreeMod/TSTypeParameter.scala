package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeParameter
  extends BaseNode
     with Node {
  var constraint: js.UndefOr[TypeNode] = js.undefined
  var default: js.UndefOr[TypeNode] = js.undefined
  var name: Identifier
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypeParameter
}

object TSTypeParameter {
  @scala.inline
  def apply(
    loc: SourceLocation,
    name: Identifier,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypeParameter,
    constraint: TypeNode = null,
    default: TypeNode = null,
    parent: Node = null
  ): TSTypeParameter = {
    val __obj = js.Dynamic.literal(loc = loc, name = name, range = range)
    __obj.updateDynamic("type")(`type`)
    if (constraint != null) __obj.updateDynamic("constraint")(constraint)
    if (default != null) __obj.updateDynamic("default")(default)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSTypeParameter]
  }
}

