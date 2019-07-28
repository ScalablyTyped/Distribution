package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuousIntegrationTrigger extends BuildTrigger {
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
    val __obj = js.Dynamic.literal(batchChanges = batchChanges, branchFilters = branchFilters, maxConcurrentBuildsPerBranch = maxConcurrentBuildsPerBranch, pathFilters = pathFilters, pollingInterval = pollingInterval, pollingJobId = pollingJobId, triggerType = triggerType)
  
    __obj.asInstanceOf[ContinuousIntegrationTrigger]
  }
}

