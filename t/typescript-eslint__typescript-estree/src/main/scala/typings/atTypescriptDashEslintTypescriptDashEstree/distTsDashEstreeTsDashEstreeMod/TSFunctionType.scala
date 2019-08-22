package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSFunctionType
  extends FunctionSignatureBase
     with Node
     with TypeNode {
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSFunctionType
}

object TSFunctionType {
  @scala.inline
  def apply(
    loc: SourceLocation,
    params: js.Array[Parameter],
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSFunctionType,
    parent: Node = null,
    returnType: TSTypeAnnotation = null,
    typeParameters: TSTypeParameterDeclaration = null
  ): TSFunctionType = {
    val __obj = js.Dynamic.literal(loc = loc, params = params, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSFunctionType]
  }
}

