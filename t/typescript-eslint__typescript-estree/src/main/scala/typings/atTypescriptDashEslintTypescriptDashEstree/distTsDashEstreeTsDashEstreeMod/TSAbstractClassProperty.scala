package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSAbstractClassProperty
  extends ClassPropertyBase
     with ClassElement
     with Node {
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSAbstractClassProperty
}

object TSAbstractClassProperty {
  @scala.inline
  def apply(
    computed: Boolean,
    key: PropertyName,
    loc: SourceLocation,
    range: Range,
    static: Boolean,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSAbstractClassProperty,
    value: Expression,
    accessibility: Accessibility = null,
    decorators: js.Array[Decorator] = null,
    definite: js.UndefOr[Boolean] = js.undefined,
    optional: js.UndefOr[Boolean] = js.undefined,
    parent: Node = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    typeAnnotation: TSTypeAnnotation = null
  ): TSAbstractClassProperty = {
    val __obj = js.Dynamic.literal(computed = computed, key = key, loc = loc, range = range, static = static, value = value)
    __obj.updateDynamic("type")(`type`)
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (!js.isUndefined(definite)) __obj.updateDynamic("definite")(definite)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[TSAbstractClassProperty]
  }
}

