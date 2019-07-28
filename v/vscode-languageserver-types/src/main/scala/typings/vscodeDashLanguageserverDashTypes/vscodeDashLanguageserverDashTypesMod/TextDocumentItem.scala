package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentItem extends js.Object {
  /**
    * The text document's language identifier
    */
  var languageId: String
  /**
    * The content of the opened text document.
    */
  var text: String
  /**
    * The text document's uri.
    */
  var uri: String
  /**
    * The version number of this document (it will increase after each
    * change, including undo/redo).
    */
  var version: Double
}

object TextDocumentItem {
  @scala.inline
  def apply(languageId: String, text: String, uri: String, version: Double): TextDocumentItem = {
    val __obj = js.Dynamic.literal(languageId = languageId, text = text, uri = uri, version = version)
  
    __obj.asInstanceOf[TextDocumentItem]
  }
}

