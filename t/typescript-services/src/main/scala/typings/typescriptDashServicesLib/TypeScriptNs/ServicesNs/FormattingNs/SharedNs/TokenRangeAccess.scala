package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.Shared.TokenRangeAccess")
@js.native
class TokenRangeAccess protected () extends ITokenAccess {
  def this(from: typescriptDashServicesLib.TypeScriptNs.SyntaxKind, to: typescriptDashServicesLib.TypeScriptNs.SyntaxKind, except: js.Array[typescriptDashServicesLib.TypeScriptNs.SyntaxKind]) = this()
  var tokens: js.Any = js.native
  /* CompleteClass */
  override def Contains(token: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): scala.Boolean = js.native
  /* CompleteClass */
  override def GetTokens(): js.Array[typescriptDashServicesLib.TypeScriptNs.SyntaxKind] = js.native
}

