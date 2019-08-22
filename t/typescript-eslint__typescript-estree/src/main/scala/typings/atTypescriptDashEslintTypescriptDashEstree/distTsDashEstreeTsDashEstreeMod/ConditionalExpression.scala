package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalExpression
  extends Expression
     with BaseNode
     with Node {
  var alternate: Expression
  var consequent: Expression
  var test: Expression
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ConditionalExpression
}

object ConditionalExpression {
  @scala.inline
  def apply(
    alternate: Expression,
    consequent: Expression,
    loc: SourceLocation,
    range: Range,
    test: Expression,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ConditionalExpression,
    parent: Node = null
  ): ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate, consequent = consequent, loc = loc, range = range, test = test)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ConditionalExpression]
  }
}

