package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTupleType
  extends BaseNode
     with Node
     with TypeNode {
  var elementTypes: js.Array[TypeNode]
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTupleType
}

object TSTupleType {
  @scala.inline
  def apply(
    elementTypes: js.Array[TypeNode],
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTupleType,
    parent: Node = null
  ): TSTupleType = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSTupleType]
  }
}

