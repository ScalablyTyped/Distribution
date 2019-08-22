package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSModuleDeclaration
  extends DeclarationStatement
     with BaseNode
     with ExportDeclaration
     with Node {
  var body: js.UndefOr[TSModuleBlock | TSModuleDeclaration] = js.undefined
  var declare: js.UndefOr[Boolean] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  var id: Identifier | Literal
  var modifiers: js.UndefOr[js.Array[Modifier]] = js.undefined
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSModuleDeclaration
}

object TSModuleDeclaration {
  @scala.inline
  def apply(
    id: Identifier | Literal,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSModuleDeclaration,
    body: TSModuleBlock | TSModuleDeclaration = null,
    declare: js.UndefOr[Boolean] = js.undefined,
    global: js.UndefOr[Boolean] = js.undefined,
    modifiers: js.Array[Modifier] = null,
    parent: Node = null
  ): TSModuleDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSModuleDeclaration]
  }
}

