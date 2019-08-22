package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSEmptyBodyFunctionExpression
  extends FunctionDeclarationBase
     with ClassElement
     with Node {
  @JSName("body")
  var body_TSEmptyBodyFunctionExpression: Null
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSEmptyBodyFunctionExpression
}

object TSEmptyBodyFunctionExpression {
  @scala.inline
  def apply(
    async: Boolean,
    body: Null,
    expression: Boolean,
    generator: Boolean,
    loc: SourceLocation,
    params: js.Array[Parameter],
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.TSEmptyBodyFunctionExpression,
    declare: js.UndefOr[Boolean] = js.undefined,
    id: Identifier = null,
    parent: Node = null,
    returnType: TSTypeAnnotation = null,
    typeParameters: TSTypeParameterDeclaration = null
  ): TSEmptyBodyFunctionExpression = {
    val __obj = js.Dynamic.literal(async = async, body = body, expression = expression, generator = generator, loc = loc, params = params, range = range)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (id != null) __obj.updateDynamic("id")(id)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSEmptyBodyFunctionExpression]
  }
}

