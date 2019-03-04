package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseGates extends js.Object {
  var deploymentJobs: js.Array[DeploymentJob]
  var id: scala.Double
  var lastModifiedOn: stdLib.Date
  var runPlanId: java.lang.String
  var stabilizationCompletedOn: stdLib.Date
  var startedOn: stdLib.Date
  var status: GateStatus
}

object ReleaseGates {
  @scala.inline
  def apply(
    deploymentJobs: js.Array[DeploymentJob],
    id: scala.Double,
    lastModifiedOn: stdLib.Date,
    runPlanId: java.lang.String,
    stabilizationCompletedOn: stdLib.Date,
    startedOn: stdLib.Date,
    status: GateStatus
  ): ReleaseGates = {
    val __obj = js.Dynamic.literal(deploymentJobs = deploymentJobs, id = id, lastModifiedOn = lastModifiedOn, runPlanId = runPlanId, stabilizationCompletedOn = stabilizationCompletedOn, startedOn = startedOn, status = status)
  
    __obj.asInstanceOf[ReleaseGates]
  }
}

