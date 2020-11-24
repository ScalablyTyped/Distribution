package typings.typeformEmbed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnSubmitEvent extends js.Object {
  
  /** ID of the response */
  var response_id: String = js.native
}
object OnSubmitEvent {
  
  @scala.inline
  def apply(response_id: String): OnSubmitEvent = {
    val __obj = js.Dynamic.literal(response_id = response_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSubmitEvent]
  }
  
  @scala.inline
  implicit class OnSubmitEventOps[Self <: OnSubmitEvent] (val x: Self) extends AnyVal {
    
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
    def setResponse_id(value: String): Self = this.set("response_id", value.asInstanceOf[js.Any])
  }
}
