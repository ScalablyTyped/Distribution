package typings.typescriptServices.TypeScript.Services.Formatting.Shared

import typings.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenAllAccess extends ITokenAccess

object TokenAllAccess {
  @scala.inline
  def apply(Contains: SyntaxKind => Boolean, GetTokens: () => js.Array[SyntaxKind]): TokenAllAccess = {
    val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = js.Any.fromFunction0(GetTokens))
    __obj.asInstanceOf[TokenAllAccess]
  }
}

