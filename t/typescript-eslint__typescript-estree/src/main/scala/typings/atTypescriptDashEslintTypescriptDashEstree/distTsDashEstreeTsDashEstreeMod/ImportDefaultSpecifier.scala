package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportDefaultSpecifier
  extends BaseNode
     with ImportClause
     with Node {
  var local: Identifier
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ImportDefaultSpecifier
}

object ImportDefaultSpecifier {
  @scala.inline
  def apply(
    loc: SourceLocation,
    local: Identifier,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ImportDefaultSpecifier,
    parent: Node = null
  ): ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(loc = loc, local = local, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ImportDefaultSpecifier]
  }
}

