package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookDocumentContentChange extends StObject {
  
  /**
  		 * Cells that have been added to the document.
  		 */
  val addedCells: js.Array[NotebookCell]
  
  /**
  		 * The range at which cells have been either added or removed.
  		 *
  		 * Note that no cells have been {@link NotebookDocumentContentChange.removedCells removed}
  		 * when this range is {@link NotebookRange.isEmpty empty}.
  		 */
  val range: NotebookRange
  
  /**
  		 * Cells that have been removed from the document.
  		 */
  val removedCells: js.Array[NotebookCell]
}
object NotebookDocumentContentChange {
  
  inline def apply(addedCells: js.Array[NotebookCell], range: NotebookRange, removedCells: js.Array[NotebookCell]): NotebookDocumentContentChange = {
    val __obj = js.Dynamic.literal(addedCells = addedCells.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], removedCells = removedCells.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookDocumentContentChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotebookDocumentContentChange] (val x: Self) extends AnyVal {
    
    inline def setAddedCells(value: js.Array[NotebookCell]): Self = StObject.set(x, "addedCells", value.asInstanceOf[js.Any])
    
    inline def setAddedCellsVarargs(value: NotebookCell*): Self = StObject.set(x, "addedCells", js.Array(value*))
    
    inline def setRange(value: NotebookRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRemovedCells(value: js.Array[NotebookCell]): Self = StObject.set(x, "removedCells", value.asInstanceOf[js.Any])
    
    inline def setRemovedCellsVarargs(value: NotebookCell*): Self = StObject.set(x, "removedCells", js.Array(value*))
  }
}
