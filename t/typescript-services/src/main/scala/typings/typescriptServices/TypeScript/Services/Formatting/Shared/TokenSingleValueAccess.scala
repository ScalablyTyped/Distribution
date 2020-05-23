package typings.typescriptServices.TypeScript.Services.Formatting.Shared

import typings.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenSingleValueAccess extends ITokenAccess {
  var token: SyntaxKind
}

object TokenSingleValueAccess {
  @scala.inline
  def apply(Contains: SyntaxKind => Boolean, GetTokens: () => js.Array[SyntaxKind], token: SyntaxKind): TokenSingleValueAccess = {
    val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = js.Any.fromFunction0(GetTokens), token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenSingleValueAccess]
  }
}

