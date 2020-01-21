package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverTypes.mod.DocumentUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "TextDocumentIdentifier")
@js.native
object TextDocumentIdentifier extends js.Object {
  /**
    * Creates a new TextDocumentIdentifier literal.
    * @param uri The document's uri.
    */
  def create(uri: DocumentUri): typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier = js.native
  /**
    * Checks whether the given literal conforms to the [TextDocumentIdentifier](#TextDocumentIdentifier) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentIdentifier */ Boolean = js.native
}

