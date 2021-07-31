package typings.typescript.mod

import typings.typescript.typescriptStrings.invoked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Signals that the user manually requested signature help.
  * The language service will unconditionally attempt to provide a result.
  */
trait SignatureHelpInvokedReason
  extends StObject
     with SignatureHelpTriggerReason {
  
  var kind: invoked
  
  var triggerCharacter: Unit
}
object SignatureHelpInvokedReason {
  
  @scala.inline
  def apply(triggerCharacter: Unit): SignatureHelpInvokedReason = {
    val __obj = js.Dynamic.literal(kind = "invoked", triggerCharacter = triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpInvokedReason]
  }
  
  @scala.inline
  implicit class SignatureHelpInvokedReasonMutableBuilder[Self <: SignatureHelpInvokedReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: invoked): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerCharacter(value: Unit): Self = StObject.set(x, "triggerCharacter", value.asInstanceOf[js.Any])
  }
}
