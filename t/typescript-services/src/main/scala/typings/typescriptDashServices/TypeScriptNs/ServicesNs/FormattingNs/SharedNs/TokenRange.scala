package typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs

import typings.typescriptDashServices.TypeScriptNs.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange")
@js.native
class TokenRange protected () extends js.Object {
  def this(tokenAccess: ITokenAccess) = this()
  var tokenAccess: ITokenAccess = js.native
  def Contains(token: SyntaxKind): Boolean = js.native
  def GetTokens(): js.Array[SyntaxKind] = js.native
}

/* static members */
@JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange")
@js.native
object TokenRange extends js.Object {
  var Any: TokenRange = js.native
  var AnyIncludingMultilineComments: TokenRange = js.native
  var BinaryKeywordOperators: TokenRange = js.native
  var BinaryOperators: TokenRange = js.native
  var Comments: TokenRange = js.native
  var Keywords: TokenRange = js.native
  var Operators: TokenRange = js.native
  var ReservedKeywords: TokenRange = js.native
  var TypeNames: TokenRange = js.native
  var UnaryPostdecrementExpressions: TokenRange = js.native
  var UnaryPostincrementExpressions: TokenRange = js.native
  var UnaryPredecrementExpressions: TokenRange = js.native
  var UnaryPrefixExpressions: TokenRange = js.native
  var UnaryPrefixOperators: TokenRange = js.native
  var UnaryPreincrementExpressions: TokenRange = js.native
  def AllTokens(): TokenRange = js.native
  def FromRange(f: SyntaxKind, to: SyntaxKind): TokenRange = js.native
  def FromRange(f: SyntaxKind, to: SyntaxKind, except: js.Array[SyntaxKind]): TokenRange = js.native
  def FromToken(token: SyntaxKind): TokenRange = js.native
  def FromTokens(tokens: js.Array[SyntaxKind]): TokenRange = js.native
}

