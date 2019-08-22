package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportSpecifier
  extends BaseNode
     with ImportClause
     with Node {
  var imported: Identifier
  var local: Identifier
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ImportSpecifier
}

object ImportSpecifier {
  @scala.inline
  def apply(
    imported: Identifier,
    loc: SourceLocation,
    local: Identifier,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ImportSpecifier,
    parent: Node = null
  ): ImportSpecifier = {
    val __obj = js.Dynamic.literal(imported = imported, loc = loc, local = local, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ImportSpecifier]
  }
}

