package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Expression because Already inherited */ trait JSXOpeningElement
  extends PrimaryExpression
     with BaseNode
     with Node {
  var attributes: js.Array[JSXAttribute]
  var name: JSXTagNameExpression
  var selfClosing: Boolean
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.JSXOpeningElement
  var typeParameters: js.UndefOr[TSTypeParameterInstantiation] = js.undefined
}

object JSXOpeningElement {
  @scala.inline
  def apply(
    attributes: js.Array[JSXAttribute],
    loc: SourceLocation,
    name: JSXTagNameExpression,
    range: Range,
    selfClosing: Boolean,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.JSXOpeningElement,
    parent: Node = null,
    typeParameters: TSTypeParameterInstantiation = null
  ): JSXOpeningElement = {
    val __obj = js.Dynamic.literal(attributes = attributes, loc = loc, name = name, range = range, selfClosing = selfClosing)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[JSXOpeningElement]
  }
}

