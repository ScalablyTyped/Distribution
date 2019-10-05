package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullContextualTypeContext")
@js.native
class PullContextualTypeContext protected () extends js.Object {
  def this(
    contextualType: PullTypeSymbol,
    provisional: Boolean,
    isInferentiallyTyping: Boolean,
    typeArgumentInferenceContext: TypeArgumentInferenceContext
  ) = this()
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

