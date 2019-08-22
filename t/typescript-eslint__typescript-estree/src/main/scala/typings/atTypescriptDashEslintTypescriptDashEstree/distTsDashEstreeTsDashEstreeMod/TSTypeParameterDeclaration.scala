package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeParameterDeclaration
  extends BaseNode
     with Node {
  var params: js.Array[TSTypeParameter]
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypeParameterDeclaration
}

object TSTypeParameterDeclaration {
  @scala.inline
  def apply(
    loc: SourceLocation,
    params: js.Array[TSTypeParameter],
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypeParameterDeclaration,
    parent: Node = null
  ): TSTypeParameterDeclaration = {
    val __obj = js.Dynamic.literal(loc = loc, params = params, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSTypeParameterDeclaration]
  }
}

