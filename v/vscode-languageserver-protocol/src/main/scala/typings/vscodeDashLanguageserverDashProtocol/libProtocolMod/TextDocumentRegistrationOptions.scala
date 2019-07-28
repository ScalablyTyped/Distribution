package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentRegistrationOptions extends js.Object {
  /**
    * A document selector to identify the scope of the registration. If set to null
    * the document selector provided on the client side will be used.
    */
  var documentSelector: DocumentSelector | Null
}

object TextDocumentRegistrationOptions {
  @scala.inline
  def apply(documentSelector: DocumentSelector = null): TextDocumentRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector)
    __obj.asInstanceOf[TextDocumentRegistrationOptions]
  }
}

