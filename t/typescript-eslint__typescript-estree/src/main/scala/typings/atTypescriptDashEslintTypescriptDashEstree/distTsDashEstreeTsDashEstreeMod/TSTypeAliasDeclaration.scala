package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeAliasDeclaration
  extends DeclarationStatement
     with BaseNode
     with ExportDeclaration
     with Node {
  var declare: js.UndefOr[Boolean] = js.undefined
  var id: Identifier
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypeAliasDeclaration
  var typeAnnotation: TypeNode
  var typeParameters: js.UndefOr[TSTypeParameterDeclaration] = js.undefined
}

object TSTypeAliasDeclaration {
  @scala.inline
  def apply(
    id: Identifier,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypeAliasDeclaration,
    typeAnnotation: TypeNode,
    declare: js.UndefOr[Boolean] = js.undefined,
    parent: Node = null,
    typeParameters: TSTypeParameterDeclaration = null
  ): TSTypeAliasDeclaration = {
    val __obj = js.Dynamic.literal(id = id, loc = loc, range = range, typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSTypeAliasDeclaration]
  }
}

