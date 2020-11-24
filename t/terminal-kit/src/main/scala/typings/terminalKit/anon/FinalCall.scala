package typings.terminalKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinalCall extends js.Object {
  
  var finalCall: Boolean = js.native
}
object FinalCall {
  
  @scala.inline
  def apply(finalCall: Boolean): FinalCall = {
    val __obj = js.Dynamic.literal(finalCall = finalCall.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalCall]
  }
  
  @scala.inline
  implicit class FinalCallOps[Self <: FinalCall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFinalCall(value: Boolean): Self = this.set("finalCall", value.asInstanceOf[js.Any])
  }
}
