package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallExpression
  extends LeftHandSideExpression
     with BaseNode
     with Node {
  var arguments: js.Array[Expression]
  var callee: LeftHandSideExpression
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.CallExpression
  var typeParameters: js.UndefOr[TSTypeParameterInstantiation] = js.undefined
}

object CallExpression {
  @scala.inline
  def apply(
    arguments: js.Array[Expression],
    callee: LeftHandSideExpression,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.CallExpression,
    parent: Node = null,
    typeParameters: TSTypeParameterInstantiation = null
  ): CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments, callee = callee, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[CallExpression]
  }
}

