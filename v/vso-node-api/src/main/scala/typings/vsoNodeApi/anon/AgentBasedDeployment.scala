package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentBasedDeployment extends js.Object {
  var agentBasedDeployment: scala.Double = js.native
  var machineGroupBasedDeployment: scala.Double = js.native
  var runOnServer: scala.Double = js.native
  var undefined: scala.Double = js.native
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
  implicit class AgentBasedDeploymentOps[Self <: AgentBasedDeployment] (val x: Self) extends AnyVal {
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
    def setAgentBasedDeployment(value: scala.Double): Self = this.set("agentBasedDeployment", value.asInstanceOf[js.Any])
    @scala.inline
    def setMachineGroupBasedDeployment(value: scala.Double): Self = this.set("machineGroupBasedDeployment", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunOnServer(value: scala.Double): Self = this.set("runOnServer", value.asInstanceOf[js.Any])
    @scala.inline
    def setUndefined(value: scala.Double): Self = this.set("undefined", value.asInstanceOf[js.Any])
  }
  
}

