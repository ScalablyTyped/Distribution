package typings.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormattingContext extends StObject {
  
  def BlockIsOnOneLine(node: IndentationNodeContext): Boolean = js.native
  
  def ContextNodeAllOnSameLine(): Boolean = js.native
  
  def ContextNodeBlockIsOnOneLine(): Boolean = js.native
  
  def NextNodeAllOnSameLine(): Boolean = js.native
  
  def NextNodeBlockIsOnOneLine(): Boolean = js.native
  
  def NodeIsOnOneLine(node: IndentationNodeContext): Boolean = js.native
  
  def TokensAreOnSameLine(): Boolean = js.native
  
  var contextNode: IndentationNodeContext = js.native
  
  var contextNodeAllOnSameLine: js.Any = js.native
  
  var contextNodeBlockIsOnOneLine: js.Any = js.native
  
  var currentTokenParent: IndentationNodeContext = js.native
  
  var currentTokenSpan: TokenSpan = js.native
  
  var formattingRequestKind: FormattingRequestKind = js.native
  
  var nextNodeAllOnSameLine: js.Any = js.native
  
  var nextNodeBlockIsOnOneLine: js.Any = js.native
  
  var nextTokenParent: IndentationNodeContext = js.native
  
  var nextTokenSpan: TokenSpan = js.native
  
  var snapshot: js.Any = js.native
  
  var tokensAreOnSameLine: js.Any = js.native
  
  def updateContext(
    currentTokenSpan: TokenSpan,
    currentTokenParent: IndentationNodeContext,
    nextTokenSpan: TokenSpan,
    nextTokenParent: IndentationNodeContext,
    commonParent: IndentationNodeContext
  ): Unit = js.native
}
object FormattingContext {
  
  @scala.inline
  def apply(
    BlockIsOnOneLine: IndentationNodeContext => Boolean,
    ContextNodeAllOnSameLine: () => Boolean,
    ContextNodeBlockIsOnOneLine: () => Boolean,
    NextNodeAllOnSameLine: () => Boolean,
    NextNodeBlockIsOnOneLine: () => Boolean,
    NodeIsOnOneLine: IndentationNodeContext => Boolean,
    TokensAreOnSameLine: () => Boolean,
    contextNode: IndentationNodeContext,
    contextNodeAllOnSameLine: js.Any,
    contextNodeBlockIsOnOneLine: js.Any,
    currentTokenParent: IndentationNodeContext,
    currentTokenSpan: TokenSpan,
    formattingRequestKind: FormattingRequestKind,
    nextNodeAllOnSameLine: js.Any,
    nextNodeBlockIsOnOneLine: js.Any,
    nextTokenParent: IndentationNodeContext,
    nextTokenSpan: TokenSpan,
    snapshot: js.Any,
    tokensAreOnSameLine: js.Any,
    updateContext: (TokenSpan, IndentationNodeContext, TokenSpan, IndentationNodeContext, IndentationNodeContext) => Unit
  ): FormattingContext = {
    val __obj = js.Dynamic.literal(BlockIsOnOneLine = js.Any.fromFunction1(BlockIsOnOneLine), ContextNodeAllOnSameLine = js.Any.fromFunction0(ContextNodeAllOnSameLine), ContextNodeBlockIsOnOneLine = js.Any.fromFunction0(ContextNodeBlockIsOnOneLine), NextNodeAllOnSameLine = js.Any.fromFunction0(NextNodeAllOnSameLine), NextNodeBlockIsOnOneLine = js.Any.fromFunction0(NextNodeBlockIsOnOneLine), NodeIsOnOneLine = js.Any.fromFunction1(NodeIsOnOneLine), TokensAreOnSameLine = js.Any.fromFunction0(TokensAreOnSameLine), contextNode = contextNode.asInstanceOf[js.Any], contextNodeAllOnSameLine = contextNodeAllOnSameLine.asInstanceOf[js.Any], contextNodeBlockIsOnOneLine = contextNodeBlockIsOnOneLine.asInstanceOf[js.Any], currentTokenParent = currentTokenParent.asInstanceOf[js.Any], currentTokenSpan = currentTokenSpan.asInstanceOf[js.Any], formattingRequestKind = formattingRequestKind.asInstanceOf[js.Any], nextNodeAllOnSameLine = nextNodeAllOnSameLine.asInstanceOf[js.Any], nextNodeBlockIsOnOneLine = nextNodeBlockIsOnOneLine.asInstanceOf[js.Any], nextTokenParent = nextTokenParent.asInstanceOf[js.Any], nextTokenSpan = nextTokenSpan.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], tokensAreOnSameLine = tokensAreOnSameLine.asInstanceOf[js.Any], updateContext = js.Any.fromFunction5(updateContext))
    __obj.asInstanceOf[FormattingContext]
  }
  
  @scala.inline
  implicit class FormattingContextMutableBuilder[Self <: FormattingContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockIsOnOneLine(value: IndentationNodeContext => Boolean): Self = StObject.set(x, "BlockIsOnOneLine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContextNode(value: IndentationNodeContext): Self = StObject.set(x, "contextNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextNodeAllOnSameLine(value: () => Boolean): Self = StObject.set(x, "ContextNodeAllOnSameLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContextNodeBlockIsOnOneLine(value: () => Boolean): Self = StObject.set(x, "ContextNodeBlockIsOnOneLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCurrentTokenParent(value: IndentationNodeContext): Self = StObject.set(x, "currentTokenParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTokenSpan(value: TokenSpan): Self = StObject.set(x, "currentTokenSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattingRequestKind(value: FormattingRequestKind): Self = StObject.set(x, "formattingRequestKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextNodeAllOnSameLine(value: () => Boolean): Self = StObject.set(x, "NextNodeAllOnSameLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNextNodeBlockIsOnOneLine(value: () => Boolean): Self = StObject.set(x, "NextNodeBlockIsOnOneLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNextTokenParent(value: IndentationNodeContext): Self = StObject.set(x, "nextTokenParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenSpan(value: TokenSpan): Self = StObject.set(x, "nextTokenSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIsOnOneLine(value: IndentationNodeContext => Boolean): Self = StObject.set(x, "NodeIsOnOneLine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSnapshot(value: js.Any): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensAreOnSameLine(value: () => Boolean): Self = StObject.set(x, "TokensAreOnSameLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateContext(
      value: (TokenSpan, IndentationNodeContext, TokenSpan, IndentationNodeContext, IndentationNodeContext) => Unit
    ): Self = StObject.set(x, "updateContext", js.Any.fromFunction5(value))
  }
}
