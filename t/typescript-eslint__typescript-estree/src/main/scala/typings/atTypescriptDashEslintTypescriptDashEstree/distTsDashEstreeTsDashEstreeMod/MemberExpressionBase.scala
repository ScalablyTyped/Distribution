package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberExpressionBase extends BaseNode {
  var computed: Boolean
  var `object`: LeftHandSideExpression
  var optional: Boolean
  var property: Expression | Identifier
}

object MemberExpressionBase {
  @scala.inline
  def apply(
    computed: Boolean,
    loc: SourceLocation,
    `object`: LeftHandSideExpression,
    optional: Boolean,
    property: Expression | Identifier,
    range: Range,
    parent: Node = null
  ): MemberExpressionBase = {
    val __obj = js.Dynamic.literal(computed = computed, loc = loc, optional = optional, property = property.asInstanceOf[js.Any], range = range)
    __obj.updateDynamic("object")(`object`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[MemberExpressionBase]
  }
}

