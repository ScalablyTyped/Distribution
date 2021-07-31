package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentQueuesEvent extends StObject {
  
  var eventType: String
  
  var queues: js.Array[TaskAgentQueue]
}
object AgentQueuesEvent {
  
  @scala.inline
  def apply(eventType: String, queues: js.Array[TaskAgentQueue]): AgentQueuesEvent = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], queues = queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentQueuesEvent]
  }
  
  @scala.inline
  implicit class AgentQueuesEventMutableBuilder[Self <: AgentQueuesEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueues(value: js.Array[TaskAgentQueue]): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuesVarargs(value: TaskAgentQueue*): Self = StObject.set(x, "queues", js.Array(value :_*))
  }
}
