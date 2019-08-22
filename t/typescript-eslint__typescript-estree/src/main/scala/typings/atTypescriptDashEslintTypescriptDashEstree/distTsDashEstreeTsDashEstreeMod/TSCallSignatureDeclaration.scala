package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSCallSignatureDeclaration
  extends FunctionSignatureBase
     with Node
     with TypeElement {
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSCallSignatureDeclaration
}

object TSCallSignatureDeclaration {
  @scala.inline
  def apply(
    loc: SourceLocation,
    params: js.Array[Parameter],
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSCallSignatureDeclaration,
    parent: Node = null,
    returnType: TSTypeAnnotation = null,
    typeParameters: TSTypeParameterDeclaration = null
  ): TSCallSignatureDeclaration = {
    val __obj = js.Dynamic.literal(loc = loc, params = params, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSCallSignatureDeclaration]
  }
}

