package typings.vscodeLanguageclient

import typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocumentSelector extends js.Object {
  var documentSelector: DocumentSelector
}

object AnonDocumentSelector {
  @scala.inline
  def apply(documentSelector: DocumentSelector): AnonDocumentSelector = {
    val __obj = js.Dynamic.literal(documentSelector = documentSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDocumentSelector]
  }
}

