package typings.typescriptServices.mod.Services.Formatting

import typings.typescriptServices.TypeScript.Services.Formatting.Shared.ITokenAccess
import typings.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.Shared")
@js.native
object Shared extends js.Object {
  @js.native
  class TokenAllAccess ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenAllAccess {
    /* CompleteClass */
    override def Contains(token: SyntaxKind): Boolean = js.native
    /* CompleteClass */
    override def GetTokens(): js.Array[SyntaxKind] = js.native
  }
  
  @js.native
  class TokenRange protected ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange {
    def this(tokenAccess: ITokenAccess) = this()
    /* CompleteClass */
    override var tokenAccess: ITokenAccess = js.native
    /* CompleteClass */
    override def Contains(token: SyntaxKind): Boolean = js.native
    /* CompleteClass */
    override def GetTokens(): js.Array[SyntaxKind] = js.native
  }
  
  @js.native
  class TokenRangeAccess protected ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRangeAccess {
    def this(from: SyntaxKind, to: SyntaxKind, except: js.Array[SyntaxKind]) = this()
    /* CompleteClass */
    override var tokens: js.Any = js.native
    /* CompleteClass */
    override def Contains(token: SyntaxKind): Boolean = js.native
    /* CompleteClass */
    override def GetTokens(): js.Array[SyntaxKind] = js.native
  }
  
  @js.native
  class TokenSingleValueAccess protected ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenSingleValueAccess {
    def this(token: SyntaxKind) = this()
    /* CompleteClass */
    override var token: SyntaxKind = js.native
    /* CompleteClass */
    override def Contains(token: SyntaxKind): Boolean = js.native
    /* CompleteClass */
    override def GetTokens(): js.Array[SyntaxKind] = js.native
  }
  
  @js.native
  class TokenValuesAccess protected ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenValuesAccess {
    def this(tks: js.Array[SyntaxKind]) = this()
    /* CompleteClass */
    override var tokens: js.Any = js.native
    /* CompleteClass */
    override def Contains(token: SyntaxKind): Boolean = js.native
    /* CompleteClass */
    override def GetTokens(): js.Array[SyntaxKind] = js.native
  }
  
  /* static members */
  @js.native
  object TokenRange extends js.Object {
    var Any: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var AnyIncludingMultilineComments: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var BinaryKeywordOperators: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var BinaryOperators: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var Comments: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var Keywords: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var Operators: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var ReservedKeywords: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var TypeNames: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPostdecrementExpressions: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPostincrementExpressions: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPredecrementExpressions: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPrefixExpressions: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPrefixOperators: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    var UnaryPreincrementExpressions: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    def AllTokens(): typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    def FromRange(f: SyntaxKind, to: SyntaxKind): typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    def FromRange(f: SyntaxKind, to: SyntaxKind, except: js.Array[SyntaxKind]): typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    def FromToken(token: SyntaxKind): typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
    def FromTokens(tokens: js.Array[SyntaxKind]): typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
  }
  
}

