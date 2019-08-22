package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSPropertySignature
  extends BaseNode
     with Node
     with TypeElement {
  var accessibility: js.UndefOr[Accessibility] = js.undefined
  var computed: Boolean
  var export: js.UndefOr[Boolean] = js.undefined
  var initializer: js.UndefOr[Expression] = js.undefined
  var key: PropertyName
  var optional: js.UndefOr[Boolean] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var static: js.UndefOr[Boolean] = js.undefined
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSPropertySignature
  var typeAnnotation: js.UndefOr[TSTypeAnnotation] = js.undefined
}

object TSPropertySignature {
  @scala.inline
  def apply(
    computed: Boolean,
    key: PropertyName,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSPropertySignature,
    accessibility: Accessibility = null,
    export: js.UndefOr[Boolean] = js.undefined,
    initializer: Expression = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    parent: Node = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    static: js.UndefOr[Boolean] = js.undefined,
    typeAnnotation: TSTypeAnnotation = null
  ): TSPropertySignature = {
    val __obj = js.Dynamic.literal(computed = computed, key = key, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility)
    if (!js.isUndefined(export)) __obj.updateDynamic("export")(export)
    if (initializer != null) __obj.updateDynamic("initializer")(initializer)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[TSPropertySignature]
  }
}

