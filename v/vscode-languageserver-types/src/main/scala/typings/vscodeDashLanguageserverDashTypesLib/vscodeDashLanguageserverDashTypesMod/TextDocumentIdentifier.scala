package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentIdentifier extends js.Object {
  /**
    * The text document's uri.
    */
  var uri: java.lang.String
}

object TextDocumentIdentifier {
  @scala.inline
  def apply(uri: java.lang.String): TextDocumentIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[TextDocumentIdentifier]
  }
}

