package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentChangeEvent extends StObject {
  
  var agent: TaskAgent
  
  var eventType: String
  
  var pool: TaskAgentPoolReference
  
  var poolId: Double
  
  var timeStamp: js.Date
}
object AgentChangeEvent {
  
  inline def apply(
    agent: TaskAgent,
    eventType: String,
    pool: TaskAgentPoolReference,
    poolId: Double,
    timeStamp: js.Date
  ): AgentChangeEvent = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], poolId = poolId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentChangeEvent]
  }
  
  extension [Self <: AgentChangeEvent](x: Self) {
    
    inline def setAgent(value: TaskAgent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setPool(value: TaskAgentPoolReference): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    inline def setPoolId(value: Double): Self = StObject.set(x, "poolId", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: js.Date): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
  }
}
