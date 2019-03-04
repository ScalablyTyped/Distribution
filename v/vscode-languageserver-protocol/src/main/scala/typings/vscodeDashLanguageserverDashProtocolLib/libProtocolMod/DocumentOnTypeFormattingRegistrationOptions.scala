package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentOnTypeFormattingRegistrationOptions
  extends TextDocumentRegistrationOptions
     with DocumentOnTypeFormattingOptions

object DocumentOnTypeFormattingRegistrationOptions {
  @scala.inline
  def apply(
    firstTriggerCharacter: java.lang.String,
    documentSelector: DocumentSelector = null,
    moreTriggerCharacter: js.Array[java.lang.String] = null
  ): DocumentOnTypeFormattingRegistrationOptions = {
    val __obj = js.Dynamic.literal(firstTriggerCharacter = firstTriggerCharacter)
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector)
    if (moreTriggerCharacter != null) __obj.updateDynamic("moreTriggerCharacter")(moreTriggerCharacter)
    __obj.asInstanceOf[DocumentOnTypeFormattingRegistrationOptions]
  }
}

