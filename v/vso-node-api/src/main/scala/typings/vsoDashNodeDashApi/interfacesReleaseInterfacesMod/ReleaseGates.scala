package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseGates extends js.Object {
  var deploymentJobs: js.Array[DeploymentJob]
  var id: Double
  var lastModifiedOn: Date
  var runPlanId: String
  var stabilizationCompletedOn: Date
  var startedOn: Date
  var status: GateStatus
}

object ReleaseGates {
  @scala.inline
  def apply(
    deploymentJobs: js.Array[DeploymentJob],
    id: Double,
    lastModifiedOn: Date,
    runPlanId: String,
    stabilizationCompletedOn: Date,
    startedOn: Date,
    status: GateStatus
  ): ReleaseGates = {
    val __obj = js.Dynamic.literal(deploymentJobs = deploymentJobs, id = id, lastModifiedOn = lastModifiedOn, runPlanId = runPlanId, stabilizationCompletedOn = stabilizationCompletedOn, startedOn = startedOn, status = status)
  
    __obj.asInstanceOf[ReleaseGates]
  }
}

