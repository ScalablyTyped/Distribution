package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXAttribute
  extends BaseNode
     with Node {
  var name: JSXIdentifier
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.JSXAttribute
  var value: Literal | JSXExpression | Null
}

object JSXAttribute {
  @scala.inline
  def apply(
    loc: SourceLocation,
    name: JSXIdentifier,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.JSXAttribute,
    parent: Node = null,
    value: Literal | JSXExpression = null
  ): JSXAttribute = {
    val __obj = js.Dynamic.literal(loc = loc, name = name, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXAttribute]
  }
}

