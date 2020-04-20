package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAgentBasedDeployment extends js.Object {
  var agentBasedDeployment: Double
  var machineGroupBasedDeployment: Double
  var runOnServer: Double
  var undefined: Double
}

object AnonAgentBasedDeployment {
  @scala.inline
  def apply(
    agentBasedDeployment: Double,
    machineGroupBasedDeployment: Double,
    runOnServer: Double,
    undefined: Double
  ): AnonAgentBasedDeployment = {
    val __obj = js.Dynamic.literal(agentBasedDeployment = agentBasedDeployment.asInstanceOf[js.Any], machineGroupBasedDeployment = machineGroupBasedDeployment.asInstanceOf[js.Any], runOnServer = runOnServer.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAgentBasedDeployment]
  }
}

