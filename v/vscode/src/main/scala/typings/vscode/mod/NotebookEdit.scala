package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "NotebookEdit")
@js.native
open class NotebookEdit protected () extends StObject {
  def this(range: NotebookRange, newCells: js.Array[NotebookCellData]) = this()
  
  /**
  		 * Optional new metadata for the cells.
  		 */
  var newCellMetadata: js.UndefOr[StringDictionary[Any]] = js.native
  
  /**
  		 * New cells being inserted. May be empty.
  		 */
  var newCells: js.Array[NotebookCellData] = js.native
  
  /**
  		 * Optional new metadata for the notebook.
  		 */
  var newNotebookMetadata: js.UndefOr[StringDictionary[Any]] = js.native
  
  /**
  		 * Range of the cells being edited. May be empty.
  		 */
  var range: NotebookRange = js.native
}
/* static members */
object NotebookEdit {
  
  @JSImport("vscode", "NotebookEdit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * Utility to create an edit that deletes cells in a notebook.
  		 *
  		 * @param range The range of cells to delete.
  		 */
  inline def deleteCells(range: NotebookRange): NotebookEdit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteCells")(range.asInstanceOf[js.Any]).asInstanceOf[NotebookEdit]
  
  /**
  		 * Utility to create an edit that replaces cells in a notebook.
  		 *
  		 * @param index The index to insert cells at.
  		 * @param newCells The new notebook cells.
  		 */
  inline def insertCells(index: Double, newCells: js.Array[NotebookCellData]): NotebookEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertCells")(index.asInstanceOf[js.Any], newCells.asInstanceOf[js.Any])).asInstanceOf[NotebookEdit]
  
  /**
  		 * Utility to create a edit that replaces cells in a notebook.
  		 *
  		 * @param range The range of cells to replace
  		 * @param newCells The new notebook cells.
  		 */
  inline def replaceCells(range: NotebookRange, newCells: js.Array[NotebookCellData]): NotebookEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceCells")(range.asInstanceOf[js.Any], newCells.asInstanceOf[js.Any])).asInstanceOf[NotebookEdit]
  
  /**
  		 * Utility to create an edit that update a cell's metadata.
  		 *
  		 * @param index The index of the cell to update.
  		 * @param newCellMetadata The new metadata for the cell.
  		 */
  inline def updateCellMetadata(index: Double, newCellMetadata: StringDictionary[Any]): NotebookEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCellMetadata")(index.asInstanceOf[js.Any], newCellMetadata.asInstanceOf[js.Any])).asInstanceOf[NotebookEdit]
  
  /**
  		 * Utility to create an edit that updates the notebook's metadata.
  		 *
  		 * @param newNotebookMetadata The new metadata for the notebook.
  		 */
  inline def updateNotebookMetadata(newNotebookMetadata: StringDictionary[Any]): NotebookEdit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateNotebookMetadata")(newNotebookMetadata.asInstanceOf[js.Any]).asInstanceOf[NotebookEdit]
}
