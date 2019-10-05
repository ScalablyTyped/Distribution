package typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "TextDocumentItem")
@js.native
object TextDocumentItem extends js.Object {
  /**
    * Creates a new TextDocumentItem literal.
    * @param uri The document's uri.
    * @param languageId The document's language identifier.
    * @param version The document's version number.
    * @param text The document's text.
    */
  def create(uri: String, languageId: String, version: Double, text: String): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocumentItem = js.native
  /**
    * Checks whether the given literal conforms to the [TextDocumentItem](#TextDocumentItem) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentItem */ Boolean = js.native
}

