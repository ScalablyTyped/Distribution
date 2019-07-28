package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-types", "TextDocument")
@js.native
object TextDocumentNs extends js.Object {
  def applyEdits(document: TextDocument, edits: js.Array[TextEdit]): String = js.native
  /**
    * Creates a new ITextDocument literal from the given uri and content.
    * @param uri The document's uri.
    * @param languageId  The document's language Id.
    * @param content The document's content.
    */
  def create(uri: String, languageId: String, version: Double, content: String): TextDocument = js.native
  /**
    * Checks whether the given literal conforms to the [ITextDocument](#ITextDocument) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocument */ Boolean = js.native
}

