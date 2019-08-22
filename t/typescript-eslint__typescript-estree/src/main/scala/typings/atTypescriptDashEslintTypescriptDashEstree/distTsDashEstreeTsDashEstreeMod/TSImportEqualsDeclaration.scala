package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSImportEqualsDeclaration
  extends DeclarationStatement
     with BaseNode
     with Node {
  var id: Identifier
  var isExport: Boolean
  var moduleReference: EntityName | TSExternalModuleReference
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSImportEqualsDeclaration
}

object TSImportEqualsDeclaration {
  @scala.inline
  def apply(
    id: Identifier,
    isExport: Boolean,
    loc: SourceLocation,
    moduleReference: EntityName | TSExternalModuleReference,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSImportEqualsDeclaration,
    parent: Node = null
  ): TSImportEqualsDeclaration = {
    val __obj = js.Dynamic.literal(id = id, isExport = isExport, loc = loc, moduleReference = moduleReference.asInstanceOf[js.Any], range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TSImportEqualsDeclaration]
  }
}

