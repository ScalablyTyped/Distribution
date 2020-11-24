package typings.typescript.mod

import typings.typescript.typescriptStrings.invoked
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
  implicit class SignatureHelpInvokedReasonOps[Self <: SignatureHelpInvokedReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: invoked): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
}
