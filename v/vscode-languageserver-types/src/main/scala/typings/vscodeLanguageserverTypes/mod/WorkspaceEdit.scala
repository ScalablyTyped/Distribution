package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceEdit extends StObject {
  
  /**
    * Holds changes to existing resources.
    */
  var changes: js.UndefOr[StringDictionary[js.Array[TextEdit]]] = js.undefined
  
  /**
    * Depending on the client capability `workspace.workspaceEdit.resourceOperations` document changes
    * are either an array of `TextDocumentEdit`s to express changes to n different text documents
    * where each text document edit addresses a specific version of a text document. Or it can contain
    * above `TextDocumentEdit`s mixed with create, rename and delete file / folder operations.
    *
    * Whether a client supports versioned document edits is expressed via
    * `workspace.workspaceEdit.documentChanges` client capability.
    *
    * If a client neither supports `documentChanges` nor `workspace.workspaceEdit.resourceOperations` then
    * only plain `TextEdit`s using the `changes` property are supported.
    */
  var documentChanges: js.UndefOr[js.Array[TextDocumentEdit | CreateFile | RenameFile | DeleteFile]] = js.undefined
}
object WorkspaceEdit {
  
  inline def apply(): WorkspaceEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceEdit]
  }
  
  @JSImport("vscode-languageserver-types", "WorkspaceEdit")
  @js.native
  val ^ : js.Any = js.native
  
  inline def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.WorkspaceEdit */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.WorkspaceEdit */ Boolean]
  
  extension [Self <: WorkspaceEdit](x: Self) {
    
    inline def setChanges(value: StringDictionary[js.Array[TextEdit]]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    
    inline def setDocumentChanges(value: js.Array[TextDocumentEdit | CreateFile | RenameFile | DeleteFile]): Self = StObject.set(x, "documentChanges", value.asInstanceOf[js.Any])
    
    inline def setDocumentChangesUndefined: Self = StObject.set(x, "documentChanges", js.undefined)
    
    inline def setDocumentChangesVarargs(value: (TextDocumentEdit | CreateFile | RenameFile | DeleteFile)*): Self = StObject.set(x, "documentChanges", js.Array(value :_*))
  }
}
