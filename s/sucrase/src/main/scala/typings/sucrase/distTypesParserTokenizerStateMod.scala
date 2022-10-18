package typings.sucrase

import typings.sucrase.distTypesParserTokenizerKeywordsMod.ContextualKeyword
import typings.sucrase.distTypesParserTokenizerMod.Token
import typings.sucrase.distTypesParserTokenizerTypesMod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesParserTokenizerStateMod {
  
  @JSImport("sucrase/dist/types/parser/tokenizer/state", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with State {
    
    /* CompleteClass */
    var contextualKeyword: ContextualKeyword = js.native
    
    /* CompleteClass */
    var end: Double = js.native
    
    /**
      * If the parser is in an error state, then the token is always tt.eof and all functions can
      * keep executing but should be written so they don't get into an infinite loop in this situation.
      *
      * This approach, combined with the ability to snapshot and restore state, allows us to implement
      * backtracking without exceptions and without needing to explicitly propagate error states
      * everywhere.
      */
    /* CompleteClass */
    var error: js.Error | Null = js.native
    
    /* CompleteClass */
    var inDisallowConditionalTypesContext: Boolean = js.native
    
    /* CompleteClass */
    var isType: Boolean = js.native
    
    /* CompleteClass */
    var noAnonFunctionType: Boolean = js.native
    
    /* CompleteClass */
    var pos: Double = js.native
    
    /* CompleteClass */
    var potentialArrowAt: Double = js.native
    
    /* CompleteClass */
    override def restoreFromSnapshot(snapshot: StateSnapshot): Unit = js.native
    
    /* CompleteClass */
    var scopeDepth: Double = js.native
    
    /* CompleteClass */
    var scopes: js.Array[Scope] = js.native
    
    /* CompleteClass */
    override def snapshot(): StateSnapshot = js.native
    
    /* CompleteClass */
    var start: Double = js.native
    
    /* CompleteClass */
    var tokens: js.Array[Token] = js.native
    
    /* CompleteClass */
    var `type`: TokenType = js.native
  }
  
  @JSImport("sucrase/dist/types/parser/tokenizer/state", "Scope")
  @js.native
  open class Scope protected () extends StObject {
    def this(startTokenIndex: Double, endTokenIndex: Double, isFunctionScope: Boolean) = this()
    
    var endTokenIndex: Double = js.native
    
    var isFunctionScope: Boolean = js.native
    
    var startTokenIndex: Double = js.native
  }
  
  @JSImport("sucrase/dist/types/parser/tokenizer/state", "StateSnapshot")
  @js.native
  open class StateSnapshot protected () extends StObject {
    def this(
      potentialArrowAt: Double,
      noAnonFunctionType: Boolean,
      inDisallowConditionalTypesContext: Boolean,
      tokensLength: Double,
      scopesLength: Double,
      pos: Double,
      `type`: TokenType,
      contextualKeyword: ContextualKeyword,
      start: Double,
      end: Double,
      isType: Boolean,
      scopeDepth: Double
    ) = this()
    def this(
      potentialArrowAt: Double,
      noAnonFunctionType: Boolean,
      inDisallowConditionalTypesContext: Boolean,
      tokensLength: Double,
      scopesLength: Double,
      pos: Double,
      `type`: TokenType,
      contextualKeyword: ContextualKeyword,
      start: Double,
      end: Double,
      isType: Boolean,
      scopeDepth: Double,
      error: js.Error
    ) = this()
    
    val contextualKeyword: ContextualKeyword = js.native
    
    val end: Double = js.native
    
    val error: js.Error | Null = js.native
    
    val inDisallowConditionalTypesContext: Boolean = js.native
    
    val isType: Boolean = js.native
    
    val noAnonFunctionType: Boolean = js.native
    
    val pos: Double = js.native
    
    val potentialArrowAt: Double = js.native
    
    val scopeDepth: Double = js.native
    
    val scopesLength: Double = js.native
    
    val start: Double = js.native
    
    val tokensLength: Double = js.native
    
    val `type`: TokenType = js.native
  }
  
  trait State extends StObject {
    
    var contextualKeyword: ContextualKeyword
    
    var end: Double
    
    /**
      * If the parser is in an error state, then the token is always tt.eof and all functions can
      * keep executing but should be written so they don't get into an infinite loop in this situation.
      *
      * This approach, combined with the ability to snapshot and restore state, allows us to implement
      * backtracking without exceptions and without needing to explicitly propagate error states
      * everywhere.
      */
    var error: js.Error | Null
    
    var inDisallowConditionalTypesContext: Boolean
    
    var isType: Boolean
    
    var noAnonFunctionType: Boolean
    
    var pos: Double
    
    var potentialArrowAt: Double
    
    def restoreFromSnapshot(snapshot: StateSnapshot): Unit
    
    var scopeDepth: Double
    
    var scopes: js.Array[Scope]
    
    def snapshot(): StateSnapshot
    
    var start: Double
    
    var tokens: js.Array[Token]
    
    var `type`: TokenType
  }
  object State {
    
    inline def apply(
      contextualKeyword: ContextualKeyword,
      end: Double,
      inDisallowConditionalTypesContext: Boolean,
      isType: Boolean,
      noAnonFunctionType: Boolean,
      pos: Double,
      potentialArrowAt: Double,
      restoreFromSnapshot: StateSnapshot => Unit,
      scopeDepth: Double,
      scopes: js.Array[Scope],
      snapshot: () => StateSnapshot,
      start: Double,
      tokens: js.Array[Token],
      `type`: TokenType
    ): State = {
      val __obj = js.Dynamic.literal(contextualKeyword = contextualKeyword.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], inDisallowConditionalTypesContext = inDisallowConditionalTypesContext.asInstanceOf[js.Any], isType = isType.asInstanceOf[js.Any], noAnonFunctionType = noAnonFunctionType.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], potentialArrowAt = potentialArrowAt.asInstanceOf[js.Any], restoreFromSnapshot = js.Any.fromFunction1(restoreFromSnapshot), scopeDepth = scopeDepth.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], snapshot = js.Any.fromFunction0(snapshot), start = start.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], error = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setContextualKeyword(value: ContextualKeyword): Self = StObject.set(x, "contextualKeyword", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setInDisallowConditionalTypesContext(value: Boolean): Self = StObject.set(x, "inDisallowConditionalTypesContext", value.asInstanceOf[js.Any])
      
      inline def setIsType(value: Boolean): Self = StObject.set(x, "isType", value.asInstanceOf[js.Any])
      
      inline def setNoAnonFunctionType(value: Boolean): Self = StObject.set(x, "noAnonFunctionType", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setPotentialArrowAt(value: Double): Self = StObject.set(x, "potentialArrowAt", value.asInstanceOf[js.Any])
      
      inline def setRestoreFromSnapshot(value: StateSnapshot => Unit): Self = StObject.set(x, "restoreFromSnapshot", js.Any.fromFunction1(value))
      
      inline def setScopeDepth(value: Double): Self = StObject.set(x, "scopeDepth", value.asInstanceOf[js.Any])
      
      inline def setScopes(value: js.Array[Scope]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: Scope*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setSnapshot(value: () => StateSnapshot): Self = StObject.set(x, "snapshot", js.Any.fromFunction0(value))
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Array[Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: Token*): Self = StObject.set(x, "tokens", js.Array(value*))
      
      inline def setType(value: TokenType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
