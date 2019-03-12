package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITokenAccess extends js.Object {
  def Contains(token: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): scala.Boolean
  def GetTokens(): js.Array[typescriptDashServicesLib.TypeScriptNs.SyntaxKind]
}

object ITokenAccess {
  @scala.inline
  def apply(
    Contains: typescriptDashServicesLib.TypeScriptNs.SyntaxKind => scala.Boolean,
    GetTokens: () => js.Array[typescriptDashServicesLib.TypeScriptNs.SyntaxKind]
  ): ITokenAccess = {
    val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = js.Any.fromFunction0(GetTokens))
  
    __obj.asInstanceOf[ITokenAccess]
  }
}

