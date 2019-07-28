package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelpRegistrationOptions
  extends TextDocumentRegistrationOptions
     with SignatureHelpOptions

object SignatureHelpRegistrationOptions {
  @scala.inline
  def apply(documentSelector: DocumentSelector = null, triggerCharacters: js.Array[String] = null): SignatureHelpRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector)
    if (triggerCharacters != null) __obj.updateDynamic("triggerCharacters")(triggerCharacters)
    __obj.asInstanceOf[SignatureHelpRegistrationOptions]
  }
}

