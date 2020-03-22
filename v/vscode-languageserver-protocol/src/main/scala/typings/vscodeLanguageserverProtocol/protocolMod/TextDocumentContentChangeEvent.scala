package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverProtocol.AnonRange
  - typings.vscodeLanguageserverProtocol.AnonText
*/
trait TextDocumentContentChangeEvent extends js.Object

object TextDocumentContentChangeEvent {
  @scala.inline
  def AnonRange(range: Range, text: String, rangeLength: Int | Double = null): TextDocumentContentChangeEvent = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (rangeLength != null) __obj.updateDynamic("rangeLength")(rangeLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentContentChangeEvent]
  }
  @scala.inline
  def AnonText(text: String): TextDocumentContentChangeEvent = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextDocumentContentChangeEvent]
  }
}

