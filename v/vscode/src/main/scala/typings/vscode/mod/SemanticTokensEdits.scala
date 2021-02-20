package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "SemanticTokensEdits")
@js.native
class SemanticTokensEdits protected () extends StObject {
  def this(edits: js.Array[SemanticTokensEdit]) = this()
  def this(edits: js.Array[SemanticTokensEdit], resultId: String) = this()
  
  /**
    * The edits to the tokens data.
    * All edits refer to the initial data state.
    */
  val edits: js.Array[SemanticTokensEdit] = js.native
  
  /**
    * The result id of the tokens.
    *
    * This is the id that will be passed to `DocumentSemanticTokensProvider.provideDocumentSemanticTokensEdits` (if implemented).
    */
  val resultId: js.UndefOr[String] = js.native
}
