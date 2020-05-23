package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullContextualTypeContext extends js.Object {
  var astSymbolMap: js.Any
  var contextualType: PullTypeSymbol
  var hasProvisionalErrors: Boolean
  var isInferentiallyTyping: Boolean
  var provisional: Boolean
  var provisionallyTypedSymbols: js.Array[PullSymbol]
  var typeArgumentInferenceContext: TypeArgumentInferenceContext
  def getSymbolForAST(ast: AST): PullSymbol
  def invalidateProvisionallyTypedSymbols(): Unit
  def recordProvisionallyTypedSymbol(symbol: PullSymbol): Unit
  def setSymbolForAST(ast: AST, symbol: PullSymbol): Unit
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
}

