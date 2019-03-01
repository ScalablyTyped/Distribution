package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AgentBasedDeployment extends js.Object {
  var agentBasedDeployment: scala.Double
  var machineGroupBasedDeployment: scala.Double
  var runOnServer: scala.Double
  var undefined: scala.Double
}

object Anon_AgentBasedDeployment {
  @scala.inline
  def apply(
    agentBasedDeployment: scala.Double,
    machineGroupBasedDeployment: scala.Double,
    runOnServer: scala.Double,
    undefined: scala.Double
  ): Anon_AgentBasedDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("agentBasedDeployment")(agentBasedDeployment)
    __obj.updateDynamic("machineGroupBasedDeployment")(machineGroupBasedDeployment)
    __obj.updateDynamic("runOnServer")(runOnServer)
    __obj.updateDynamic("undefined")(undefined)
    __obj.asInstanceOf[Anon_AgentBasedDeployment]
  }
}

