package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSParameterProperty
  extends BaseNode
     with Node
     with Parameter {
  var accessibility: js.UndefOr[Accessibility] = js.undefined
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var export: js.UndefOr[Boolean] = js.undefined
  var parameter: AssignmentPattern | BindingName | RestElement
  var readonly: js.UndefOr[Boolean] = js.undefined
  var static: js.UndefOr[Boolean] = js.undefined
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSParameterProperty
}

object TSParameterProperty {
  @scala.inline
  def apply(
    loc: SourceLocation,
    parameter: AssignmentPattern | BindingName | RestElement,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSParameterProperty,
    accessibility: Accessibility = null,
    decorators: js.Array[Decorator] = null,
    export: js.UndefOr[Boolean] = js.undefined,
    parent: Node = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    static: js.UndefOr[Boolean] = js.undefined
  ): TSParameterProperty = {
    val __obj = js.Dynamic.literal(loc = loc, parameter = parameter.asInstanceOf[js.Any], range = range)
    __obj.updateDynamic("type")(`type`)
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (!js.isUndefined(export)) __obj.updateDynamic("export")(export)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    __obj.asInstanceOf[TSParameterProperty]
  }
}

