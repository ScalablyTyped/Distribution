package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullContextualTypeContext extends StObject {
  
  var astSymbolMap: js.Any
  
  var contextualType: PullTypeSymbol
  
  def getSymbolForAST(ast: AST): PullSymbol
  
  var hasProvisionalErrors: Boolean
  
  def invalidateProvisionallyTypedSymbols(): Unit
  
  var isInferentiallyTyping: Boolean
  
  var provisional: Boolean
  
  var provisionallyTypedSymbols: js.Array[PullSymbol]
  
  def recordProvisionallyTypedSymbol(symbol: PullSymbol): Unit
  
  def setSymbolForAST(ast: AST, symbol: PullSymbol): Unit
  
  var typeArgumentInferenceContext: TypeArgumentInferenceContext
}
object PullContextualTypeContext {
  
  @scala.inline
  def apply(
    astSymbolMap: js.Any,
    contextualType: PullTypeSymbol,
    getSymbolForAST: AST => PullSymbol,
    hasProvisionalErrors: Boolean,
    invalidateProvisionallyTypedSymbols: () => Unit,
    isInferentiallyTyping: Boolean,
    provisional: Boolean,
    provisionallyTypedSymbols: js.Array[PullSymbol],
    recordProvisionallyTypedSymbol: PullSymbol => Unit,
    setSymbolForAST: (AST, PullSymbol) => Unit,
    typeArgumentInferenceContext: TypeArgumentInferenceContext
  ): PullContextualTypeContext = {
    val __obj = js.Dynamic.literal(astSymbolMap = astSymbolMap.asInstanceOf[js.Any], contextualType = contextualType.asInstanceOf[js.Any], getSymbolForAST = js.Any.fromFunction1(getSymbolForAST), hasProvisionalErrors = hasProvisionalErrors.asInstanceOf[js.Any], invalidateProvisionallyTypedSymbols = js.Any.fromFunction0(invalidateProvisionallyTypedSymbols), isInferentiallyTyping = isInferentiallyTyping.asInstanceOf[js.Any], provisional = provisional.asInstanceOf[js.Any], provisionallyTypedSymbols = provisionallyTypedSymbols.asInstanceOf[js.Any], recordProvisionallyTypedSymbol = js.Any.fromFunction1(recordProvisionallyTypedSymbol), setSymbolForAST = js.Any.fromFunction2(setSymbolForAST), typeArgumentInferenceContext = typeArgumentInferenceContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullContextualTypeContext]
  }
  
  @scala.inline
  implicit class PullContextualTypeContextMutableBuilder[Self <: PullContextualTypeContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAstSymbolMap(value: js.Any): Self = StObject.set(x, "astSymbolMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextualType(value: PullTypeSymbol): Self = StObject.set(x, "contextualType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSymbolForAST(value: AST => PullSymbol): Self = StObject.set(x, "getSymbolForAST", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasProvisionalErrors(value: Boolean): Self = StObject.set(x, "hasProvisionalErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidateProvisionallyTypedSymbols(value: () => Unit): Self = StObject.set(x, "invalidateProvisionallyTypedSymbols", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInferentiallyTyping(value: Boolean): Self = StObject.set(x, "isInferentiallyTyping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisional(value: Boolean): Self = StObject.set(x, "provisional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionallyTypedSymbols(value: js.Array[PullSymbol]): Self = StObject.set(x, "provisionallyTypedSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionallyTypedSymbolsVarargs(value: PullSymbol*): Self = StObject.set(x, "provisionallyTypedSymbols", js.Array(value :_*))
    
    @scala.inline
    def setRecordProvisionallyTypedSymbol(value: PullSymbol => Unit): Self = StObject.set(x, "recordProvisionallyTypedSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSymbolForAST(value: (AST, PullSymbol) => Unit): Self = StObject.set(x, "setSymbolForAST", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTypeArgumentInferenceContext(value: TypeArgumentInferenceContext): Self = StObject.set(x, "typeArgumentInferenceContext", value.asInstanceOf[js.Any])
  }
}
