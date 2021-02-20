package typings.typescript.mod

import typings.typescript.typescriptStrings.invoked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Signals that the user manually requested signature help.
  * The language service will unconditionally attempt to provide a result.
  */
@js.native
trait SignatureHelpInvokedReason extends SignatureHelpTriggerReason {
  
  var kind: invoked = js.native
  
  var triggerCharacter: js.UndefOr[scala.Nothing] = js.native
}
object SignatureHelpInvokedReason {
  
  @scala.inline
  def apply(kind: invoked): SignatureHelpInvokedReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpInvokedReason]
  }
  
  @scala.inline
  implicit class SignatureHelpInvokedReasonMutableBuilder[Self <: SignatureHelpInvokedReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: invoked): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
