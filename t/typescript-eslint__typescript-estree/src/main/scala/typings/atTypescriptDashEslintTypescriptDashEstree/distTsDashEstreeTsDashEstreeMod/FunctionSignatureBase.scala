package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionSignatureBase extends BaseNode {
  var params: js.Array[Parameter]
  var returnType: js.UndefOr[TSTypeAnnotation] = js.undefined
  var typeParameters: js.UndefOr[TSTypeParameterDeclaration] = js.undefined
}

object FunctionSignatureBase {
  @scala.inline
  def apply(
    loc: SourceLocation,
    params: js.Array[Parameter],
    range: Range,
    parent: Node = null,
    returnType: TSTypeAnnotation = null,
    typeParameters: TSTypeParameterDeclaration = null
  ): FunctionSignatureBase = {
    val __obj = js.Dynamic.literal(loc = loc, params = params, range = range)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[FunctionSignatureBase]
  }
}

