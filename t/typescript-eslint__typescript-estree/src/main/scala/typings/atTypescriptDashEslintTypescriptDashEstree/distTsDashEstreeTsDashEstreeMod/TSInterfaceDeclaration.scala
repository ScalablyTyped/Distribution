package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSInterfaceDeclaration
  extends DeclarationStatement
     with BaseNode
     with ExportDeclaration
     with Node {
  var `abstract`: js.UndefOr[Boolean] = js.undefined
  var body: TSInterfaceBody
  var declare: js.UndefOr[Boolean] = js.undefined
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var `extends`: js.UndefOr[js.Array[ExpressionWithTypeArguments]] = js.undefined
  var id: Identifier
  var implements: js.UndefOr[js.Array[ExpressionWithTypeArguments]] = js.undefined
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSInterfaceDeclaration
  var typeParameters: js.UndefOr[TSTypeParameterDeclaration] = js.undefined
}

object TSInterfaceDeclaration {
  @scala.inline
  def apply(
    body: TSInterfaceBody,
    id: Identifier,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSInterfaceDeclaration,
    `abstract`: js.UndefOr[Boolean] = js.undefined,
    declare: js.UndefOr[Boolean] = js.undefined,
    decorators: js.Array[Decorator] = null,
    `extends`: js.Array[ExpressionWithTypeArguments] = null,
    implements: js.Array[ExpressionWithTypeArguments] = null,
    parent: Node = null,
    typeParameters: TSTypeParameterDeclaration = null
  ): TSInterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body, id = id, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`)
    if (implements != null) __obj.updateDynamic("implements")(implements)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSInterfaceDeclaration]
  }
}

