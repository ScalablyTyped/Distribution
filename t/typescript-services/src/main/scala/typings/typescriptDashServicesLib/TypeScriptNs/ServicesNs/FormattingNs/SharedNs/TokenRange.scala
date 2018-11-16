package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange")
@js.native
class TokenRange protected () extends js.Object {
  def this(tokenAccess: ITokenAccess) = this()
  var tokenAccess: ITokenAccess = js.native
  def Contains(token: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): scala.Boolean = js.native
  def GetTokens(): js.Array[typescriptDashServicesLib.TypeScriptNs.SyntaxKind] = js.native
}

@JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange")
@js.native
object TokenRange extends js.Object {
  var Any: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
  var AnyIncludingMultilineComments: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
  var BinaryKeywordOperators: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
  var BinaryOperators: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
  var Comments: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
  var Keywords: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
  var Operators: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
  var ReservedKeywords: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
  var TypeNames: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
  var UnaryPostdecrementExpressions: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
  var UnaryPostincrementExpressions: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
  var UnaryPredecrementExpressions: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
  var UnaryPrefixExpressions: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
  var UnaryPrefixOperators: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
  var UnaryPreincrementExpressions: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
  def AllTokens(): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
  def FromRange(
    f: typescriptDashServicesLib.TypeScriptNs.SyntaxKind,
    to: typescriptDashServicesLib.TypeScriptNs.SyntaxKind
  ): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
  def FromRange(
    f: typescriptDashServicesLib.TypeScriptNs.SyntaxKind,
    to: typescriptDashServicesLib.TypeScriptNs.SyntaxKind,
    except: js.Array[typescriptDashServicesLib.TypeScriptNs.SyntaxKind]
  ): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
  def FromToken(token: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
  def FromTokens(tokens: js.Array[typescriptDashServicesLib.TypeScriptNs.SyntaxKind]): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
}

