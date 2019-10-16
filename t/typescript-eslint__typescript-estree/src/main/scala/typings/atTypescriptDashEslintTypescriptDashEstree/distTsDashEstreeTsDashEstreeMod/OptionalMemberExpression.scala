package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalMemberExpression
  extends LeftHandSideExpression
     with MemberExpressionBase
     with Node {
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.OptionalMemberExpression
}

object OptionalMemberExpression {
  @scala.inline
  def apply(
    computed: Boolean,
    loc: SourceLocation,
    `object`: LeftHandSideExpression,
    optional: Boolean,
    property: Expression | Identifier,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.OptionalMemberExpression,
    parent: Node = null
  ): OptionalMemberExpression = {
    val __obj = js.Dynamic.literal(computed = computed, loc = loc, optional = optional, property = property.asInstanceOf[js.Any], range = range)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[OptionalMemberExpression]
  }
}

