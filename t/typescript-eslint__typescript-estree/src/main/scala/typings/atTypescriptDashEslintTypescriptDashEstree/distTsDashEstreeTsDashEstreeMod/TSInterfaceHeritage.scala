package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSInterfaceHeritage
  extends TSHeritageBase
     with ExpressionWithTypeArguments
     with Node
     with TypeNode {
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSInterfaceHeritage
}

object TSInterfaceHeritage {
  @scala.inline
  def apply(
    expression: Expression,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSInterfaceHeritage,
    parent: Node = null,
    typeParameters: TSTypeParameterInstantiation = null
  ): TSInterfaceHeritage = {
    val __obj = js.Dynamic.literal(expression = expression, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSInterfaceHeritage]
  }
}

