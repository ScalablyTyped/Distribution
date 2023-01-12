package typings.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidChangeNotebookDocumentParams extends StObject {
  
  /**
    * The actual changes to the notebook document.
    *
    * The changes describe single state changes to the notebook document.
    * So if there are two changes c1 (at array index 0) and c2 (at array
    * index 1) for a notebook in state S then c1 moves the notebook from
    * S to S' and c2 from S' to S''. So c1 is computed on the state S and
    * c2 is computed on the state S'.
    *
    * To mirror the content of a notebook using change events use the following approach:
    * - start with the same initial content
    * - apply the 'notebookDocument/didChange' notifications in the order you receive them.
    * - apply the `NotebookChangeEvent`s in a single notification in the order
    *   you receive them.
    */
  var change: NotebookDocumentChangeEvent
  
  /**
    * The notebook document that did change. The version number points
    * to the version after all provided changes have been applied. If
    * only the text document content of a cell changes the notebook version
    * doesn't necessarily have to change.
    */
  var notebookDocument: VersionedNotebookDocumentIdentifier
}
object DidChangeNotebookDocumentParams {
  
  inline def apply(change: NotebookDocumentChangeEvent, notebookDocument: VersionedNotebookDocumentIdentifier): DidChangeNotebookDocumentParams = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], notebookDocument = notebookDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidChangeNotebookDocumentParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DidChangeNotebookDocumentParams] (val x: Self) extends AnyVal {
    
    inline def setChange(value: NotebookDocumentChangeEvent): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setNotebookDocument(value: VersionedNotebookDocumentIdentifier): Self = StObject.set(x, "notebookDocument", value.asInstanceOf[js.Any])
  }
}
