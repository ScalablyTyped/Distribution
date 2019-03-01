package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentChangeEvent extends js.Object {
  /**
    * The document that has changed.
    */
  var document: TextDocument
}

object TextDocumentChangeEvent {
  @scala.inline
  def apply(document: TextDocument): TextDocumentChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("document")(document)
    __obj.asInstanceOf[TextDocumentChangeEvent]
  }
}

