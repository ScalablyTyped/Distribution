package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureHelpItemsOptions extends StObject {
  
  var triggerReason: js.UndefOr[SignatureHelpTriggerReason] = js.native
}
object SignatureHelpItemsOptions {
  
  @scala.inline
  def apply(): SignatureHelpItemsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureHelpItemsOptions]
  }
  
  @scala.inline
  implicit class SignatureHelpItemsOptionsMutableBuilder[Self <: SignatureHelpItemsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerReason(value: SignatureHelpTriggerReason): Self = StObject.set(x, "triggerReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerReasonUndefined: Self = StObject.set(x, "triggerReason", js.undefined)
  }
}
