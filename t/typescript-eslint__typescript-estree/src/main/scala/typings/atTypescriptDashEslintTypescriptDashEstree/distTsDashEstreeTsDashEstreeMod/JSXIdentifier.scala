package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXIdentifier
  extends BaseNode
     with JSXTagNameExpression
     with Node {
  var name: String
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.JSXIdentifier
}

object JSXIdentifier {
  @scala.inline
  def apply(
    loc: SourceLocation,
    name: String,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.JSXIdentifier,
    parent: Node = null
  ): JSXIdentifier = {
    val __obj = js.Dynamic.literal(loc = loc, name = name, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[JSXIdentifier]
  }
}

