package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchUpdatedEvent extends RealTimePullRequestEvent {
  /**
    * If true, the source branch of the pull request was updated
    */
  var isSourceUpdate: Boolean
}

object BranchUpdatedEvent {
  @scala.inline
  def apply(eventId: String, isSourceUpdate: Boolean, pullRequestId: Double): BranchUpdatedEvent = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], isSourceUpdate = isSourceUpdate.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BranchUpdatedEvent]
  }
}

