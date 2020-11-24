package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDocumentItem extends js.Object {
  
  /**
    * The text document's language identifier
    */
  var languageId: String = js.native
  
  /**
    * The content of the opened text document.
    */
  var text: String = js.native
  
  /**
    * The text document's uri.
    */
  var uri: DocumentUri = js.native
  
  /**
    * The version number of this document (it will increase after each
    * change, including undo/redo).
    */
  var version: Double = js.native
}
@JSImport("vscode-languageserver-types", "TextDocumentItem")
@js.native
object TextDocumentItem extends js.Object {
  
  /**
    * Creates a new TextDocumentItem literal.
    * @param uri The document's uri.
    * @param languageId The document's language identifier.
    * @param version The document's version number.
    * @param text The document's text.
    */
  def create(uri: DocumentUri, languageId: String, version: Double, text: String): TextDocumentItem = js.native
  
  /**
    * Checks whether the given literal conforms to the [TextDocumentItem](#TextDocumentItem) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentItem */ Boolean = js.native
}
