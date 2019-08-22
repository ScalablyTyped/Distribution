package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.`+`
import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.`-`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSMappedType
  extends BaseNode
     with Node
     with TypeNode {
  var optional: js.UndefOr[Boolean | `-` | `+`] = js.undefined
  var readonly: js.UndefOr[Boolean | `-` | `+`] = js.undefined
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSMappedType
  var typeAnnotation: js.UndefOr[TypeNode] = js.undefined
  var typeParameter: TSTypeParameterDeclaration
}

object TSMappedType {
  @scala.inline
  def apply(
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSMappedType,
    typeParameter: TSTypeParameterDeclaration,
    optional: Boolean | `-` | `+` = null,
    parent: Node = null,
    readonly: Boolean | `-` | `+` = null,
    typeAnnotation: TypeNode = null
  ): TSMappedType = {
    val __obj = js.Dynamic.literal(loc = loc, range = range, typeParameter = typeParameter)
    __obj.updateDynamic("type")(`type`)
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (readonly != null) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[TSMappedType]
  }
}

