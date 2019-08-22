package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSIndexSignature
  extends BaseNode
     with ClassElement
     with Node
     with TypeElement {
  var accessibility: js.UndefOr[Accessibility] = js.undefined
  var export: js.UndefOr[Boolean] = js.undefined
  var parameters: js.Array[Parameter]
  var readonly: js.UndefOr[Boolean] = js.undefined
  var static: js.UndefOr[Boolean] = js.undefined
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSIndexSignature
  var typeAnnotation: js.UndefOr[TSTypeAnnotation] = js.undefined
}

object TSIndexSignature {
  @scala.inline
  def apply(
    loc: SourceLocation,
    parameters: js.Array[Parameter],
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSIndexSignature,
    accessibility: Accessibility = null,
    export: js.UndefOr[Boolean] = js.undefined,
    parent: Node = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    static: js.UndefOr[Boolean] = js.undefined,
    typeAnnotation: TSTypeAnnotation = null
  ): TSIndexSignature = {
    val __obj = js.Dynamic.literal(loc = loc, parameters = parameters, range = range)
    __obj.updateDynamic("type")(`type`)
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility)
    if (!js.isUndefined(export)) __obj.updateDynamic("export")(export)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[TSIndexSignature]
  }
}

