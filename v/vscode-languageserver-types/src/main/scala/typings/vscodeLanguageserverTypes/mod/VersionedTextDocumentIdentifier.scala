package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionedTextDocumentIdentifier extends TextDocumentIdentifier {
  /**
    * The version number of this document. If a versioned text document identifier
    * is sent from the server to the client and the file is not open in the editor
    * (the server has not received an open notification before) the server can send
    * `null` to indicate that the version is unknown and the content on disk is the
    * truth (as speced with document content ownership).
    */
  var version: Double | Null
}

@JSImport("vscode-languageserver-types", "VersionedTextDocumentIdentifier")
@js.native
object VersionedTextDocumentIdentifier extends js.Object {
  def create(uri: DocumentUri): VersionedTextDocumentIdentifier = js.native
  /**
    * Creates a new VersionedTextDocumentIdentifier literal.
    * @param uri The document's uri.
    * @param uri The document's text.
    */
  def create(uri: DocumentUri, version: Double): VersionedTextDocumentIdentifier = js.native
  /**
    * Checks whether the given literal conforms to the [VersionedTextDocumentIdentifier](#VersionedTextDocumentIdentifier) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.VersionedTextDocumentIdentifier */ Boolean = js.native
}

