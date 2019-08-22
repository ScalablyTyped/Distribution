package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.`var`
import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.const
import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.let
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDeclaration
  extends BaseNode
     with ExportDeclaration
     with ForInitialiser
     with Node
     with Statement {
  var declarations: js.Array[VariableDeclarator]
  var declare: js.UndefOr[Boolean] = js.undefined
  var kind: let | const | `var`
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.VariableDeclaration
}

object VariableDeclaration {
  @scala.inline
  def apply(
    declarations: js.Array[VariableDeclarator],
    kind: let | const | `var`,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.VariableDeclaration,
    declare: js.UndefOr[Boolean] = js.undefined,
    parent: Node = null
  ): VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations, kind = kind.asInstanceOf[js.Any], loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[VariableDeclaration]
  }
}

