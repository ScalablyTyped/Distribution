package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportAllDeclaration
  extends DeclarationStatement
     with BaseNode
     with Node {
  var source: Expression | Null
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ExportAllDeclaration
}

object ExportAllDeclaration {
  @scala.inline
  def apply(
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ExportAllDeclaration,
    parent: Node = null,
    source: Expression = null
  ): ExportAllDeclaration = {
    val __obj = js.Dynamic.literal(loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ExportAllDeclaration]
  }
}

