package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSImportType
  extends BaseNode
     with Node
     with TypeNode {
  var isTypeOf: Boolean
  var parameter: TypeNode
  var qualifier: EntityName | Null
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSImportType
  var typeParameters: TSTypeParameterInstantiation | Null
}

object TSImportType {
  @scala.inline
  def apply(
    isTypeOf: Boolean,
    loc: SourceLocation,
    parameter: TypeNode,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSImportType,
    parent: Node = null,
    qualifier: EntityName = null,
    typeParameters: TSTypeParameterInstantiation = null
  ): TSImportType = {
    val __obj = js.Dynamic.literal(isTypeOf = isTypeOf, loc = loc, parameter = parameter, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSImportType]
  }
}

