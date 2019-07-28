package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "TextDocumentIdentifier")
@js.native
object TextDocumentIdentifierNs extends js.Object {
  /**
    * Creates a new TextDocumentIdentifier literal.
    * @param uri The document's uri.
    */
  def create(uri: String): TextDocumentIdentifier = js.native
  /**
    * Checks whether the given literal conforms to the [TextDocumentIdentifier](#TextDocumentIdentifier) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentIdentifier */ Boolean = js.native
}

