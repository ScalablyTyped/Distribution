package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallExpressionBase extends BaseNode {
  var arguments: js.Array[Expression]
  var callee: LeftHandSideExpression
  var optional: Boolean
  var typeParameters: js.UndefOr[TSTypeParameterInstantiation] = js.undefined
}

object CallExpressionBase {
  @scala.inline
  def apply(
    arguments: js.Array[Expression],
    callee: LeftHandSideExpression,
    loc: SourceLocation,
    optional: Boolean,
    range: Range,
    parent: Node = null,
    typeParameters: TSTypeParameterInstantiation = null
  ): CallExpressionBase = {
    val __obj = js.Dynamic.literal(arguments = arguments, callee = callee, loc = loc, optional = optional, range = range)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[CallExpressionBase]
  }
}

