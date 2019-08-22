package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSpecifier
  extends BaseNode
     with Node {
  var exported: Identifier
  var local: Identifier
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ExportSpecifier
}

object ExportSpecifier {
  @scala.inline
  def apply(
    exported: Identifier,
    loc: SourceLocation,
    local: Identifier,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ExportSpecifier,
    parent: Node = null
  ): ExportSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported, loc = loc, local = local, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ExportSpecifier]
  }
}

