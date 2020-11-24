package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentRequestEvent extends js.Object {
  
  var eventType: String = js.native
  
  var planId: String = js.native
  
  var poolId: Double = js.native
  
  var reservedAgentId: Double = js.native
  
  var result: TaskResult = js.native
  
  var timeStamp: Date = js.native
}
object AgentRequestEvent {
  
  @scala.inline
  def apply(
    eventType: String,
    planId: String,
    poolId: Double,
    reservedAgentId: Double,
    result: TaskResult,
    timeStamp: Date
  ): AgentRequestEvent = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], poolId = poolId.asInstanceOf[js.Any], reservedAgentId = reservedAgentId.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentRequestEvent]
  }
  
  @scala.inline
  implicit class AgentRequestEventOps[Self <: AgentRequestEvent] (val x: Self) extends AnyVal {
    
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
    def setPlanId(value: String): Self = this.set("planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolId(value: Double): Self = this.set("poolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedAgentId(value: Double): Self = this.set("reservedAgentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: TaskResult): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Date): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
  }
}
