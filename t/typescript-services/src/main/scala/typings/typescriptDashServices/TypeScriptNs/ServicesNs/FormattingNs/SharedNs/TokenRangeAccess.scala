package typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs

import typings.typescriptDashServices.TypeScriptNs.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.Shared.TokenRangeAccess")
@js.native
class TokenRangeAccess protected () extends ITokenAccess {
  def this(from: SyntaxKind, to: SyntaxKind, except: js.Array[SyntaxKind]) = this()
  var tokens: js.Any = js.native
  /* CompleteClass */
  override def Contains(token: SyntaxKind): Boolean = js.native
  /* CompleteClass */
  override def GetTokens(): js.Array[SyntaxKind] = js.native
}

