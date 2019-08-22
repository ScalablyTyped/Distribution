package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewExpression
  extends Expression
     with BaseNode
     with Node {
  var arguments: js.Array[Expression]
  var callee: LeftHandSideExpression
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.NewExpression
  var typeParameters: js.UndefOr[TSTypeParameterInstantiation] = js.undefined
}

object NewExpression {
  @scala.inline
  def apply(
    arguments: js.Array[Expression],
    callee: LeftHandSideExpression,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.NewExpression,
    parent: Node = null,
    typeParameters: TSTypeParameterInstantiation = null
  ): NewExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments, callee = callee, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[NewExpression]
  }
}

