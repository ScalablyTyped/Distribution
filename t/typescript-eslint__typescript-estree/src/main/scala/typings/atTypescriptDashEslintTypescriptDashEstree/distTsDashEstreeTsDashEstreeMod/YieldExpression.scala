package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YieldExpression
  extends Expression
     with BaseNode
     with Node {
  var argument: js.UndefOr[Expression] = js.undefined
  var delegate: Boolean
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.YieldExpression
}

object YieldExpression {
  @scala.inline
  def apply(
    delegate: Boolean,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.YieldExpression,
    argument: Expression = null,
    parent: Node = null
  ): YieldExpression = {
    val __obj = js.Dynamic.literal(delegate = delegate, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (argument != null) __obj.updateDynamic("argument")(argument)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[YieldExpression]
  }
}

