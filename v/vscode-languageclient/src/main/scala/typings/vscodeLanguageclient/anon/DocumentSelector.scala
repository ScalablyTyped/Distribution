package typings.vscodeLanguageclient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentSelector extends js.Object {
  var documentSelector: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector
}

object DocumentSelector {
  @scala.inline
  def apply(documentSelector: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector): DocumentSelector = {
    val __obj = js.Dynamic.literal(documentSelector = documentSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSelector]
  }
}

