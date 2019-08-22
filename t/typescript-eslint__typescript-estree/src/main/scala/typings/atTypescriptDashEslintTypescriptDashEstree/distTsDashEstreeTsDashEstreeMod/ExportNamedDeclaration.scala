package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportNamedDeclaration
  extends DeclarationStatement
     with BaseNode
     with Node {
  var declaration: ExportDeclaration | Null
  var source: Expression | Null
  var specifiers: js.Array[ExportSpecifier]
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ExportNamedDeclaration
}

object ExportNamedDeclaration {
  @scala.inline
  def apply(
    loc: SourceLocation,
    range: Range,
    specifiers: js.Array[ExportSpecifier],
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ExportNamedDeclaration,
    declaration: ExportDeclaration = null,
    parent: Node = null,
    source: Expression = null
  ): ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(loc = loc, range = range, specifiers = specifiers)
    __obj.updateDynamic("type")(`type`)
    if (declaration != null) __obj.updateDynamic("declaration")(declaration)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ExportNamedDeclaration]
  }
}

