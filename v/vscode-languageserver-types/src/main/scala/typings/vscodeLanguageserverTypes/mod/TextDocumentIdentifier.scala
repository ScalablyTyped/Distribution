package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDocumentIdentifier extends js.Object {
  
  /**
    * The text document's uri.
    */
  var uri: DocumentUri = js.native
}
@JSImport("vscode-languageserver-types", "TextDocumentIdentifier")
@js.native
object TextDocumentIdentifier extends js.Object {
  
  /**
    * Creates a new TextDocumentIdentifier literal.
    * @param uri The document's uri.
    */
  def create(uri: DocumentUri): TextDocumentIdentifier = js.native
  
  /**
    * Checks whether the given literal conforms to the [TextDocumentIdentifier](#TextDocumentIdentifier) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentIdentifier */ Boolean = js.native
}
