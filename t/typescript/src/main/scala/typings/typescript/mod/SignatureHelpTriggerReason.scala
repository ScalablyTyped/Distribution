package typings.typescript.mod

import typings.typescript.typescriptStrings.characterTyped
import typings.typescript.typescriptStrings.invoked
import typings.typescript.typescriptStrings.retrigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typescript.mod.SignatureHelpInvokedReason
  - typings.typescript.mod.SignatureHelpCharacterTypedReason
  - typings.typescript.mod.SignatureHelpRetriggeredReason
*/
trait SignatureHelpTriggerReason extends StObject
object SignatureHelpTriggerReason {
  
  @scala.inline
  def SignatureHelpCharacterTypedReason(kind: characterTyped, triggerCharacter: SignatureHelpTriggerCharacter): typings.typescript.mod.SignatureHelpCharacterTypedReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], triggerCharacter = triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescript.mod.SignatureHelpCharacterTypedReason]
  }
  
  @scala.inline
  def SignatureHelpInvokedReason(kind: invoked): typings.typescript.mod.SignatureHelpInvokedReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescript.mod.SignatureHelpInvokedReason]
  }
  
  @scala.inline
  def SignatureHelpRetriggeredReason(kind: retrigger): typings.typescript.mod.SignatureHelpRetriggeredReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescript.mod.SignatureHelpRetriggeredReason]
  }
}
