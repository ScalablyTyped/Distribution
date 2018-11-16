package typings
package vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "TextDocument")
@js.native
object TextDocumentNs extends js.Object {
  def applyEdits(
    document: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument,
    edits: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit
    ]
  ): java.lang.String = js.native
  /**
       * Creates a new ITextDocument literal from the given uri and content.
       * @param uri The document's uri.
       * @param languageId  The document's language Id.
       * @param content The document's content.
       */
  def create(
    uri: java.lang.String,
    languageId: java.lang.String,
    version: scala.Double,
    content: java.lang.String
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocument = js.native
  /**
       * Checks whether the given literal conforms to the [ITextDocument](#ITextDocument) interface.
       */
  def is(value: js.Any): /* is TextDocument */scala.Boolean = js.native
}

