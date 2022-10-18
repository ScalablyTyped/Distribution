package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinuousIntegrationTrigger
  extends StObject
     with BuildTrigger {
  
  /**
    * Indicates whether changes should be batched while another CI build is running.
    */
  var batchChanges: Boolean
  
  var branchFilters: js.Array[String]
  
  /**
    * The maximum number of simultaneous CI builds that will run per branch.
    */
  var maxConcurrentBuildsPerBranch: Double
  
  var pathFilters: js.Array[String]
  
  /**
    * The polling interval, in seconds.
    */
  var pollingInterval: Double
  
  /**
    * The ID of the job used to poll an external repository.
    */
  var pollingJobId: String
}
object ContinuousIntegrationTrigger {
  
  inline def apply(
    batchChanges: Boolean,
    branchFilters: js.Array[String],
    maxConcurrentBuildsPerBranch: Double,
    pathFilters: js.Array[String],
    pollingInterval: Double,
    pollingJobId: String,
    triggerType: DefinitionTriggerType
  ): ContinuousIntegrationTrigger = {
    val __obj = js.Dynamic.literal(batchChanges = batchChanges.asInstanceOf[js.Any], branchFilters = branchFilters.asInstanceOf[js.Any], maxConcurrentBuildsPerBranch = maxConcurrentBuildsPerBranch.asInstanceOf[js.Any], pathFilters = pathFilters.asInstanceOf[js.Any], pollingInterval = pollingInterval.asInstanceOf[js.Any], pollingJobId = pollingJobId.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousIntegrationTrigger]
  }
  
  extension [Self <: ContinuousIntegrationTrigger](x: Self) {
    
    inline def setBatchChanges(value: Boolean): Self = StObject.set(x, "batchChanges", value.asInstanceOf[js.Any])
    
    inline def setBranchFilters(value: js.Array[String]): Self = StObject.set(x, "branchFilters", value.asInstanceOf[js.Any])
    
    inline def setBranchFiltersVarargs(value: String*): Self = StObject.set(x, "branchFilters", js.Array(value*))
    
    inline def setMaxConcurrentBuildsPerBranch(value: Double): Self = StObject.set(x, "maxConcurrentBuildsPerBranch", value.asInstanceOf[js.Any])
    
    inline def setPathFilters(value: js.Array[String]): Self = StObject.set(x, "pathFilters", value.asInstanceOf[js.Any])
    
    inline def setPathFiltersVarargs(value: String*): Self = StObject.set(x, "pathFilters", js.Array(value*))
    
    inline def setPollingInterval(value: Double): Self = StObject.set(x, "pollingInterval", value.asInstanceOf[js.Any])
    
    inline def setPollingJobId(value: String): Self = StObject.set(x, "pollingJobId", value.asInstanceOf[js.Any])
  }
}
