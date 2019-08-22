package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXFragment
  extends PrimaryExpression
     with BaseNode
     with JSXChild
     with Node {
  var children: js.Array[JSXChild]
  var closingFragment: JSXClosingFragment
  var openingFragment: JSXOpeningFragment
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.JSXFragment
}

object JSXFragment {
  @scala.inline
  def apply(
    children: js.Array[JSXChild],
    closingFragment: JSXClosingFragment,
    loc: SourceLocation,
    openingFragment: JSXOpeningFragment,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.JSXFragment,
    parent: Node = null
  ): JSXFragment = {
    val __obj = js.Dynamic.literal(children = children, closingFragment = closingFragment, loc = loc, openingFragment = openingFragment, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[JSXFragment]
  }
}

