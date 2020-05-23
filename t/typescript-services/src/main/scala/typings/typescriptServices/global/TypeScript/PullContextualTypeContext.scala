package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullContextualTypeContext")
@js.native
class PullContextualTypeContext protected ()
  extends typings.typescriptServices.TypeScript.PullContextualTypeContext {
  def this(
    contextualType: typings.typescriptServices.TypeScript.PullTypeSymbol,
    provisional: Boolean,
    isInferentiallyTyping: Boolean,
    typeArgumentInferenceContext: typings.typescriptServices.TypeScript.TypeArgumentInferenceContext
  ) = this()
  /* CompleteClass */
  override var astSymbolMap: js.Any = js.native
  /* CompleteClass */
  override var contextualType: typings.typescriptServices.TypeScript.PullTypeSymbol = js.native
  /* CompleteClass */
  override var hasProvisionalErrors: Boolean = js.native
  /* CompleteClass */
  override var isInferentiallyTyping: Boolean = js.native
  /* CompleteClass */
  override var provisional: Boolean = js.native
  /* CompleteClass */
  override var provisionallyTypedSymbols: js.Array[typings.typescriptServices.TypeScript.PullSymbol] = js.native
  /* CompleteClass */
  override var typeArgumentInferenceContext: typings.typescriptServices.TypeScript.TypeArgumentInferenceContext = js.native
  /* CompleteClass */
  override def getSymbolForAST(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.PullSymbol = js.native
  /* CompleteClass */
  override def invalidateProvisionallyTypedSymbols(): Unit = js.native
  /* CompleteClass */
  override def recordProvisionallyTypedSymbol(symbol: typings.typescriptServices.TypeScript.PullSymbol): Unit = js.native
  /* CompleteClass */
  override def setSymbolForAST(
    ast: typings.typescriptServices.TypeScript.AST,
    symbol: typings.typescriptServices.TypeScript.PullSymbol
  ): Unit = js.native
}

