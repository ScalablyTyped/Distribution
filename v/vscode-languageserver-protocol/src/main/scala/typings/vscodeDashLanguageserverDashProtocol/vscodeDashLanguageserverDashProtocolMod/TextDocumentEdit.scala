package typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextEdit
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.VersionedTextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "TextDocumentEdit")
@js.native
object TextDocumentEdit extends js.Object {
  /**
    * Creates a new `TextDocumentEdit`
    */
  def create(textDocument: VersionedTextDocumentIdentifier, edits: js.Array[TextEdit]): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocumentEdit = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentEdit */ Boolean = js.native
}

