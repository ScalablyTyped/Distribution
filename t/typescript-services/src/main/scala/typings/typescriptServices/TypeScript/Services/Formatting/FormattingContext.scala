package typings.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattingContext extends StObject {
  
  def BlockIsOnOneLine(node: IndentationNodeContext): Boolean
  
  def ContextNodeAllOnSameLine(): Boolean
  
  def ContextNodeBlockIsOnOneLine(): Boolean
  
  def NextNodeAllOnSameLine(): Boolean
  
  def NextNodeBlockIsOnOneLine(): Boolean
  
  def NodeIsOnOneLine(node: IndentationNodeContext): Boolean
  
  def TokensAreOnSameLine(): Boolean
  
  var contextNode: IndentationNodeContext
  
  /* private */ var contextNodeAllOnSameLine: Any
  
  /* private */ var contextNodeBlockIsOnOneLine: Any
  
  var currentTokenParent: IndentationNodeContext
  
  var currentTokenSpan: TokenSpan
  
  var formattingRequestKind: FormattingRequestKind
  
  /* private */ var nextNodeAllOnSameLine: Any
  
  /* private */ var nextNodeBlockIsOnOneLine: Any
  
  var nextTokenParent: IndentationNodeContext
  
  var nextTokenSpan: TokenSpan
  
  /* private */ var snapshot: Any
  
  /* private */ var tokensAreOnSameLine: Any
  
  def updateContext(
    currentTokenSpan: TokenSpan,
    currentTokenParent: IndentationNodeContext,
    nextTokenSpan: TokenSpan,
    nextTokenParent: IndentationNodeContext,
    commonParent: IndentationNodeContext
  ): Unit
}
object FormattingContext {
  
  inline def apply(
    BlockIsOnOneLine: IndentationNodeContext => Boolean,
    ContextNodeAllOnSameLine: () => Boolean,
    ContextNodeBlockIsOnOneLine: () => Boolean,
    NextNodeAllOnSameLine: () => Boolean,
    NextNodeBlockIsOnOneLine: () => Boolean,
    NodeIsOnOneLine: IndentationNodeContext => Boolean,
    TokensAreOnSameLine: () => Boolean,
    contextNode: IndentationNodeContext,
    contextNodeAllOnSameLine: Any,
    contextNodeBlockIsOnOneLine: Any,
    currentTokenParent: IndentationNodeContext,
    currentTokenSpan: TokenSpan,
    formattingRequestKind: FormattingRequestKind,
    nextNodeAllOnSameLine: Any,
    nextNodeBlockIsOnOneLine: Any,
    nextTokenParent: IndentationNodeContext,
    nextTokenSpan: TokenSpan,
    snapshot: Any,
    tokensAreOnSameLine: Any,
    updateContext: (TokenSpan, IndentationNodeContext, TokenSpan, IndentationNodeContext, IndentationNodeContext) => Unit
  ): FormattingContext = {
    val __obj = js.Dynamic.literal(BlockIsOnOneLine = js.Any.fromFunction1(BlockIsOnOneLine), ContextNodeAllOnSameLine = js.Any.fromFunction0(ContextNodeAllOnSameLine), ContextNodeBlockIsOnOneLine = js.Any.fromFunction0(ContextNodeBlockIsOnOneLine), NextNodeAllOnSameLine = js.Any.fromFunction0(NextNodeAllOnSameLine), NextNodeBlockIsOnOneLine = js.Any.fromFunction0(NextNodeBlockIsOnOneLine), NodeIsOnOneLine = js.Any.fromFunction1(NodeIsOnOneLine), TokensAreOnSameLine = js.Any.fromFunction0(TokensAreOnSameLine), contextNode = contextNode.asInstanceOf[js.Any], contextNodeAllOnSameLine = contextNodeAllOnSameLine.asInstanceOf[js.Any], contextNodeBlockIsOnOneLine = contextNodeBlockIsOnOneLine.asInstanceOf[js.Any], currentTokenParent = currentTokenParent.asInstanceOf[js.Any], currentTokenSpan = currentTokenSpan.asInstanceOf[js.Any], formattingRequestKind = formattingRequestKind.asInstanceOf[js.Any], nextNodeAllOnSameLine = nextNodeAllOnSameLine.asInstanceOf[js.Any], nextNodeBlockIsOnOneLine = nextNodeBlockIsOnOneLine.asInstanceOf[js.Any], nextTokenParent = nextTokenParent.asInstanceOf[js.Any], nextTokenSpan = nextTokenSpan.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], tokensAreOnSameLine = tokensAreOnSameLine.asInstanceOf[js.Any], updateContext = js.Any.fromFunction5(updateContext))
    __obj.asInstanceOf[FormattingContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormattingContext] (val x: Self) extends AnyVal {
    
    inline def setBlockIsOnOneLine(value: IndentationNodeContext => Boolean): Self = StObject.set(x, "BlockIsOnOneLine", js.Any.fromFunction1(value))
    
    inline def setContextNode(value: IndentationNodeContext): Self = StObject.set(x, "contextNode", value.asInstanceOf[js.Any])
    
    inline def setContextNodeAllOnSameLine(value: () => Boolean): Self = StObject.set(x, "ContextNodeAllOnSameLine", js.Any.fromFunction0(value))
    
    inline def setContextNodeBlockIsOnOneLine(value: () => Boolean): Self = StObject.set(x, "ContextNodeBlockIsOnOneLine", js.Any.fromFunction0(value))
    
    inline def setCurrentTokenParent(value: IndentationNodeContext): Self = StObject.set(x, "currentTokenParent", value.asInstanceOf[js.Any])
    
    inline def setCurrentTokenSpan(value: TokenSpan): Self = StObject.set(x, "currentTokenSpan", value.asInstanceOf[js.Any])
    
    inline def setFormattingRequestKind(value: FormattingRequestKind): Self = StObject.set(x, "formattingRequestKind", value.asInstanceOf[js.Any])
    
    inline def setNextNodeAllOnSameLine(value: () => Boolean): Self = StObject.set(x, "NextNodeAllOnSameLine", js.Any.fromFunction0(value))
    
    inline def setNextNodeBlockIsOnOneLine(value: () => Boolean): Self = StObject.set(x, "NextNodeBlockIsOnOneLine", js.Any.fromFunction0(value))
    
    inline def setNextTokenParent(value: IndentationNodeContext): Self = StObject.set(x, "nextTokenParent", value.asInstanceOf[js.Any])
    
    inline def setNextTokenSpan(value: TokenSpan): Self = StObject.set(x, "nextTokenSpan", value.asInstanceOf[js.Any])
    
    inline def setNodeIsOnOneLine(value: IndentationNodeContext => Boolean): Self = StObject.set(x, "NodeIsOnOneLine", js.Any.fromFunction1(value))
    
    inline def setSnapshot(value: Any): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setTokensAreOnSameLine(value: () => Boolean): Self = StObject.set(x, "TokensAreOnSameLine", js.Any.fromFunction0(value))
    
    inline def setUpdateContext(
      value: (TokenSpan, IndentationNodeContext, TokenSpan, IndentationNodeContext, IndentationNodeContext) => Unit
    ): Self = StObject.set(x, "updateContext", js.Any.fromFunction5(value))
  }
}
