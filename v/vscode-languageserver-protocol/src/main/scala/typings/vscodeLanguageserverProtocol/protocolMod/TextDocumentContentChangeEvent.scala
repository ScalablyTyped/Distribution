package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverProtocol.anon.Range
  - typings.vscodeLanguageserverProtocol.anon.Text
*/
trait TextDocumentContentChangeEvent extends js.Object

object TextDocumentContentChangeEvent {
  @scala.inline
  def Range(range: typings.vscodeLanguageserverTypes.mod.Range, text: String): TextDocumentContentChangeEvent = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentContentChangeEvent]
  }
  @scala.inline
  def Text(text: String): TextDocumentContentChangeEvent = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentContentChangeEvent]
  }
}

