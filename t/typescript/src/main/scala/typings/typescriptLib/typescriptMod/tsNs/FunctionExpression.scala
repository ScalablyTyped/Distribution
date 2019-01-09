package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptLib.typescriptMod.tsNs.FunctionLikeDeclarationBase because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _functionLikeDeclarationBrand, asteriskToken, questionToken, exclamationToken, body */ @js.native
trait FunctionExpression extends PrimaryExpression {
  var _functionLikeDeclarationBrand: js.Any = js.native
  var asteriskToken: js.UndefOr[AsteriskToken] = js.native
  var body: FunctionBody | (js.UndefOr[Block | Expression]) = js.native
  var exclamationToken: js.UndefOr[ExclamationToken] = js.native
  var name: js.UndefOr[Identifier] = js.native
  var questionToken: js.UndefOr[QuestionToken] = js.native
}

