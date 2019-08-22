package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSLiteralType
  extends BaseNode
     with Node
     with TypeNode {
  var literal: LiteralExpression | UnaryExpression | UpdateExpression
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSLiteralType
}

object TSLiteralType {
  @scala.inline
  def apply(
    literal: LiteralExpression | UnaryExpression | UpdateExpression,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSLiteralType,
    parent: Node = null
  ): TSLiteralType = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any], loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSLiteralType]
  }
}

