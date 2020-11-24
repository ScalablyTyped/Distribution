package typings.strongholdPayJs.anon

import typings.strongholdPayJs.mod.global.Stronghold.EVENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends js.Object {
  
  var event: EVENT = js.native
  
  var payload: Data = js.native
}
object Event {
  
  @scala.inline
  def apply(event: EVENT, payload: Data): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: EVENT): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: Data): Self = this.set("payload", value.asInstanceOf[js.Any])
  }
}
