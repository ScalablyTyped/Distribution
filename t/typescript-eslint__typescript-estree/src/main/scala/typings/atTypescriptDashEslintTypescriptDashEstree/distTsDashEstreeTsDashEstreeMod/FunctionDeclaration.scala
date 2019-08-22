package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDeclaration
  extends FunctionDeclarationBase
     with DeclarationStatement
     with ExportDeclaration
     with Node {
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.FunctionDeclaration
}

object FunctionDeclaration {
  @scala.inline
  def apply(
    async: Boolean,
    expression: Boolean,
    generator: Boolean,
    loc: SourceLocation,
    params: js.Array[Parameter],
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.FunctionDeclaration,
    body: BlockStatement = null,
    declare: js.UndefOr[Boolean] = js.undefined,
    id: Identifier = null,
    parent: Node = null,
    returnType: TSTypeAnnotation = null,
    typeParameters: TSTypeParameterDeclaration = null
  ): FunctionDeclaration = {
    val __obj = js.Dynamic.literal(async = async, expression = expression, generator = generator, loc = loc, params = params, range = range)
    __obj.updateDynamic("type")(`type`)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (id != null) __obj.updateDynamic("id")(id)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[FunctionDeclaration]
  }
}

