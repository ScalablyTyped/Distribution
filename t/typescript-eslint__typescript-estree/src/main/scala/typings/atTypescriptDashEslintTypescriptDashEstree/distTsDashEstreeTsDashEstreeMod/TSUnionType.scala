package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSUnionType
  extends BaseNode
     with Node
     with TypeNode {
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSUnionType
  var types: js.Array[TypeNode]
}

object TSUnionType {
  @scala.inline
  def apply(
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSUnionType,
    types: js.Array[TypeNode],
    parent: Node = null
  ): TSUnionType = {
    val __obj = js.Dynamic.literal(loc = loc, range = range, types = types)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSUnionType]
  }
}

