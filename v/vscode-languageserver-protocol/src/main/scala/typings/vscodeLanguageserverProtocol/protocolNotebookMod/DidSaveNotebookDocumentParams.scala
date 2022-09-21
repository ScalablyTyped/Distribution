package typings.vscodeLanguageserverProtocol.protocolNotebookMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidSaveNotebookDocumentParams extends StObject {
  
  /**
    * The notebook document that got saved.
    */
  var notebookDocument: NotebookDocumentIdentifier
}
object DidSaveNotebookDocumentParams {
  
  inline def apply(notebookDocument: NotebookDocumentIdentifier): DidSaveNotebookDocumentParams = {
    val __obj = js.Dynamic.literal(notebookDocument = notebookDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidSaveNotebookDocumentParams]
  }
  
  extension [Self <: DidSaveNotebookDocumentParams](x: Self) {
    
    inline def setNotebookDocument(value: NotebookDocumentIdentifier): Self = StObject.set(x, "notebookDocument", value.asInstanceOf[js.Any])
  }
}
