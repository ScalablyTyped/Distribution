package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.constructor
import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.get
import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.method
import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodDefinitionBase extends BaseNode {
  var accessibility: js.UndefOr[Accessibility] = js.undefined
  var computed: Boolean
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var key: Expression
  var kind: method | get | set | constructor
  var static: Boolean
  var typeParameters: js.UndefOr[TSTypeParameterDeclaration] = js.undefined
  var value: FunctionExpression | TSEmptyBodyFunctionExpression
}

object MethodDefinitionBase {
  @scala.inline
  def apply(
    computed: Boolean,
    key: Expression,
    kind: method | get | set | constructor,
    loc: SourceLocation,
    range: Range,
    static: Boolean,
    value: FunctionExpression | TSEmptyBodyFunctionExpression,
    accessibility: Accessibility = null,
    decorators: js.Array[Decorator] = null,
    parent: Node = null,
    typeParameters: TSTypeParameterDeclaration = null
  ): MethodDefinitionBase = {
    val __obj = js.Dynamic.literal(computed = computed, key = key, kind = kind.asInstanceOf[js.Any], loc = loc, range = range, static = static, value = value.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[MethodDefinitionBase]
  }
}

