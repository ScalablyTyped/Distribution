package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookDocumentCellChange extends StObject {
  
  /**
    * The affected notebook.
    */
  val cell: NotebookCell
  
  /**
    * The document of the cell or `undefined` when it did not change.
    *
    * *Note* that you should use the {@link workspace.onDidChangeTextDocument onDidChangeTextDocument}-event
    * for detailed change information, like what edits have been performed.
    */
  val document: js.UndefOr[TextDocument] = js.undefined
  
  /**
    * The new execution summary of the cell or `undefined` when it did not change.
    */
  val executionSummary: js.UndefOr[NotebookCellExecutionSummary] = js.undefined
  
  /**
    * The new metadata of the cell or `undefined` when it did not change.
    */
  val metadata: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * The new outputs of the cell or `undefined` when they did not change.
    */
  val outputs: js.UndefOr[js.Array[NotebookCellOutput]] = js.undefined
}
object NotebookDocumentCellChange {
  
  inline def apply(cell: NotebookCell): NotebookDocumentCellChange = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookDocumentCellChange]
  }
  
  extension [Self <: NotebookDocumentCellChange](x: Self) {
    
    inline def setCell(value: NotebookCell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: TextDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setExecutionSummary(value: NotebookCellExecutionSummary): Self = StObject.set(x, "executionSummary", value.asInstanceOf[js.Any])
    
    inline def setExecutionSummaryUndefined: Self = StObject.set(x, "executionSummary", js.undefined)
    
    inline def setMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOutputs(value: js.Array[NotebookCellOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setOutputsVarargs(value: NotebookCellOutput*): Self = StObject.set(x, "outputs", js.Array(value*))
  }
}
