package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSIntersectionType
  extends BaseNode
     with Node
     with TypeNode {
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSIntersectionType
  var types: js.Array[TypeNode]
}

object TSIntersectionType {
  @scala.inline
  def apply(
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSIntersectionType,
    types: js.Array[TypeNode],
    parent: Node = null
  ): TSIntersectionType = {
    val __obj = js.Dynamic.literal(loc = loc, range = range, types = types)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSIntersectionType]
  }
}

