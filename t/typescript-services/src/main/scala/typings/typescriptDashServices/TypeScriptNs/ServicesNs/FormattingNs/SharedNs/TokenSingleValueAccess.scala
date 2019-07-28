package typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs

import typings.typescriptDashServices.TypeScriptNs.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.Shared.TokenSingleValueAccess")
@js.native
class TokenSingleValueAccess protected () extends ITokenAccess {
  def this(token: SyntaxKind) = this()
  var token: SyntaxKind = js.native
  /* CompleteClass */
  override def Contains(token: SyntaxKind): Boolean = js.native
  /* CompleteClass */
  override def GetTokens(): js.Array[SyntaxKind] = js.native
}

