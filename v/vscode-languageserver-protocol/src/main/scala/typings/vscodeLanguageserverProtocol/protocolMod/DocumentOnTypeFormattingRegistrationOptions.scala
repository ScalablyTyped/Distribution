package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentOnTypeFormattingRegistrationOptions
  extends TextDocumentRegistrationOptions
     with DocumentOnTypeFormattingOptions
object DocumentOnTypeFormattingRegistrationOptions {
  
  @scala.inline
  def apply(firstTriggerCharacter: String): DocumentOnTypeFormattingRegistrationOptions = {
    val __obj = js.Dynamic.literal(firstTriggerCharacter = firstTriggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentOnTypeFormattingRegistrationOptions]
  }
}
