package typings.typescript.mod

import typings.typescript.typescriptStrings.characterTyped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Signals that the signature help request came from a user typing a character.
  * Depending on the character and the syntactic context, the request may or may not be served a result.
  */
@js.native
trait SignatureHelpCharacterTypedReason extends SignatureHelpTriggerReason {
  
  var kind: characterTyped = js.native
  
  /**
    * Character that was responsible for triggering signature help.
    */
  var triggerCharacter: SignatureHelpTriggerCharacter = js.native
}
object SignatureHelpCharacterTypedReason {
  
  @scala.inline
  def apply(kind: characterTyped, triggerCharacter: SignatureHelpTriggerCharacter): SignatureHelpCharacterTypedReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], triggerCharacter = triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpCharacterTypedReason]
  }
  
  @scala.inline
  implicit class SignatureHelpCharacterTypedReasonMutableBuilder[Self <: SignatureHelpCharacterTypedReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: characterTyped): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerCharacter(value: SignatureHelpTriggerCharacter): Self = StObject.set(x, "triggerCharacter", value.asInstanceOf[js.Any])
  }
}
