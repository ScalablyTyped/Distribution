package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.TextRange because Already inherited
- typings.typescript.typescriptMod.Node because Already inherited
- typings.typescript.typescriptMod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand
- typings.typescript.typescriptMod.NamedDeclaration because var conflicts: decorators, end, flags, kind, modifiers, name, parent, pos. Inlined 
- typings.typescript.typescriptMod.SignatureDeclarationBase because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined name, typeParameters, parameters, `type`
- typings.typescript.typescriptMod.FunctionLikeDeclarationBase because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _functionLikeDeclarationBrand, asteriskToken, questionToken, exclamationToken, body */ @js.native
trait FunctionExpression
  extends PrimaryExpression
     with FunctionLikeDeclaration
     with SignatureDeclaration
     with _HasJSDoc
     with JSDocContainer {
  var _declarationBrand: js.Any = js.native
  var _functionLikeDeclarationBrand: js.Any = js.native
  var asteriskToken: js.UndefOr[AsteriskToken] = js.native
  var body: js.UndefOr[Block | Expression | FunctionBody] = js.native
  var exclamationToken: js.UndefOr[ExclamationToken] = js.native
  @JSName("kind")
  var kind_FunctionExpression: typings.typescript.typescriptMod.SyntaxKind.FunctionExpression = js.native
  var name: js.UndefOr[Identifier | PropertyName] = js.native
  var parameters: NodeArray[ParameterDeclaration] = js.native
  var questionToken: js.UndefOr[QuestionToken] = js.native
  var `type`: js.UndefOr[TypeNode] = js.native
  var typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}

