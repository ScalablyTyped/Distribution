package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberExpression
  extends LeftHandSideExpression
     with MemberExpressionBase
     with Node {
  @JSName("optional")
  var optional_MemberExpression: `false`
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.MemberExpression
}

object MemberExpression {
  @scala.inline
  def apply(
    computed: Boolean,
    loc: SourceLocation,
    `object`: LeftHandSideExpression,
    optional: `false`,
    property: Expression | Identifier,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.MemberExpression,
    parent: Node = null
  ): MemberExpression = {
    val __obj = js.Dynamic.literal(computed = computed, loc = loc, optional = optional, property = property.asInstanceOf[js.Any], range = range)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[MemberExpression]
  }
}

