package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullContextualTypeContext")
@js.native
class PullContextualTypeContext protected () extends js.Object {
  def this(contextualType: PullTypeSymbol, provisional: scala.Boolean, isInferentiallyTyping: scala.Boolean, typeArgumentInferenceContext: TypeArgumentInferenceContext) = this()
  var astSymbolMap: js.Any = js.native
  var contextualType: PullTypeSymbol = js.native
  var hasProvisionalErrors: scala.Boolean = js.native
  var isInferentiallyTyping: scala.Boolean = js.native
  var provisional: scala.Boolean = js.native
  var provisionallyTypedSymbols: js.Array[PullSymbol] = js.native
  var typeArgumentInferenceContext: TypeArgumentInferenceContext = js.native
  def getSymbolForAST(ast: AST): PullSymbol = js.native
  def invalidateProvisionallyTypedSymbols(): scala.Unit = js.native
  def recordProvisionallyTypedSymbol(symbol: PullSymbol): scala.Unit = js.native
  def setSymbolForAST(ast: AST, symbol: PullSymbol): scala.Unit = js.native
}

