package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceEdit extends js.Object {
  /**
    * Holds changes to existing resources.
    */
  var changes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[TextEdit]]] = js.undefined
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
  @scala.inline
  def apply(
    changes: org.scalablytyped.runtime.StringDictionary[js.Array[TextEdit]] = null,
    documentChanges: js.Array[TextDocumentEdit | CreateFile | RenameFile | DeleteFile] = null
  ): WorkspaceEdit = {
    val __obj = js.Dynamic.literal()
    if (changes != null) __obj.updateDynamic("changes")(changes)
    if (documentChanges != null) __obj.updateDynamic("documentChanges")(documentChanges)
    __obj.asInstanceOf[WorkspaceEdit]
  }
}

