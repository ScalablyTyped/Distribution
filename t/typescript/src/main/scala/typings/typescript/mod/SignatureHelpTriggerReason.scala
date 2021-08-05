package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typescript.mod.SignatureHelpInvokedReason
  - typings.typescript.mod.SignatureHelpCharacterTypedReason
  - typings.typescript.mod.SignatureHelpRetriggeredReason
*/
trait SignatureHelpTriggerReason extends StObject
object SignatureHelpTriggerReason {
  
  inline def SignatureHelpCharacterTypedReason(triggerCharacter: SignatureHelpTriggerCharacter): typings.typescript.mod.SignatureHelpCharacterTypedReason = {
    val __obj = js.Dynamic.literal(kind = "characterTyped", triggerCharacter = triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescript.mod.SignatureHelpCharacterTypedReason]
  }
  
  inline def SignatureHelpInvokedReason(triggerCharacter: Unit): typings.typescript.mod.SignatureHelpInvokedReason = {
    val __obj = js.Dynamic.literal(kind = "invoked", triggerCharacter = triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescript.mod.SignatureHelpInvokedReason]
  }
  
  inline def SignatureHelpRetriggeredReason(): typings.typescript.mod.SignatureHelpRetriggeredReason = {
    val __obj = js.Dynamic.literal(kind = "retrigger")
    __obj.asInstanceOf[typings.typescript.mod.SignatureHelpRetriggeredReason]
  }
}
