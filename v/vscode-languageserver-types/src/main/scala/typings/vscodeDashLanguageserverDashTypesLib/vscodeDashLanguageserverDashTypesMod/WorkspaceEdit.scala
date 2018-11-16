package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WorkspaceEdit extends js.Object {
  /**
       * Holds changes to existing resources.
       */
  var changes: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Array[TextEdit]]] = js.undefined
  /**
       * An array of `TextDocumentEdit`s to express changes to n different text documents
       * where each text document edit addresses a specific version of a text document.
       * Whether a client supports versioned document edits is expressed via
       * `WorkspaceClientCapabilites.workspaceEdit.documentChanges`.
       */
  var documentChanges: js.UndefOr[js.Array[TextDocumentEdit | CreateFile | RenameFile | DeleteFile]] = js.undefined
}

