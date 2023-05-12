package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookDocument extends StObject {
  
  /**
  		 * Return the cell at the specified index. The index will be adjusted to the notebook.
  		 *
  		 * @param index - The index of the cell to retrieve.
  		 * @return A {@link NotebookCell cell}.
  		 */
  def cellAt(index: Double): NotebookCell = js.native
  
  /**
  		 * The number of cells in the notebook.
  		 */
  val cellCount: Double = js.native
  
  /**
  		 * Get the cells of this notebook. A subset can be retrieved by providing
  		 * a range. The range will be adjusted to the notebook.
  		 *
  		 * @param range A notebook range.
  		 * @returns The cells contained by the range or all cells.
  		 */
  def getCells(): js.Array[NotebookCell] = js.native
  def getCells(range: NotebookRange): js.Array[NotebookCell] = js.native
  
  /**
  		 * `true` if the notebook has been closed. A closed notebook isn't synchronized anymore
  		 * and won't be re-used when the same resource is opened again.
  		 */
  val isClosed: Boolean = js.native
  
  /**
  		 * `true` if there are unpersisted changes.
  		 */
  val isDirty: Boolean = js.native
  
  /**
  		 * Is this notebook representing an untitled file which has not been saved yet.
  		 */
  val isUntitled: Boolean = js.native
  
  /**
  		 * Arbitrary metadata for this notebook. Can be anything but must be JSON-stringifyable.
  		 */
  val metadata: StringDictionary[Any] = js.native
  
  /**
  		 * The type of notebook.
  		 */
  val notebookType: String = js.native
  
  /**
  		 * Save the document. The saving will be handled by the corresponding {@link NotebookSerializer serializer}.
  		 *
  		 * @return A promise that will resolve to true when the document
  		 * has been saved. Will return false if the file was not dirty or when save failed.
  		 */
  def save(): Thenable[Boolean] = js.native
  
  /**
  		 * The associated uri for this notebook.
  		 *
  		 * *Note* that most notebooks use the `file`-scheme, which means they are files on disk. However, **not** all notebooks are
  		 * saved on disk and therefore the `scheme` must be checked before trying to access the underlying file or siblings on disk.
  		 *
  		 * @see {@link FileSystemProvider}
  		 */
  val uri: Uri = js.native
  
  /**
  		 * The version number of this notebook (it will strictly increase after each
  		 * change, including undo/redo).
  		 */
  val version: Double = js.native
}
