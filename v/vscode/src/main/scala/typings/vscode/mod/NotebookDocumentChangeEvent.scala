package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookDocumentChangeEvent extends StObject {
  
  /**
  		 * An array of {@link NotebookDocumentCellChange cell changes}.
  		 */
  val cellChanges: js.Array[NotebookDocumentCellChange]
  
  /**
  		 * An array of content changes describing added or removed {@link NotebookCell cells}.
  		 */
  val contentChanges: js.Array[NotebookDocumentContentChange]
  
  /**
  		 * The new metadata of the notebook or `undefined` when it did not change.
  		 */
  val metadata: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
  		 * The affected notebook.
  		 */
  val notebook: NotebookDocument
}
object NotebookDocumentChangeEvent {
  
  inline def apply(
    cellChanges: js.Array[NotebookDocumentCellChange],
    contentChanges: js.Array[NotebookDocumentContentChange],
    notebook: NotebookDocument
  ): NotebookDocumentChangeEvent = {
    val __obj = js.Dynamic.literal(cellChanges = cellChanges.asInstanceOf[js.Any], contentChanges = contentChanges.asInstanceOf[js.Any], notebook = notebook.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookDocumentChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotebookDocumentChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setCellChanges(value: js.Array[NotebookDocumentCellChange]): Self = StObject.set(x, "cellChanges", value.asInstanceOf[js.Any])
    
    inline def setCellChangesVarargs(value: NotebookDocumentCellChange*): Self = StObject.set(x, "cellChanges", js.Array(value*))
    
    inline def setContentChanges(value: js.Array[NotebookDocumentContentChange]): Self = StObject.set(x, "contentChanges", value.asInstanceOf[js.Any])
    
    inline def setContentChangesVarargs(value: NotebookDocumentContentChange*): Self = StObject.set(x, "contentChanges", js.Array(value*))
    
    inline def setMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNotebook(value: NotebookDocument): Self = StObject.set(x, "notebook", value.asInstanceOf[js.Any])
  }
}
