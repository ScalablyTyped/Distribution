package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXMemberExpression
  extends BaseNode
     with JSXTagNameExpression
     with Node {
  var `object`: JSXTagNameExpression
  var property: JSXIdentifier
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.JSXMemberExpression
}

object JSXMemberExpression {
  @scala.inline
  def apply(
    loc: SourceLocation,
    `object`: JSXTagNameExpression,
    property: JSXIdentifier,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.JSXMemberExpression,
    parent: Node = null
  ): JSXMemberExpression = {
    val __obj = js.Dynamic.literal(loc = loc, property = property, range = range)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[JSXMemberExpression]
  }
}

