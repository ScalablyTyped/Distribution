package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentBasedDeployment extends js.Object {
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
}

