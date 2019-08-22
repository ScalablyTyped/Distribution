package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.LeftHandSideExpression because Already inherited */ trait ClassExpression
  extends PrimaryExpression
     with ClassDeclarationBase
     with DeclarationStatement
     with ExportDeclaration
     with Node {
  var `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ClassExpression
}

object ClassExpression {
  @scala.inline
  def apply(
    body: ClassBody,
    loc: SourceLocation,
    range: Range,
    `type`: typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeAstDashNodeDashTypesMod.AST_NODE_TYPES.ClassExpression,
    `abstract`: js.UndefOr[Boolean] = js.undefined,
    declare: js.UndefOr[Boolean] = js.undefined,
    decorators: js.Array[Decorator] = null,
    id: Identifier = null,
    implements: js.Array[ExpressionWithTypeArguments] = null,
    parent: Node = null,
    superClass: LeftHandSideExpression = null,
    superTypeParameters: TSTypeParameterInstantiation = null,
    typeParameters: TSTypeParameterDeclaration = null
  ): ClassExpression = {
    val __obj = js.Dynamic.literal(body = body, loc = loc, range = range)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (id != null) __obj.updateDynamic("id")(id)
    if (implements != null) __obj.updateDynamic("implements")(implements)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (superClass != null) __obj.updateDynamic("superClass")(superClass)
    if (superTypeParameters != null) __obj.updateDynamic("superTypeParameters")(superTypeParameters)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[ClassExpression]
  }
}

