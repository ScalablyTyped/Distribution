package typings.typescriptServices.TypeScript.Services.Formatting.Shared

import typings.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenRange extends js.Object {
  var tokenAccess: ITokenAccess = js.native
  def Contains(token: SyntaxKind): Boolean = js.native
  def GetTokens(): js.Array[SyntaxKind] = js.native
}

object TokenRange {
  @scala.inline
  def apply(Contains: SyntaxKind => Boolean, GetTokens: () => js.Array[SyntaxKind], tokenAccess: ITokenAccess): TokenRange = {
    val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = js.Any.fromFunction0(GetTokens), tokenAccess = tokenAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenRange]
  }
  @scala.inline
  implicit class TokenRangeOps[Self <: TokenRange] (val x: Self) extends AnyVal {
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
    def setContains(value: SyntaxKind => Boolean): Self = this.set("Contains", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTokens(value: () => js.Array[SyntaxKind]): Self = this.set("GetTokens", js.Any.fromFunction0(value))
    @scala.inline
    def setTokenAccess(value: ITokenAccess): Self = this.set("tokenAccess", value.asInstanceOf[js.Any])
  }
  
}

