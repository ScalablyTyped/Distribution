package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuousIntegrationTrigger extends BuildTrigger {
  /**
    * Indicates whether changes should be batched while another CI build is running.
    */
  var batchChanges: scala.Boolean
  var branchFilters: js.Array[java.lang.String]
  /**
    * The maximum number of simultaneous CI builds that will run per branch.
    */
  var maxConcurrentBuildsPerBranch: scala.Double
  var pathFilters: js.Array[java.lang.String]
  /**
    * The polling interval, in seconds.
    */
  var pollingInterval: scala.Double
  /**
    * The ID of the job used to poll an external repository.
    */
  var pollingJobId: java.lang.String
}

