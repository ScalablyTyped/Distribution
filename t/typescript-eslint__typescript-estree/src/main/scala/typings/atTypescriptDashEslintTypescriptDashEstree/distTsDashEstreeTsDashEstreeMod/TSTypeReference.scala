package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeReference
  extends BaseNode
     with Node
     with TypeNode {
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypeReference
  var typeName: EntityName
  var typeParameters: js.UndefOr[TSTypeParameterInstantiation] = js.undefined
}

object TSTypeReference {
  @scala.inline
  def apply(
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSTypeReference,
    typeName: EntityName,
    parent: Node = null,
    typeParameters: TSTypeParameterInstantiation = null
  ): TSTypeReference = {
    val __obj = js.Dynamic.literal(loc = loc, range = range, typeName = typeName)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSTypeReference]
  }
}

