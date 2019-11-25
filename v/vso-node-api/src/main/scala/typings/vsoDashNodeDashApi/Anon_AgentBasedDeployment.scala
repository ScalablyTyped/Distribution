package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AgentBasedDeployment extends js.Object {
  var agentBasedDeployment: Double
  var machineGroupBasedDeployment: Double
  var runOnServer: Double
  var undefined: Double
}

object Anon_AgentBasedDeployment {
  @scala.inline
  def apply(
    agentBasedDeployment: Double,
    machineGroupBasedDeployment: Double,
    runOnServer: Double,
    undefined: Double
  ): Anon_AgentBasedDeployment = {
    val __obj = js.Dynamic.literal(agentBasedDeployment = agentBasedDeployment.asInstanceOf[js.Any], machineGroupBasedDeployment = machineGroupBasedDeployment.asInstanceOf[js.Any], runOnServer = runOnServer.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AgentBasedDeployment]
  }
}

