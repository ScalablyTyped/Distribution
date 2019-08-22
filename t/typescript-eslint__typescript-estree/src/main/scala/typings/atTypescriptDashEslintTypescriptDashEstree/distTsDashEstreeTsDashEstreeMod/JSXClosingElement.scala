package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXClosingElement
  extends Expression
     with BaseNode
     with Node {
  var name: JSXTagNameExpression
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.JSXClosingElement
}

object JSXClosingElement {
  @scala.inline
  def apply(
    loc: SourceLocation,
    name: JSXTagNameExpression,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.JSXClosingElement,
    parent: Node = null
  ): JSXClosingElement = {
    val __obj = js.Dynamic.literal(loc = loc, name = name, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[JSXClosingElement]
  }
}

