package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "NotebookCellData")
@js.native
open class NotebookCellData protected () extends StObject {
  /**
  		 * Create new cell data. Minimal cell data specifies its kind, its source value, and the
  		 * language identifier of its source.
  		 *
  		 * @param kind The kind.
  		 * @param value The source value.
  		 * @param languageId The language identifier of the source value.
  		 */
  def this(kind: NotebookCellKind, value: String, languageId: String) = this()
  
  /**
  		 * The execution summary of this cell data.
  		 */
  var executionSummary: js.UndefOr[NotebookCellExecutionSummary] = js.native
  
  /**
  		 * The {@link NotebookCellKind kind} of this cell data.
  		 */
  var kind: NotebookCellKind = js.native
  
  /**
  		 * The language identifier of the source value of this cell data. Any value from
  		 * {@linkcode languages.getLanguages getLanguages} is possible.
  		 */
  var languageId: String = js.native
  
  /**
  		 * Arbitrary metadata of this cell data. Can be anything but must be JSON-stringifyable.
  		 */
  var metadata: js.UndefOr[StringDictionary[Any]] = js.native
  
  /**
  		 * The outputs of this cell data.
  		 */
  var outputs: js.UndefOr[js.Array[NotebookCellOutput]] = js.native
  
  /**
  		 * The source value of this cell data - either source code or formatted text.
  		 */
  var value: String = js.native
}
