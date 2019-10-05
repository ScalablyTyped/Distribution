package typings.vscodeDashLanguageclient.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "VersionedTextDocumentIdentifier")
@js.native
object VersionedTextDocumentIdentifier extends js.Object {
  def create(uri: String): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.VersionedTextDocumentIdentifier = js.native
  /**
    * Creates a new VersionedTextDocumentIdentifier literal.
    * @param uri The document's uri.
    * @param uri The document's text.
    */
  def create(uri: String, version: Double): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.VersionedTextDocumentIdentifier = js.native
  /**
    * Checks whether the given literal conforms to the [VersionedTextDocumentIdentifier](#VersionedTextDocumentIdentifier) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.VersionedTextDocumentIdentifier */ Boolean = js.native
}

