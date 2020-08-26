package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverTypes.mod.DocumentUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "VersionedTextDocumentIdentifier")
@js.native
object VersionedTextDocumentIdentifier extends js.Object {
  /**
    * Creates a new VersionedTextDocumentIdentifier literal.
    * @param uri The document's uri.
    * @param uri The document's text.
    */
  def create(uri: DocumentUri): typings.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier = js.native
  def create(uri: DocumentUri, version: Double): typings.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier = js.native
  /**
    * Checks whether the given literal conforms to the [VersionedTextDocumentIdentifier](#VersionedTextDocumentIdentifier) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.VersionedTextDocumentIdentifier */ Boolean = js.native
}

