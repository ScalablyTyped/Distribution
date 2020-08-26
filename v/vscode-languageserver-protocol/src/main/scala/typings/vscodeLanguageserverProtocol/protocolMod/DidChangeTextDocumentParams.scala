package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DidChangeTextDocumentParams extends js.Object {
  /**
    * The actual content changes. The content changes describe single state changes
    * to the document. So if there are two content changes c1 (at array index 0) and
    * c2 (at array index 1) for a document in state S then c1 moves the document from
    * S to S' and c2 from S' to S''. So c1 is computed on the state S and c2 is computed
    * on the state S'.
    *
    * To mirror the content of a document using change events use the following approach:
    * - start with the same initial content
    * - apply the 'textDocument/didChange' notifications in the order you recevie them.
    * - apply the `TextDocumentContentChangeEvent`s in a single notification in the order
    *   you receive them.
    */
  var contentChanges: js.Array[TextDocumentContentChangeEvent] = js.native
  /**
    * The document that did change. The version number points
    * to the version after all provided content changes have
    * been applied.
    */
  var textDocument: VersionedTextDocumentIdentifier = js.native
}

object DidChangeTextDocumentParams {
  @scala.inline
  def apply(
    contentChanges: js.Array[TextDocumentContentChangeEvent],
    textDocument: VersionedTextDocumentIdentifier
  ): DidChangeTextDocumentParams = {
    val __obj = js.Dynamic.literal(contentChanges = contentChanges.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidChangeTextDocumentParams]
  }
  @scala.inline
  implicit class DidChangeTextDocumentParamsOps[Self <: DidChangeTextDocumentParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentChangesVarargs(value: TextDocumentContentChangeEvent*): Self = this.set("contentChanges", js.Array(value :_*))
    @scala.inline
    def setContentChanges(value: js.Array[TextDocumentContentChangeEvent]): Self = this.set("contentChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextDocument(value: VersionedTextDocumentIdentifier): Self = this.set("textDocument", value.asInstanceOf[js.Any])
  }
  
}

