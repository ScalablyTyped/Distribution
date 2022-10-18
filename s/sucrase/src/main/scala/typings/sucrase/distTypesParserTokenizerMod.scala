package typings.sucrase

import typings.sucrase.distTypesParserTokenizerKeywordsMod.ContextualKeyword
import typings.sucrase.distTypesParserTokenizerTypesMod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesParserTokenizerMod {
  
  @JSImport("sucrase/dist/types/parser/tokenizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait IdentifierRole extends StObject
  @JSImport("sucrase/dist/types/parser/tokenizer", "IdentifierRole")
  @js.native
  object IdentifierRole extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[IdentifierRole & Double] = js.native
    
    @js.native
    sealed trait Access
      extends StObject
         with IdentifierRole
    /* 0 */ val Access: typings.sucrase.distTypesParserTokenizerMod.IdentifierRole.Access & Double = js.native
    
    @js.native
    sealed trait BlockScopedDeclaration
      extends StObject
         with IdentifierRole
    /* 4 */ val BlockScopedDeclaration: typings.sucrase.distTypesParserTokenizerMod.IdentifierRole.BlockScopedDeclaration & Double = js.native
    
    @js.native
    sealed trait ExportAccess
      extends StObject
         with IdentifierRole
    /* 1 */ val ExportAccess: typings.sucrase.distTypesParserTokenizerMod.IdentifierRole.ExportAccess & Double = js.native
    
    @js.native
    sealed trait FunctionScopedDeclaration
      extends StObject
         with IdentifierRole
    /* 3 */ val FunctionScopedDeclaration: typings.sucrase.distTypesParserTokenizerMod.IdentifierRole.FunctionScopedDeclaration & Double = js.native
    
    @js.native
    sealed trait ImportAccess
      extends StObject
         with IdentifierRole
    /* 11 */ val ImportAccess: typings.sucrase.distTypesParserTokenizerMod.IdentifierRole.ImportAccess & Double = js.native
    
    @js.native
    sealed trait ImportDeclaration
      extends StObject
         with IdentifierRole
    /* 9 */ val ImportDeclaration: typings.sucrase.distTypesParserTokenizerMod.IdentifierRole.ImportDeclaration & Double = js.native
    
    @js.native
    sealed trait ObjectKey
      extends StObject
         with IdentifierRole
    /* 10 */ val ObjectKey: typings.sucrase.distTypesParserTokenizerMod.IdentifierRole.ObjectKey & Double = js.native
    
    @js.native
    sealed trait ObjectShorthand
      extends StObject
         with IdentifierRole
    /* 8 */ val ObjectShorthand: typings.sucrase.distTypesParserTokenizerMod.IdentifierRole.ObjectShorthand & Double = js.native
    
    @js.native
    sealed trait ObjectShorthandBlockScopedDeclaration
      extends StObject
         with IdentifierRole
    /* 7 */ val ObjectShorthandBlockScopedDeclaration: typings.sucrase.distTypesParserTokenizerMod.IdentifierRole.ObjectShorthandBlockScopedDeclaration & Double = js.native
    
    @js.native
    sealed trait ObjectShorthandFunctionScopedDeclaration
      extends StObject
         with IdentifierRole
    /* 6 */ val ObjectShorthandFunctionScopedDeclaration: typings.sucrase.distTypesParserTokenizerMod.IdentifierRole.ObjectShorthandFunctionScopedDeclaration & Double = js.native
    
    @js.native
    sealed trait ObjectShorthandTopLevelDeclaration
      extends StObject
         with IdentifierRole
    /* 5 */ val ObjectShorthandTopLevelDeclaration: typings.sucrase.distTypesParserTokenizerMod.IdentifierRole.ObjectShorthandTopLevelDeclaration & Double = js.native
    
    @js.native
    sealed trait TopLevelDeclaration
      extends StObject
         with IdentifierRole
    /* 2 */ val TopLevelDeclaration: typings.sucrase.distTypesParserTokenizerMod.IdentifierRole.TopLevelDeclaration & Double = js.native
  }
  
  @js.native
  sealed trait JSXRole extends StObject
  @JSImport("sucrase/dist/types/parser/tokenizer", "JSXRole")
  @js.native
  object JSXRole extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[JSXRole & Double] = js.native
    
    @js.native
    sealed trait KeyAfterPropSpread
      extends StObject
         with JSXRole
    /* 3 */ val KeyAfterPropSpread: typings.sucrase.distTypesParserTokenizerMod.JSXRole.KeyAfterPropSpread & Double = js.native
    
    @js.native
    sealed trait NoChildren
      extends StObject
         with JSXRole
    /* 0 */ val NoChildren: typings.sucrase.distTypesParserTokenizerMod.JSXRole.NoChildren & Double = js.native
    
    @js.native
    sealed trait OneChild
      extends StObject
         with JSXRole
    /* 1 */ val OneChild: typings.sucrase.distTypesParserTokenizerMod.JSXRole.OneChild & Double = js.native
    
    @js.native
    sealed trait StaticChildren
      extends StObject
         with JSXRole
    /* 2 */ val StaticChildren: typings.sucrase.distTypesParserTokenizerMod.JSXRole.StaticChildren & Double = js.native
  }
  
  @JSImport("sucrase/dist/types/parser/tokenizer", "Token")
  @js.native
  open class Token () extends StObject {
    
    var contextId: Double | Null = js.native
    
    var contextualKeyword: ContextualKeyword = js.native
    
    var end: Double = js.native
    
    var identifierRole: IdentifierRole | Null = js.native
    
    var isAsyncOperation: Boolean = js.native
    
    var isExpression: Boolean = js.native
    
    var isOptionalChainEnd: Boolean = js.native
    
    var isOptionalChainStart: Boolean = js.native
    
    var isType: Boolean = js.native
    
    var jsxRole: JSXRole | Null = js.native
    
    var nullishStartIndex: Double | Null = js.native
    
    var numNullishCoalesceEnds: Double = js.native
    
    var numNullishCoalesceStarts: Double = js.native
    
    var rhsEndIndex: Double | Null = js.native
    
    var scopeDepth: Double = js.native
    
    var shadowsGlobal: Boolean = js.native
    
    var start: Double = js.native
    
    var subscriptStartIndex: Double | Null = js.native
    
    var `type`: TokenType = js.native
  }
  
  @JSImport("sucrase/dist/types/parser/tokenizer", "TypeAndKeyword")
  @js.native
  open class TypeAndKeyword protected () extends StObject {
    def this(`type`: TokenType, contextualKeyword: ContextualKeyword) = this()
    
    var contextualKeyword: ContextualKeyword = js.native
    
    var `type`: TokenType = js.native
  }
  
  inline def eat(`type`: TokenType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("eat")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def eatTypeToken(tokenType: TokenType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eatTypeToken")(tokenType.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def finishToken(`type`: TokenType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("finishToken")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def finishToken(`type`: TokenType, contextualKeyword: ContextualKeyword): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("finishToken")(`type`.asInstanceOf[js.Any], contextualKeyword.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getTokenFromCode(code: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTokenFromCode")(code.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isBlockScopedDeclaration(token: Token): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedDeclaration")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDeclaration(token: Token): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclaration")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunctionScopedDeclaration(token: Token): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionScopedDeclaration")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNonTopLevelDeclaration(token: Token): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonTopLevelDeclaration")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObjectShorthandDeclaration(token: Token): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectShorthandDeclaration")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTopLevelDeclaration(token: Token): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTopLevelDeclaration")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def lookaheadCharCode(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lookaheadCharCode")().asInstanceOf[Double]
  
  inline def lookaheadType(): TokenType = ^.asInstanceOf[js.Dynamic].applyDynamic("lookaheadType")().asInstanceOf[TokenType]
  
  inline def lookaheadTypeAndKeyword(): TypeAndKeyword = ^.asInstanceOf[js.Dynamic].applyDynamic("lookaheadTypeAndKeyword")().asInstanceOf[TypeAndKeyword]
  
  inline def `match`(`type`: TokenType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def next(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("next")().asInstanceOf[Unit]
  
  inline def nextTemplateToken(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nextTemplateToken")().asInstanceOf[Unit]
  
  inline def nextToken(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nextToken")().asInstanceOf[Unit]
  
  inline def nextTokenStart(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextTokenStart")().asInstanceOf[Double]
  
  inline def nextTokenStartSince(pos: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextTokenStartSince")(pos.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def popTypeContext(oldIsType: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("popTypeContext")(oldIsType.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def pushTypeContext(existingTokensInType: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("pushTypeContext")(existingTokensInType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def rescanGt(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rescan_gt")().asInstanceOf[Unit]
  
  inline def retokenizeSlashAsRegex(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("retokenizeSlashAsRegex")().asInstanceOf[Unit]
  
  inline def skipLineComment(startSkip: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skipLineComment")(startSkip.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def skipSpace(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skipSpace")().asInstanceOf[Unit]
  
  inline def skipWord(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWord")().asInstanceOf[Unit]
}
