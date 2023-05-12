package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "NotebookCellOutput")
@js.native
open class NotebookCellOutput protected () extends StObject {
  /**
  		 * Create new notebook output.
  		 *
  		 * @param items Notebook output items.
  		 * @param metadata Optional metadata.
  		 */
  def this(items: js.Array[NotebookCellOutputItem]) = this()
  def this(items: js.Array[NotebookCellOutputItem], metadata: StringDictionary[Any]) = this()
  
  /**
  		 * The output items of this output. Each item must represent the same result. _Note_ that repeated
  		 * MIME types per output is invalid and that the editor will just pick one of them.
  		 *
  		 * ```ts
  		 * new vscode.NotebookCellOutput([
  		 * 	vscode.NotebookCellOutputItem.text('Hello', 'text/plain'),
  		 * 	vscode.NotebookCellOutputItem.text('<i>Hello</i>', 'text/html'),
  		 * 	vscode.NotebookCellOutputItem.text('_Hello_', 'text/markdown'),
  		 * 	vscode.NotebookCellOutputItem.text('Hey', 'text/plain'), // INVALID: repeated type, editor will pick just one
  		 * ])
  		 * ```
  		 */
  var items: js.Array[NotebookCellOutputItem] = js.native
  
  /**
  		 * Arbitrary metadata for this cell output. Can be anything but must be JSON-stringifyable.
  		 */
  var metadata: js.UndefOr[StringDictionary[Any]] = js.native
}
