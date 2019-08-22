package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrowFunctionExpression
  extends Expression
     with BaseNode
     with Node {
  var async: Boolean
  var body: Expression | BlockStatement
  var expression: Boolean
  var generator: Boolean
  var id: Null
  var params: js.Array[Parameter]
  var returnType: js.UndefOr[TSTypeAnnotation] = js.undefined
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ArrowFunctionExpression
  var typeParameters: js.UndefOr[TSTypeParameterDeclaration] = js.undefined
}

object ArrowFunctionExpression {
  @scala.inline
  def apply(
    async: Boolean,
    body: Expression | BlockStatement,
    expression: Boolean,
    generator: Boolean,
    id: Null,
    loc: SourceLocation,
    params: js.Array[Parameter],
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ArrowFunctionExpression,
    parent: Node = null,
    returnType: TSTypeAnnotation = null,
    typeParameters: TSTypeParameterDeclaration = null
  ): ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(async = async, body = body.asInstanceOf[js.Any], expression = expression, generator = generator, id = id, loc = loc, params = params, range = range)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[ArrowFunctionExpression]
  }
}

