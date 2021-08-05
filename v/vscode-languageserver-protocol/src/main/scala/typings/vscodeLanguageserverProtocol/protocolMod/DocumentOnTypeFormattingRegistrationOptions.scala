package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentOnTypeFormattingRegistrationOptions
  extends StObject
     with TextDocumentRegistrationOptions
     with DocumentOnTypeFormattingOptions
object DocumentOnTypeFormattingRegistrationOptions {
  
  inline def apply(firstTriggerCharacter: String): DocumentOnTypeFormattingRegistrationOptions = {
    val __obj = js.Dynamic.literal(firstTriggerCharacter = firstTriggerCharacter.asInstanceOf[js.Any], documentSelector = null)
    __obj.asInstanceOf[DocumentOnTypeFormattingRegistrationOptions]
  }
}
