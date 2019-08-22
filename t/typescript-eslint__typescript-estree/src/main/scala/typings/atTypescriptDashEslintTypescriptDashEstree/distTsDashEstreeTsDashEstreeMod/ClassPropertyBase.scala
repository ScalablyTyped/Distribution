package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassPropertyBase extends BaseNode {
  var accessibility: js.UndefOr[Accessibility] = js.undefined
  var computed: Boolean
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var definite: js.UndefOr[Boolean] = js.undefined
  var key: PropertyName
  var optional: js.UndefOr[Boolean] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var static: Boolean
  var typeAnnotation: js.UndefOr[TSTypeAnnotation] = js.undefined
  var value: Expression
}

object ClassPropertyBase {
  @scala.inline
  def apply(
    computed: Boolean,
    key: PropertyName,
    loc: SourceLocation,
    range: Range,
    static: Boolean,
    value: Expression,
    accessibility: Accessibility = null,
    decorators: js.Array[Decorator] = null,
    definite: js.UndefOr[Boolean] = js.undefined,
    optional: js.UndefOr[Boolean] = js.undefined,
    parent: Node = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    typeAnnotation: TSTypeAnnotation = null
  ): ClassPropertyBase = {
    val __obj = js.Dynamic.literal(computed = computed, key = key, loc = loc, range = range, static = static, value = value)
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (!js.isUndefined(definite)) __obj.updateDynamic("definite")(definite)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[ClassPropertyBase]
  }
}

