package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectExpression
  extends PrimaryExpression
     with BaseNode
     with Node {
  var properties: js.Array[ObjectLiteralElementLike]
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ObjectExpression
}

object ObjectExpression {
  @scala.inline
  def apply(
    loc: SourceLocation,
    properties: js.Array[ObjectLiteralElementLike],
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ObjectExpression,
    parent: Node = null
  ): ObjectExpression = {
    val __obj = js.Dynamic.literal(loc = loc, properties = properties, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ObjectExpression]
  }
}

