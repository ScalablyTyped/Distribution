package typings.typescript.mod

import typings.typescript.typescriptStrings.characterTyped
import typings.typescript.typescriptStrings.invoked
import typings.typescript.typescriptStrings.retrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typescript.mod.SignatureHelpInvokedReason
  - typings.typescript.mod.SignatureHelpCharacterTypedReason
  - typings.typescript.mod.SignatureHelpRetriggeredReason
*/
trait SignatureHelpTriggerReason extends js.Object
object SignatureHelpTriggerReason {
  
  @scala.inline
  def SignatureHelpInvokedReason(kind: invoked): SignatureHelpTriggerReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpTriggerReason]
  }
  
  @scala.inline
  def SignatureHelpCharacterTypedReason(kind: characterTyped, triggerCharacter: SignatureHelpTriggerCharacter): SignatureHelpTriggerReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], triggerCharacter = triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpTriggerReason]
  }
  
  @scala.inline
  def SignatureHelpRetriggeredReason(kind: retrigger): SignatureHelpTriggerReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpTriggerReason]
  }
}
