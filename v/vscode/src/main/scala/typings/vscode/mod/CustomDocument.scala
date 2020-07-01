package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a custom document used by a [`CustomEditorProvider`](#CustomEditorProvider).
  *
  * Custom documents are only used within a given `CustomEditorProvider`. The lifecycle of a `CustomDocument` is
  * managed by VS Code. When no more references remain to a `CustomDocument`, it is disposed of.
  */
trait CustomDocument extends js.Object {
  /**
    * The associated uri for this document.
    */
  val uri: Uri
  /**
    * Dispose of the custom document.
    *
    * This is invoked by VS Code when there are no more references to a given `CustomDocument` (for example when
    * all editors associated with the document have been closed.)
    */
  def dispose(): Unit
}

object CustomDocument {
  @scala.inline
  def apply(dispose: () => Unit, uri: Uri): CustomDocument = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDocument]
  }
}

