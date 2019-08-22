package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSEnumDeclaration
  extends DeclarationStatement
     with BaseNode
     with ExportDeclaration
     with Node {
  var const: js.UndefOr[Boolean] = js.undefined
  var declare: js.UndefOr[Boolean] = js.undefined
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var id: Identifier
  var members: js.Array[TSEnumMember]
  var modifiers: js.UndefOr[js.Array[Modifier]] = js.undefined
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSEnumDeclaration
}

object TSEnumDeclaration {
  @scala.inline
  def apply(
    id: Identifier,
    loc: SourceLocation,
    members: js.Array[TSEnumMember],
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSEnumDeclaration,
    const: js.UndefOr[Boolean] = js.undefined,
    declare: js.UndefOr[Boolean] = js.undefined,
    decorators: js.Array[Decorator] = null,
    modifiers: js.Array[Modifier] = null,
    parent: Node = null
  ): TSEnumDeclaration = {
    val __obj = js.Dynamic.literal(id = id, loc = loc, members = members, range = range)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(const)) __obj.updateDynamic("const")(const)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSEnumDeclaration]
  }
}

