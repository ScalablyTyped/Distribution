package typings.vscodeTextmate

import typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack
import typings.vscodeTextmate.releaseGrammarGrammarMod.Grammar
import typings.vscodeTextmate.releaseGrammarGrammarMod.LineTokens
import typings.vscodeTextmate.releaseGrammarGrammarMod.StateStackImpl
import typings.vscodeTextmate.releaseOnigLibMod.OnigString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseGrammarTokenizeStringMod {
  
  @JSImport("vscode-textmate/release/grammar/tokenizeString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-textmate/release/grammar/tokenizeString", "LocalStackElement")
  @js.native
  open class LocalStackElement protected () extends StObject {
    def this(scopes: AttributedScopeStack, endPos: Double) = this()
    
    val endPos: Double = js.native
    
    val scopes: AttributedScopeStack = js.native
  }
  
  inline def tokenizeString(
    grammar: Grammar,
    lineText: OnigString,
    isFirstLine: Boolean,
    linePos: Double,
    stack: StateStackImpl,
    lineTokens: LineTokens,
    checkWhileConditions: Boolean,
    timeLimit: Double
  ): TokenizeStringResult = (^.asInstanceOf[js.Dynamic].applyDynamic("_tokenizeString")(grammar.asInstanceOf[js.Any], lineText.asInstanceOf[js.Any], isFirstLine.asInstanceOf[js.Any], linePos.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], lineTokens.asInstanceOf[js.Any], checkWhileConditions.asInstanceOf[js.Any], timeLimit.asInstanceOf[js.Any])).asInstanceOf[TokenizeStringResult]
  
  trait TokenizeStringResult extends StObject {
    
    val stack: StateStackImpl
    
    val stoppedEarly: Boolean
  }
  object TokenizeStringResult {
    
    inline def apply(stack: StateStackImpl, stoppedEarly: Boolean): TokenizeStringResult = {
      val __obj = js.Dynamic.literal(stack = stack.asInstanceOf[js.Any], stoppedEarly = stoppedEarly.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenizeStringResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenizeStringResult] (val x: Self) extends AnyVal {
      
      inline def setStack(value: StateStackImpl): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStoppedEarly(value: Boolean): Self = StObject.set(x, "stoppedEarly", value.asInstanceOf[js.Any])
    }
  }
}
