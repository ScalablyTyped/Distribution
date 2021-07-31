package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentQueueEvent extends StObject {
  
  var eventType: String
  
  var queue: TaskAgentQueue
}
object AgentQueueEvent {
  
  @scala.inline
  def apply(eventType: String, queue: TaskAgentQueue): AgentQueueEvent = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentQueueEvent]
  }
  
  @scala.inline
  implicit class AgentQueueEventMutableBuilder[Self <: AgentQueueEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueue(value: TaskAgentQueue): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
  }
}
