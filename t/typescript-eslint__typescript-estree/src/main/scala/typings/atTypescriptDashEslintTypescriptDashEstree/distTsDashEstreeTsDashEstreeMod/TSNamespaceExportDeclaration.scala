package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSNamespaceExportDeclaration
  extends DeclarationStatement
     with BaseNode
     with Node {
  var id: Identifier
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSNamespaceExportDeclaration
}

object TSNamespaceExportDeclaration {
  @scala.inline
  def apply(
    id: Identifier,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSNamespaceExportDeclaration,
    parent: Node = null
  ): TSNamespaceExportDeclaration = {
    val __obj = js.Dynamic.literal(id = id, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSNamespaceExportDeclaration]
  }
}

