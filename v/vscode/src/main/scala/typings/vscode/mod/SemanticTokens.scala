package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "SemanticTokens")
@js.native
open class SemanticTokens protected () extends StObject {
  def this(data: js.typedarray.Uint32Array) = this()
  def this(data: js.typedarray.Uint32Array, resultId: String) = this()
  
  /**
    * The actual tokens data.
    * @see {@link DocumentSemanticTokensProvider.provideDocumentSemanticTokens provideDocumentSemanticTokens} for an explanation of the format.
    */
  val data: js.typedarray.Uint32Array = js.native
  
  /**
    * The result id of the tokens.
    *
    * This is the id that will be passed to `DocumentSemanticTokensProvider.provideDocumentSemanticTokensEdits` (if implemented).
    */
  val resultId: js.UndefOr[String] = js.native
}
