package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeQuery
  extends BaseNode
     with Node
     with TypeNode {
  var exprName: EntityName
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypeQuery
}

object TSTypeQuery {
  @scala.inline
  def apply(
    exprName: EntityName,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypeQuery,
    parent: Node = null
  ): TSTypeQuery = {
    val __obj = js.Dynamic.literal(exprName = exprName, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSTypeQuery]
  }
}

