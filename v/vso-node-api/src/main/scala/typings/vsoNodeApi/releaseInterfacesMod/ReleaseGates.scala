package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseGates extends StObject {
  
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
    val __obj = js.Dynamic.literal(deploymentJobs = deploymentJobs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModifiedOn = lastModifiedOn.asInstanceOf[js.Any], runPlanId = runPlanId.asInstanceOf[js.Any], stabilizationCompletedOn = stabilizationCompletedOn.asInstanceOf[js.Any], startedOn = startedOn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseGates]
  }
  
  @scala.inline
  implicit class ReleaseGatesMutableBuilder[Self <: ReleaseGates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentJobs(value: js.Array[DeploymentJob]): Self = StObject.set(x, "deploymentJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentJobsVarargs(value: DeploymentJob*): Self = StObject.set(x, "deploymentJobs", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedOn(value: Date): Self = StObject.set(x, "lastModifiedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunPlanId(value: String): Self = StObject.set(x, "runPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStabilizationCompletedOn(value: Date): Self = StObject.set(x, "stabilizationCompletedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedOn(value: Date): Self = StObject.set(x, "startedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: GateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
