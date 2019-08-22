package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXElement
  extends PrimaryExpression
     with BaseNode
     with JSXChild
     with Node {
  var children: js.Array[JSXChild]
  var closingElement: JSXClosingElement | Null
  var openingElement: JSXOpeningElement
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.JSXElement
}

object JSXElement {
  @scala.inline
  def apply(
    children: js.Array[JSXChild],
    loc: SourceLocation,
    openingElement: JSXOpeningElement,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.JSXElement,
    closingElement: JSXClosingElement = null,
    parent: Node = null
  ): JSXElement = {
    val __obj = js.Dynamic.literal(children = children, loc = loc, openingElement = openingElement, range = range)
    __obj.updateDynamic("type")(`type`)
    if (closingElement != null) __obj.updateDynamic("closingElement")(closingElement)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[JSXElement]
  }
}

