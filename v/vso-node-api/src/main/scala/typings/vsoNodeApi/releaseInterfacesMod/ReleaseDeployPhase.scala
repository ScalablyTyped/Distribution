package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseDeployPhase extends StObject {
  
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
  implicit class ReleaseDeployPhaseMutableBuilder[Self <: ReleaseDeployPhase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentJobs(value: js.Array[DeploymentJob]): Self = StObject.set(x, "deploymentJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentJobsVarargs(value: DeploymentJob*): Self = StObject.set(x, "deploymentJobs", js.Array(value :_*))
    
    @scala.inline
    def setErrorLog(value: String): Self = StObject.set(x, "errorLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualInterventions(value: js.Array[ManualIntervention]): Self = StObject.set(x, "manualInterventions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualInterventionsVarargs(value: ManualIntervention*): Self = StObject.set(x, "manualInterventions", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhaseId(value: String): Self = StObject.set(x, "phaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhaseType(value: DeployPhaseTypes): Self = StObject.set(x, "phaseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunPlanId(value: String): Self = StObject.set(x, "runPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: DeployPhaseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
