package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullContextualTypeContext extends js.Object {
  var astSymbolMap: js.Any = js.native
  var contextualType: PullTypeSymbol = js.native
  var hasProvisionalErrors: Boolean = js.native
  var isInferentiallyTyping: Boolean = js.native
  var provisional: Boolean = js.native
  var provisionallyTypedSymbols: js.Array[PullSymbol] = js.native
  var typeArgumentInferenceContext: TypeArgumentInferenceContext = js.native
  def getSymbolForAST(ast: AST): PullSymbol = js.native
  def invalidateProvisionallyTypedSymbols(): Unit = js.native
  def recordProvisionallyTypedSymbol(symbol: PullSymbol): Unit = js.native
  def setSymbolForAST(ast: AST, symbol: PullSymbol): Unit = js.native
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
  implicit class PullContextualTypeContextOps[Self <: PullContextualTypeContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAstSymbolMap(value: js.Any): Self = this.set("astSymbolMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextualType(value: PullTypeSymbol): Self = this.set("contextualType", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetSymbolForAST(value: AST => PullSymbol): Self = this.set("getSymbolForAST", js.Any.fromFunction1(value))
    @scala.inline
    def setHasProvisionalErrors(value: Boolean): Self = this.set("hasProvisionalErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidateProvisionallyTypedSymbols(value: () => Unit): Self = this.set("invalidateProvisionallyTypedSymbols", js.Any.fromFunction0(value))
    @scala.inline
    def setIsInferentiallyTyping(value: Boolean): Self = this.set("isInferentiallyTyping", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvisional(value: Boolean): Self = this.set("provisional", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvisionallyTypedSymbolsVarargs(value: PullSymbol*): Self = this.set("provisionallyTypedSymbols", js.Array(value :_*))
    @scala.inline
    def setProvisionallyTypedSymbols(value: js.Array[PullSymbol]): Self = this.set("provisionallyTypedSymbols", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordProvisionallyTypedSymbol(value: PullSymbol => Unit): Self = this.set("recordProvisionallyTypedSymbol", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSymbolForAST(value: (AST, PullSymbol) => Unit): Self = this.set("setSymbolForAST", js.Any.fromFunction2(value))
    @scala.inline
    def setTypeArgumentInferenceContext(value: TypeArgumentInferenceContext): Self = this.set("typeArgumentInferenceContext", value.asInstanceOf[js.Any])
  }
  
}

