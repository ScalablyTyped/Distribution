package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSIndexedAccessType
  extends BaseNode
     with Node
     with TypeNode {
  var indexType: TypeNode
  var objectType: TypeNode
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSIndexedAccessType
}

object TSIndexedAccessType {
  @scala.inline
  def apply(
    indexType: TypeNode,
    loc: SourceLocation,
    objectType: TypeNode,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSIndexedAccessType,
    parent: Node = null
  ): TSIndexedAccessType = {
    val __obj = js.Dynamic.literal(indexType = indexType, loc = loc, objectType = objectType, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSIndexedAccessType]
  }
}

