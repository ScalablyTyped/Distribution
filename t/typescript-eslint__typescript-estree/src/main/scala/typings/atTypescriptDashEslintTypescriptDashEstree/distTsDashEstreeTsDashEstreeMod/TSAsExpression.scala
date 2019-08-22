package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Expression because Already inherited */ trait TSAsExpression
  extends LeftHandSideExpression
     with BaseNode
     with Node {
  var expression: Expression
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSAsExpression
  var typeAnnotation: TypeNode
}

object TSAsExpression {
  @scala.inline
  def apply(
    expression: Expression,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSAsExpression,
    typeAnnotation: TypeNode,
    parent: Node = null
  ): TSAsExpression = {
    val __obj = js.Dynamic.literal(expression = expression, loc = loc, range = range, typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSAsExpression]
  }
}

