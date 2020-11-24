package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceEdit extends js.Object {
  
  /**
    * Holds changes to existing resources.
    */
  var changes: js.UndefOr[StringDictionary[js.Array[TextEdit]]] = js.native
  
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
  var documentChanges: js.UndefOr[js.Array[TextDocumentEdit | CreateFile | RenameFile | DeleteFile]] = js.native
}
@JSImport("vscode-languageserver-types", "WorkspaceEdit")
@js.native
object WorkspaceEdit extends js.Object {
  
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.WorkspaceEdit */ Boolean = js.native
}
