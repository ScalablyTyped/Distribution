package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeployPhase extends js.Object {
  var name: java.lang.String
  var phaseType: DeployPhaseTypes
  var rank: scala.Double
  var workflowTasks: js.Array[WorkflowTask]
}

object DeployPhase {
  @scala.inline
  def apply(
    name: java.lang.String,
    phaseType: DeployPhaseTypes,
    rank: scala.Double,
    workflowTasks: js.Array[WorkflowTask]
  ): DeployPhase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("phaseType")(phaseType)
    __obj.updateDynamic("rank")(rank)
    __obj.updateDynamic("workflowTasks")(workflowTasks)
    __obj.asInstanceOf[DeployPhase]
  }
}

