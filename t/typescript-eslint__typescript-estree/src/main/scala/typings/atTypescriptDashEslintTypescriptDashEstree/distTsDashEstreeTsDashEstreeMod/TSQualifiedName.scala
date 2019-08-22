package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSQualifiedName
  extends BaseNode
     with EntityName
     with Node {
  var left: EntityName
  var right: Identifier
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSQualifiedName
}

object TSQualifiedName {
  @scala.inline
  def apply(
    left: EntityName,
    loc: SourceLocation,
    range: Range,
    right: Identifier,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSQualifiedName,
    parent: Node = null
  ): TSQualifiedName = {
    val __obj = js.Dynamic.literal(left = left, loc = loc, range = range, right = right)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSQualifiedName]
  }
}

