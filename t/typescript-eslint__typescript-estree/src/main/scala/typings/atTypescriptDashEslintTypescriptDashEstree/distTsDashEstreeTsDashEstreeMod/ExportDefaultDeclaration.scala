package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportDefaultDeclaration
  extends DeclarationStatement
     with BaseNode
     with Node {
  var declaration: ExportDeclaration | Expression
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ExportDefaultDeclaration
}

object ExportDefaultDeclaration {
  @scala.inline
  def apply(
    declaration: ExportDeclaration | Expression,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ExportDefaultDeclaration,
    parent: Node = null
  ): ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ExportDefaultDeclaration]
  }
}

