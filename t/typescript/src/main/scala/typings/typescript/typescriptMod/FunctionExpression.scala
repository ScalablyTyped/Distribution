package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.FunctionLikeDeclarationBase because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _functionLikeDeclarationBrand, asteriskToken, questionToken, exclamationToken, body */ @js.native
trait FunctionExpression
  extends PrimaryExpression
     with FunctionLikeDeclaration
     with SignatureDeclaration
     with _HasJSDoc {
  var _functionLikeDeclarationBrand: js.Any = js.native
  var asteriskToken: js.UndefOr[AsteriskToken] = js.native
  var body: js.UndefOr[Block | Expression | FunctionBody] = js.native
  var exclamationToken: js.UndefOr[ExclamationToken] = js.native
  @JSName("kind")
  var kind_FunctionExpression: typings.typescript.typescriptMod.SyntaxKind.FunctionExpression = js.native
  var name: js.UndefOr[Identifier] = js.native
  var questionToken: js.UndefOr[QuestionToken] = js.native
}

