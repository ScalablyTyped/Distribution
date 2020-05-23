package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentContentChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends TextDocumentContentChangeEvent {
  /**
    * The new text of the whole document.
    */
  var text: String
}

object Text {
  @scala.inline
  def apply(text: String): Text = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

