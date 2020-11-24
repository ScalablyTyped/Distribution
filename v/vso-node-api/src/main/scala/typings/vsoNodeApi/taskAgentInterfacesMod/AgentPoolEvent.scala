package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentPoolEvent extends js.Object {
  
  var eventType: String = js.native
  
  var pool: TaskAgentPool = js.native
}
object AgentPoolEvent {
  
  @scala.inline
  def apply(eventType: String, pool: TaskAgentPool): AgentPoolEvent = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentPoolEvent]
  }
  
  @scala.inline
  implicit class AgentPoolEventOps[Self <: AgentPoolEvent] (val x: Self) extends AnyVal {
    
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
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPool(value: TaskAgentPool): Self = this.set("pool", value.asInstanceOf[js.Any])
  }
}
