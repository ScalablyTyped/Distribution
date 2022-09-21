package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PullContextualTypeContext")
@js.native
open class PullContextualTypeContext protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.PullContextualTypeContext {
  def this(
    contextualType: typings.typescriptServices.TypeScript.PullTypeSymbol,
    provisional: Boolean,
    isInferentiallyTyping: Boolean,
    typeArgumentInferenceContext: typings.typescriptServices.TypeScript.TypeArgumentInferenceContext
  ) = this()
  
  /* private */ /* CompleteClass */
  var astSymbolMap: Any = js.native
  
  /* CompleteClass */
  var contextualType: typings.typescriptServices.TypeScript.PullTypeSymbol = js.native
  
  /* CompleteClass */
  override def getSymbolForAST(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.PullSymbol = js.native
  
  /* CompleteClass */
  var hasProvisionalErrors: Boolean = js.native
  
  /* CompleteClass */
  override def invalidateProvisionallyTypedSymbols(): Unit = js.native
  
  /* CompleteClass */
  var isInferentiallyTyping: Boolean = js.native
  
  /* CompleteClass */
  var provisional: Boolean = js.native
  
  /* CompleteClass */
  var provisionallyTypedSymbols: js.Array[typings.typescriptServices.TypeScript.PullSymbol] = js.native
  
  /* CompleteClass */
  override def recordProvisionallyTypedSymbol(symbol: typings.typescriptServices.TypeScript.PullSymbol): Unit = js.native
  
  /* CompleteClass */
  override def setSymbolForAST(
    ast: typings.typescriptServices.TypeScript.AST,
    symbol: typings.typescriptServices.TypeScript.PullSymbol
  ): Unit = js.native
  
  /* CompleteClass */
  var typeArgumentInferenceContext: typings.typescriptServices.TypeScript.TypeArgumentInferenceContext = js.native
}
