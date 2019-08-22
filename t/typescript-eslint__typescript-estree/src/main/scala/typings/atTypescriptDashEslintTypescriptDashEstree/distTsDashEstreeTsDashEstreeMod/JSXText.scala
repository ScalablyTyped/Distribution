package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXText
  extends BaseNode
     with JSXChild
     with Node {
  var raw: String
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.JSXText
  var value: String
}

object JSXText {
  @scala.inline
  def apply(
    loc: SourceLocation,
    range: Range,
    raw: String,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.JSXText,
    value: String,
    parent: Node = null
  ): JSXText = {
    val __obj = js.Dynamic.literal(loc = loc, range = range, raw = raw, value = value)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[JSXText]
  }
}

