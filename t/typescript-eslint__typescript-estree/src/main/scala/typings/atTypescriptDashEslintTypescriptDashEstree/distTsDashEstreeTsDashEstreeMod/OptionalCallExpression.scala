package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalCallExpression
  extends LeftHandSideExpression
     with CallExpressionBase
     with Node {
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.OptionalCallExpression
}

object OptionalCallExpression {
  @scala.inline
  def apply(
    arguments: js.Array[Expression],
    callee: LeftHandSideExpression,
    loc: SourceLocation,
    optional: Boolean,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.OptionalCallExpression,
    parent: Node = null,
    typeParameters: TSTypeParameterInstantiation = null
  ): OptionalCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments, callee = callee, loc = loc, optional = optional, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[OptionalCallExpression]
  }
}

