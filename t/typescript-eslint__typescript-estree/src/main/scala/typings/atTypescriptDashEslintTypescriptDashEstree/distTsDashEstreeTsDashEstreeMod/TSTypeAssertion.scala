package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeAssertion
  extends TSUnaryExpression
     with BaseNode
     with Node {
  var expression: UnaryExpression
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypeAssertion
  var typeAnnotation: TypeNode
}

object TSTypeAssertion {
  @scala.inline
  def apply(
    expression: UnaryExpression,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypeAssertion,
    typeAnnotation: TypeNode,
    parent: Node = null
  ): TSTypeAssertion = {
    val __obj = js.Dynamic.literal(expression = expression, loc = loc, range = range, typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSTypeAssertion]
  }
}

