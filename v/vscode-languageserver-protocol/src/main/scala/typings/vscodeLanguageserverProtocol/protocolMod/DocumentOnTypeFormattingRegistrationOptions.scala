package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentOnTypeFormattingRegistrationOptions
  extends TextDocumentRegistrationOptions
     with DocumentOnTypeFormattingOptions

object DocumentOnTypeFormattingRegistrationOptions {
  @scala.inline
  def apply(
    firstTriggerCharacter: String,
    documentSelector: DocumentSelector = null,
    moreTriggerCharacter: js.Array[String] = null
  ): DocumentOnTypeFormattingRegistrationOptions = {
    val __obj = js.Dynamic.literal(firstTriggerCharacter = firstTriggerCharacter.asInstanceOf[js.Any])
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector.asInstanceOf[js.Any])
    if (moreTriggerCharacter != null) __obj.updateDynamic("moreTriggerCharacter")(moreTriggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentOnTypeFormattingRegistrationOptions]
  }
}

