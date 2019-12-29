package typings.typescriptDashServices.typescriptDashServicesMod.Services.Formatting

import typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.ITokenAccess
import typings.typescriptDashServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.Shared")
@js.native
object Shared extends js.Object {
  @js.native
  class TokenAllAccess ()
    extends typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenAllAccess
  
  @js.native
  class TokenRange protected ()
    extends typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange {
    def this(tokenAccess: ITokenAccess) = this()
  }
  
  @js.native
  class TokenRangeAccess protected ()
    extends typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRangeAccess {
    def this(from: SyntaxKind, to: SyntaxKind, except: js.Array[SyntaxKind]) = this()
  }
  
  @js.native
  class TokenSingleValueAccess protected ()
    extends typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenSingleValueAccess {
    def this(token: SyntaxKind) = this()
  }
  
  @js.native
  class TokenValuesAccess protected ()
    extends typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenValuesAccess {
    def this(tks: js.Array[SyntaxKind]) = this()
  }
  
  /* static members */
  @js.native
  object TokenRange extends js.Object {
    var Any: typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var AnyIncludingMultilineComments: typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var BinaryKeywordOperators: typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var BinaryOperators: typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var Comments: typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var Keywords: typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var Operators: typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var ReservedKeywords: typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var TypeNames: typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPostdecrementExpressions: typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPostincrementExpressions: typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPredecrementExpressions: typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPrefixExpressions: typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPrefixOperators: typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPreincrementExpressions: typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    def AllTokens(): typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    def FromRange(f: SyntaxKind, to: SyntaxKind): typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    def FromRange(f: SyntaxKind, to: SyntaxKind, except: js.Array[SyntaxKind]): typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    def FromToken(token: SyntaxKind): typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    def FromTokens(tokens: js.Array[SyntaxKind]): typings.typescriptDashServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
  }
  
}

