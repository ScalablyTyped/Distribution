package typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod

import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidCloseNotebookDocumentParams extends StObject {
  
  /**
    * The text documents that represent the content
    * of a notebook cell that got closed.
    */
  var cellTextDocuments: js.Array[TextDocumentIdentifier]
  
  /**
    * The notebook document that got closed.
    */
  var notebookDocument: NotebookDocumentIdentifier
}
object DidCloseNotebookDocumentParams {
  
  inline def apply(cellTextDocuments: js.Array[TextDocumentIdentifier], notebookDocument: NotebookDocumentIdentifier): DidCloseNotebookDocumentParams = {
    val __obj = js.Dynamic.literal(cellTextDocuments = cellTextDocuments.asInstanceOf[js.Any], notebookDocument = notebookDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidCloseNotebookDocumentParams]
  }
  
  extension [Self <: DidCloseNotebookDocumentParams](x: Self) {
    
    inline def setCellTextDocuments(value: js.Array[TextDocumentIdentifier]): Self = StObject.set(x, "cellTextDocuments", value.asInstanceOf[js.Any])
    
    inline def setCellTextDocumentsVarargs(value: TextDocumentIdentifier*): Self = StObject.set(x, "cellTextDocuments", js.Array(value*))
    
    inline def setNotebookDocument(value: NotebookDocumentIdentifier): Self = StObject.set(x, "notebookDocument", value.asInstanceOf[js.Any])
  }
}
