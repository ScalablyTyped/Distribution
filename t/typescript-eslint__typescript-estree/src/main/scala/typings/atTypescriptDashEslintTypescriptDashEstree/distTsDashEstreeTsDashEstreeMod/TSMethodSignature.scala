package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSMethodSignature
  extends BaseNode
     with Node
     with TypeElement {
  var accessibility: js.UndefOr[Accessibility] = js.undefined
  var computed: Boolean
  var export: js.UndefOr[Boolean] = js.undefined
  var key: PropertyName
  var optional: js.UndefOr[Boolean] = js.undefined
  var params: js.Array[Parameter]
  var readonly: js.UndefOr[Boolean] = js.undefined
  var returnType: js.UndefOr[TSTypeAnnotation] = js.undefined
  var static: js.UndefOr[Boolean] = js.undefined
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSMethodSignature
  var typeParameters: js.UndefOr[TSTypeParameterDeclaration] = js.undefined
}

object TSMethodSignature {
  @scala.inline
  def apply(
    computed: Boolean,
    key: PropertyName,
    loc: SourceLocation,
    params: js.Array[Parameter],
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSMethodSignature,
    accessibility: Accessibility = null,
    export: js.UndefOr[Boolean] = js.undefined,
    optional: js.UndefOr[Boolean] = js.undefined,
    parent: Node = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    returnType: TSTypeAnnotation = null,
    static: js.UndefOr[Boolean] = js.undefined,
    typeParameters: TSTypeParameterDeclaration = null
  ): TSMethodSignature = {
    val __obj = js.Dynamic.literal(computed = computed, key = key, loc = loc, params = params, range = range)
    __obj.updateDynamic("type")(`type`)
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility)
    if (!js.isUndefined(export)) __obj.updateDynamic("export")(export)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType)
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSMethodSignature]
  }
}

