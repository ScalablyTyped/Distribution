package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassDeclarationBase extends BaseNode {
  var `abstract`: js.UndefOr[Boolean] = js.undefined
  var body: ClassBody
  var declare: js.UndefOr[Boolean] = js.undefined
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var id: js.UndefOr[Identifier] = js.undefined
  var implements: js.UndefOr[js.Array[ExpressionWithTypeArguments]] = js.undefined
  var superClass: js.UndefOr[LeftHandSideExpression] = js.undefined
  var superTypeParameters: js.UndefOr[TSTypeParameterInstantiation] = js.undefined
  var typeParameters: js.UndefOr[TSTypeParameterDeclaration] = js.undefined
}

object ClassDeclarationBase {
  @scala.inline
  def apply(
    body: ClassBody,
    loc: SourceLocation,
    range: Range,
    `abstract`: js.UndefOr[Boolean] = js.undefined,
    declare: js.UndefOr[Boolean] = js.undefined,
    decorators: js.Array[Decorator] = null,
    id: Identifier = null,
    implements: js.Array[ExpressionWithTypeArguments] = null,
    parent: Node = null,
    superClass: LeftHandSideExpression = null,
    superTypeParameters: TSTypeParameterInstantiation = null,
    typeParameters: TSTypeParameterDeclaration = null
  ): ClassDeclarationBase = {
    val __obj = js.Dynamic.literal(body = body, loc = loc, range = range)
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (id != null) __obj.updateDynamic("id")(id)
    if (implements != null) __obj.updateDynamic("implements")(implements)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (superClass != null) __obj.updateDynamic("superClass")(superClass)
    if (superTypeParameters != null) __obj.updateDynamic("superTypeParameters")(superTypeParameters)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[ClassDeclarationBase]
  }
}

