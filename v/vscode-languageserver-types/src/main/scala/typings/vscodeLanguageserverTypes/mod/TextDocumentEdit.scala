package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDocumentEdit extends js.Object {
  
  /**
    * The edits to be applied.
    */
  var edits: js.Array[TextEdit] = js.native
  
  /**
    * The text document to change.
    */
  var textDocument: VersionedTextDocumentIdentifier = js.native
}
@JSImport("vscode-languageserver-types", "TextDocumentEdit")
@js.native
object TextDocumentEdit extends js.Object {
  
  /**
    * Creates a new `TextDocumentEdit`
    */
  def create(textDocument: VersionedTextDocumentIdentifier, edits: js.Array[TextEdit]): TextDocumentEdit = js.native
  
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentEdit */ Boolean = js.native
}
