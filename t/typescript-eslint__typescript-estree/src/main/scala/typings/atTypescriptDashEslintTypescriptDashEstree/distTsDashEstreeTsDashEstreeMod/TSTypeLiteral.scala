package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeLiteral
  extends BaseNode
     with Node
     with TypeNode {
  var members: js.Array[TypeElement]
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypeLiteral
}

object TSTypeLiteral {
  @scala.inline
  def apply(
    loc: SourceLocation,
    members: js.Array[TypeElement],
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypeLiteral,
    parent: Node = null
  ): TSTypeLiteral = {
    val __obj = js.Dynamic.literal(loc = loc, members = members, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSTypeLiteral]
  }
}

