package typings
package vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "TextDocumentEdit")
@js.native
object TextDocumentEditNs extends js.Object {
  /**
       * Creates a new `TextDocumentEdit`
       */
  def create(
    textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.VersionedTextDocumentIdentifier,
    edits: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit
    ]
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentEdit = js.native
  def is(value: js.Any): /* is TextDocumentEdit */scala.Boolean = js.native
}

