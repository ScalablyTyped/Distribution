package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseDeployPhase extends js.Object {
  var deploymentJobs: js.Array[DeploymentJob] = js.native
  var errorLog: String = js.native
  var id: Double = js.native
  var manualInterventions: js.Array[ManualIntervention] = js.native
  var name: String = js.native
  var phaseId: String = js.native
  var phaseType: DeployPhaseTypes = js.native
  var rank: Double = js.native
  var runPlanId: String = js.native
  var status: DeployPhaseStatus = js.native
}

object ReleaseDeployPhase {
  @scala.inline
  def apply(
    deploymentJobs: js.Array[DeploymentJob],
    errorLog: String,
    id: Double,
    manualInterventions: js.Array[ManualIntervention],
    name: String,
    phaseId: String,
    phaseType: DeployPhaseTypes,
    rank: Double,
    runPlanId: String,
    status: DeployPhaseStatus
  ): ReleaseDeployPhase = {
    val __obj = js.Dynamic.literal(deploymentJobs = deploymentJobs.asInstanceOf[js.Any], errorLog = errorLog.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], manualInterventions = manualInterventions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phaseId = phaseId.asInstanceOf[js.Any], phaseType = phaseType.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], runPlanId = runPlanId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDeployPhase]
  }
  @scala.inline
  implicit class ReleaseDeployPhaseOps[Self <: ReleaseDeployPhase] (val x: Self) extends AnyVal {
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
    def setDeploymentJobsVarargs(value: DeploymentJob*): Self = this.set("deploymentJobs", js.Array(value :_*))
    @scala.inline
    def setDeploymentJobs(value: js.Array[DeploymentJob]): Self = this.set("deploymentJobs", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorLog(value: String): Self = this.set("errorLog", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setManualInterventionsVarargs(value: ManualIntervention*): Self = this.set("manualInterventions", js.Array(value :_*))
    @scala.inline
    def setManualInterventions(value: js.Array[ManualIntervention]): Self = this.set("manualInterventions", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhaseId(value: String): Self = this.set("phaseId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhaseType(value: DeployPhaseTypes): Self = this.set("phaseType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunPlanId(value: String): Self = this.set("runPlanId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: DeployPhaseStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

