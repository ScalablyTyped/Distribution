package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookCell extends StObject {
  
  /**
  		 * The {@link TextDocument text} of this cell, represented as text document.
  		 */
  val document: TextDocument
  
  /**
  		 * The most recent {@link NotebookCellExecutionSummary execution summary} for this cell.
  		 */
  val executionSummary: js.UndefOr[NotebookCellExecutionSummary] = js.undefined
  
  /**
  		 * The index of this cell in its {@link NotebookDocument.cellAt containing notebook}. The
  		 * index is updated when a cell is moved within its notebook. The index is `-1`
  		 * when the cell has been removed from its notebook.
  		 */
  val index: Double
  
  /**
  		 * The kind of this cell.
  		 */
  val kind: NotebookCellKind
  
  /**
  		 * The metadata of this cell. Can be anything but must be JSON-stringifyable.
  		 */
  val metadata: StringDictionary[Any]
  
  /**
  		 * The {@link NotebookDocument notebook} that contains this cell.
  		 */
  val notebook: NotebookDocument
  
  /**
  		 * The outputs of this cell.
  		 */
  val outputs: js.Array[NotebookCellOutput]
}
object NotebookCell {
  
  inline def apply(
    document: TextDocument,
    index: Double,
    kind: NotebookCellKind,
    metadata: StringDictionary[Any],
    notebook: NotebookDocument,
    outputs: js.Array[NotebookCellOutput]
  ): NotebookCell = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], notebook = notebook.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookCell]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotebookCell] (val x: Self) extends AnyVal {
    
    inline def setDocument(value: TextDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setExecutionSummary(value: NotebookCellExecutionSummary): Self = StObject.set(x, "executionSummary", value.asInstanceOf[js.Any])
    
    inline def setExecutionSummaryUndefined: Self = StObject.set(x, "executionSummary", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setKind(value: NotebookCellKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setNotebook(value: NotebookDocument): Self = StObject.set(x, "notebook", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: js.Array[NotebookCellOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: NotebookCellOutput*): Self = StObject.set(x, "outputs", js.Array(value*))
  }
}
