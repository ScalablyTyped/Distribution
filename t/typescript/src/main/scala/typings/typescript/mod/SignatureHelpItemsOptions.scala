package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureHelpItemsOptions extends js.Object {
  
  var triggerReason: js.UndefOr[SignatureHelpTriggerReason] = js.native
}
object SignatureHelpItemsOptions {
  
  @scala.inline
  def apply(): SignatureHelpItemsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureHelpItemsOptions]
  }
  
  @scala.inline
  implicit class SignatureHelpItemsOptionsOps[Self <: SignatureHelpItemsOptions] (val x: Self) extends AnyVal {
    
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
    def setTriggerReason(value: SignatureHelpTriggerReason): Self = this.set("triggerReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerReason: Self = this.set("triggerReason", js.undefined)
  }
}
