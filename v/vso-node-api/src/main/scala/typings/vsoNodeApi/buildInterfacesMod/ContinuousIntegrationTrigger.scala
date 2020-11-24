package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinuousIntegrationTrigger extends BuildTrigger {
  
  /**
    * Indicates whether changes should be batched while another CI build is running.
    */
  var batchChanges: Boolean = js.native
  
  var branchFilters: js.Array[String] = js.native
  
  /**
    * The maximum number of simultaneous CI builds that will run per branch.
    */
  var maxConcurrentBuildsPerBranch: Double = js.native
  
  var pathFilters: js.Array[String] = js.native
  
  /**
    * The polling interval, in seconds.
    */
  var pollingInterval: Double = js.native
  
  /**
    * The ID of the job used to poll an external repository.
    */
  var pollingJobId: String = js.native
}
object ContinuousIntegrationTrigger {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ContinuousIntegrationTriggerOps[Self <: ContinuousIntegrationTrigger] (val x: Self) extends AnyVal {
    
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
    def setBatchChanges(value: Boolean): Self = this.set("batchChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchFiltersVarargs(value: String*): Self = this.set("branchFilters", js.Array(value :_*))
    
    @scala.inline
    def setBranchFilters(value: js.Array[String]): Self = this.set("branchFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrentBuildsPerBranch(value: Double): Self = this.set("maxConcurrentBuildsPerBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathFiltersVarargs(value: String*): Self = this.set("pathFilters", js.Array(value :_*))
    
    @scala.inline
    def setPathFilters(value: js.Array[String]): Self = this.set("pathFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollingInterval(value: Double): Self = this.set("pollingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollingJobId(value: String): Self = this.set("pollingJobId", value.asInstanceOf[js.Any])
  }
}
