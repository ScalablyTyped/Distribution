package typings.typescriptServices.TypeScript.Services.Formatting.Shared

import typings.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenSingleValueAccess extends ITokenAccess {
  var token: SyntaxKind = js.native
}

object TokenSingleValueAccess {
  @scala.inline
  def apply(Contains: SyntaxKind => Boolean, GetTokens: () => js.Array[SyntaxKind], token: SyntaxKind): TokenSingleValueAccess = {
    val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = js.Any.fromFunction0(GetTokens), token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenSingleValueAccess]
  }
  @scala.inline
  implicit class TokenSingleValueAccessOps[Self <: TokenSingleValueAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setToken(value: SyntaxKind): Self = this.set("token", value.asInstanceOf[js.Any])
  }
  
}

