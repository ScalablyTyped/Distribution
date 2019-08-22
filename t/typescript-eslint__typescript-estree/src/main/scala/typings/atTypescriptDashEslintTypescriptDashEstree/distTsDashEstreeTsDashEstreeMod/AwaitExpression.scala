package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwaitExpression
  extends TSUnaryExpression
     with BaseNode
     with Node {
  var argument: TSUnaryExpression
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.AwaitExpression
}

object AwaitExpression {
  @scala.inline
  def apply(
    argument: TSUnaryExpression,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.AwaitExpression,
    parent: Node = null
  ): AwaitExpression = {
    val __obj = js.Dynamic.literal(argument = argument, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[AwaitExpression]
  }
}

