package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentIdentifier extends js.Object {
  /**
    * The text document's uri.
    */
  var uri: String
}

object TextDocumentIdentifier {
  @scala.inline
  def apply(uri: String): TextDocumentIdentifier = {
    val __obj = js.Dynamic.literal(uri = uri)
  
    __obj.asInstanceOf[TextDocumentIdentifier]
  }
}

