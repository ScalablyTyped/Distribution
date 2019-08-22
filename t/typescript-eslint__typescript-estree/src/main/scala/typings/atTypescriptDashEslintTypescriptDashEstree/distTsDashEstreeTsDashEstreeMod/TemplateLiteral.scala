package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.PrimaryExpression because Already inherited */ trait TemplateLiteral
  extends LiteralExpression
     with BaseNode
     with Node {
  var expressions: js.Array[Expression]
  var quasis: js.Array[TemplateElement]
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TemplateLiteral
}

object TemplateLiteral {
  @scala.inline
  def apply(
    expressions: js.Array[Expression],
    loc: SourceLocation,
    quasis: js.Array[TemplateElement],
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TemplateLiteral,
    parent: Node = null
  ): TemplateLiteral = {
    val __obj = js.Dynamic.literal(expressions = expressions, loc = loc, quasis = quasis, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TemplateLiteral]
  }
}

