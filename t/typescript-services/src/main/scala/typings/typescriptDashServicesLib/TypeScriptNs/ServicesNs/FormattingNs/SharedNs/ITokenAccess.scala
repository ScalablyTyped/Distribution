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
    Contains: js.Function1[typescriptDashServicesLib.TypeScriptNs.SyntaxKind, scala.Boolean],
    GetTokens: js.Function0[js.Array[typescriptDashServicesLib.TypeScriptNs.SyntaxKind]]
  ): ITokenAccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Contains")(Contains)
    __obj.updateDynamic("GetTokens")(GetTokens)
    __obj.asInstanceOf[ITokenAccess]
  }
}

