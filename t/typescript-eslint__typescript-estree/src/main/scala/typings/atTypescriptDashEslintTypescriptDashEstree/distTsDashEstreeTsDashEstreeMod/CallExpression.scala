package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallExpression
  extends LeftHandSideExpression
     with CallExpressionBase
     with Node {
  @JSName("optional")
  var optional_CallExpression: `false`
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.CallExpression
}

object CallExpression {
  @scala.inline
  def apply(
    arguments: js.Array[Expression],
    callee: LeftHandSideExpression,
    loc: SourceLocation,
    optional: `false`,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.CallExpression,
    parent: Node = null,
    typeParameters: TSTypeParameterInstantiation = null
  ): CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments, callee = callee, loc = loc, optional = optional, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[CallExpression]
  }
}

