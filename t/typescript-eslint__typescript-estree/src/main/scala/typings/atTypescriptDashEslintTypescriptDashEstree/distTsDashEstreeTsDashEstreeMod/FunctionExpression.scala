package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.ForInitialiser because Already inherited
- typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Expression because Already inherited
- typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.TSUnaryExpression because Already inherited
- typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.LeftHandSideExpression because Already inherited */ trait FunctionExpression
  extends PrimaryExpression
     with FunctionDeclarationBase
     with ClassElement
     with Node {
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.FunctionExpression
}

object FunctionExpression {
  @scala.inline
  def apply(
    async: Boolean,
    expression: Boolean,
    generator: Boolean,
    loc: SourceLocation,
    params: js.Array[Parameter],
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.FunctionExpression,
    body: BlockStatement = null,
    declare: js.UndefOr[Boolean] = js.undefined,
    id: Identifier = null,
    parent: Node = null,
    returnType: TSTypeAnnotation = null,
    typeParameters: TSTypeParameterDeclaration = null
  ): FunctionExpression = {
    val __obj = js.Dynamic.literal(async = async, expression = expression, generator = generator, loc = loc, params = params, range = range)
    __obj.updateDynamic("type")(`type`)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (id != null) __obj.updateDynamic("id")(id)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[FunctionExpression]
  }
}

