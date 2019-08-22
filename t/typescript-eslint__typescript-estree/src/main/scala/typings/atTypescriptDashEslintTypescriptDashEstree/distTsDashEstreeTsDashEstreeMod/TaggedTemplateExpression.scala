package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaggedTemplateExpression
  extends LeftHandSideExpression
     with BaseNode
     with Node {
  var quasi: TemplateLiteral
  var tag: LeftHandSideExpression
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TaggedTemplateExpression
  var typeParameters: js.UndefOr[TSTypeParameterInstantiation] = js.undefined
}

object TaggedTemplateExpression {
  @scala.inline
  def apply(
    loc: SourceLocation,
    quasi: TemplateLiteral,
    range: Range,
    tag: LeftHandSideExpression,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TaggedTemplateExpression,
    parent: Node = null,
    typeParameters: TSTypeParameterInstantiation = null
  ): TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(loc = loc, quasi = quasi, range = range, tag = tag)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TaggedTemplateExpression]
  }
}

