package typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod

import typings.vscodeLanguageserverTypes.mod.TextDocumentItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidOpenNotebookDocumentParams extends StObject {
  
  /**
    * The text documents that represent the content
    * of a notebook cell.
    */
  var cellTextDocuments: js.Array[TextDocumentItem]
  
  /**
    * The notebook document that got opened.
    */
  var notebookDocument: NotebookDocument
}
object DidOpenNotebookDocumentParams {
  
  inline def apply(cellTextDocuments: js.Array[TextDocumentItem], notebookDocument: NotebookDocument): DidOpenNotebookDocumentParams = {
    val __obj = js.Dynamic.literal(cellTextDocuments = cellTextDocuments.asInstanceOf[js.Any], notebookDocument = notebookDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidOpenNotebookDocumentParams]
  }
  
  extension [Self <: DidOpenNotebookDocumentParams](x: Self) {
    
    inline def setCellTextDocuments(value: js.Array[TextDocumentItem]): Self = StObject.set(x, "cellTextDocuments", value.asInstanceOf[js.Any])
    
    inline def setCellTextDocumentsVarargs(value: TextDocumentItem*): Self = StObject.set(x, "cellTextDocuments", js.Array(value*))
    
    inline def setNotebookDocument(value: NotebookDocument): Self = StObject.set(x, "notebookDocument", value.asInstanceOf[js.Any])
  }
}
