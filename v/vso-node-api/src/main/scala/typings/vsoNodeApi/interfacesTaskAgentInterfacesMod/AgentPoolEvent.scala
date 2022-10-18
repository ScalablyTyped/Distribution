package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentPoolEvent extends StObject {
  
  var eventType: String
  
  var pool: TaskAgentPool
}
object AgentPoolEvent {
  
  inline def apply(eventType: String, pool: TaskAgentPool): AgentPoolEvent = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentPoolEvent]
  }
  
  extension [Self <: AgentPoolEvent](x: Self) {
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setPool(value: TaskAgentPool): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
  }
}
