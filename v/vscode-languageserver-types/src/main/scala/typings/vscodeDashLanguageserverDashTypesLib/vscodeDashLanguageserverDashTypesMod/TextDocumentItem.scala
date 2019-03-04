package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentItem extends js.Object {
  /**
    * The text document's language identifier
    */
  var languageId: java.lang.String
  /**
    * The content of the opened text document.
    */
  var text: java.lang.String
  /**
    * The text document's uri.
    */
  var uri: java.lang.String
  /**
    * The version number of this document (it will increase after each
    * change, including undo/redo).
    */
  var version: scala.Double
}

object TextDocumentItem {
  @scala.inline
  def apply(languageId: java.lang.String, text: java.lang.String, uri: java.lang.String, version: scala.Double): TextDocumentItem = {
    val __obj = js.Dynamic.literal(languageId = languageId, text = text, uri = uri, version = version)
  
    __obj.asInstanceOf[TextDocumentItem]
  }
}

