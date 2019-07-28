package typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs

import typings.typescriptDashServices.TypeScriptNs.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITokenAccess extends js.Object {
  def Contains(token: SyntaxKind): Boolean
  def GetTokens(): js.Array[SyntaxKind]
}

object ITokenAccess {
  @scala.inline
  def apply(Contains: SyntaxKind => Boolean, GetTokens: () => js.Array[SyntaxKind]): ITokenAccess = {
    val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = js.Any.fromFunction0(GetTokens))
  
    __obj.asInstanceOf[ITokenAccess]
  }
}

