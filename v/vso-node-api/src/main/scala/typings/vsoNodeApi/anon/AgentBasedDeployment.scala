package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentBasedDeployment extends StObject {
  
  var agentBasedDeployment: scala.Double
  
  var machineGroupBasedDeployment: scala.Double
  
  var runOnServer: scala.Double
  
  var undefined: scala.Double
}
object AgentBasedDeployment {
  
  @scala.inline
  def apply(
    agentBasedDeployment: scala.Double,
    machineGroupBasedDeployment: scala.Double,
    runOnServer: scala.Double,
    undefined: scala.Double
  ): AgentBasedDeployment = {
    val __obj = js.Dynamic.literal(agentBasedDeployment = agentBasedDeployment.asInstanceOf[js.Any], machineGroupBasedDeployment = machineGroupBasedDeployment.asInstanceOf[js.Any], runOnServer = runOnServer.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentBasedDeployment]
  }
  
  @scala.inline
  implicit class AgentBasedDeploymentMutableBuilder[Self <: AgentBasedDeployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentBasedDeployment(value: scala.Double): Self = StObject.set(x, "agentBasedDeployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineGroupBasedDeployment(value: scala.Double): Self = StObject.set(x, "machineGroupBasedDeployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunOnServer(value: scala.Double): Self = StObject.set(x, "runOnServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefined(value: scala.Double): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
  }
}
