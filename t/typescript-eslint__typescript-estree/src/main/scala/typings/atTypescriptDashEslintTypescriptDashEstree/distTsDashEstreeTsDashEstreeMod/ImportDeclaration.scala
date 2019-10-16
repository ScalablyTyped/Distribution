package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportDeclaration
  extends BaseNode
     with Node
     with Statement {
  var source: Literal
  var specifiers: js.Array[ImportClause]
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ImportDeclaration
}

object ImportDeclaration {
  @scala.inline
  def apply(
    loc: SourceLocation,
    range: Range,
    source: Literal,
    specifiers: js.Array[ImportClause],
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ImportDeclaration,
    parent: Node = null
  ): ImportDeclaration = {
    val __obj = js.Dynamic.literal(loc = loc, range = range, source = source, specifiers = specifiers)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ImportDeclaration]
  }
}

