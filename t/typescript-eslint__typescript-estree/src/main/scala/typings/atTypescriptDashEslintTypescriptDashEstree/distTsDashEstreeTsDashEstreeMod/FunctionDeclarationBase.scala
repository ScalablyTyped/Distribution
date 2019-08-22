package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDeclarationBase extends BaseNode {
  var async: Boolean
  var body: js.UndefOr[BlockStatement | Null] = js.undefined
  var declare: js.UndefOr[Boolean] = js.undefined
  var expression: Boolean
  var generator: Boolean
  var id: Identifier | Null
  var params: js.Array[Parameter]
  var returnType: js.UndefOr[TSTypeAnnotation] = js.undefined
  var typeParameters: js.UndefOr[TSTypeParameterDeclaration] = js.undefined
}

object FunctionDeclarationBase {
  @scala.inline
  def apply(
    async: Boolean,
    expression: Boolean,
    generator: Boolean,
    loc: SourceLocation,
    params: js.Array[Parameter],
    range: Range,
    body: BlockStatement = null,
    declare: js.UndefOr[Boolean] = js.undefined,
    id: Identifier = null,
    parent: Node = null,
    returnType: TSTypeAnnotation = null,
    typeParameters: TSTypeParameterDeclaration = null
  ): FunctionDeclarationBase = {
    val __obj = js.Dynamic.literal(async = async, expression = expression, generator = generator, loc = loc, params = params, range = range)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (id != null) __obj.updateDynamic("id")(id)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[FunctionDeclarationBase]
  }
}

