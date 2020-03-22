package typings.vscodeLanguageserverProtocol

import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentContentChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonText extends TextDocumentContentChangeEvent {
  /**
    * The new text of the whole document.
    */
  var text: String
}

object AnonText {
  @scala.inline
  def apply(text: String): AnonText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonText]
  }
}

