package typings.typescriptServices.TypeScript.Services.Formatting.Shared

import typings.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenRange extends js.Object {
  var tokenAccess: ITokenAccess
  def Contains(token: SyntaxKind): Boolean
  def GetTokens(): js.Array[SyntaxKind]
}

object TokenRange {
  @scala.inline
  def apply(Contains: SyntaxKind => Boolean, GetTokens: () => js.Array[SyntaxKind], tokenAccess: ITokenAccess): TokenRange = {
    val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = js.Any.fromFunction0(GetTokens), tokenAccess = tokenAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenRange]
  }
}

