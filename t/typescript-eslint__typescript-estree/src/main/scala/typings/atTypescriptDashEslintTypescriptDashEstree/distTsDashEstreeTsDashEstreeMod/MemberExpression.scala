package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberExpression
  extends LeftHandSideExpression
     with BaseNode
     with Node {
  var computed: js.UndefOr[Boolean] = js.undefined
  var `object`: LeftHandSideExpression
  var property: Expression | Identifier
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.MemberExpression
}

object MemberExpression {
  @scala.inline
  def apply(
    loc: SourceLocation,
    `object`: LeftHandSideExpression,
    property: Expression | Identifier,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.MemberExpression,
    computed: js.UndefOr[Boolean] = js.undefined,
    parent: Node = null
  ): MemberExpression = {
    val __obj = js.Dynamic.literal(loc = loc, property = property.asInstanceOf[js.Any], range = range)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[MemberExpression]
  }
}

