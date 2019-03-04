package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchUpdatedEvent extends RealTimePullRequestEvent {
  /**
    * If true, the source branch of the pull request was updated
    */
  var isSourceUpdate: scala.Boolean
}

object BranchUpdatedEvent {
  @scala.inline
  def apply(eventId: java.lang.String, isSourceUpdate: scala.Boolean, pullRequestId: scala.Double): BranchUpdatedEvent = {
    val __obj = js.Dynamic.literal(eventId = eventId, isSourceUpdate = isSourceUpdate, pullRequestId = pullRequestId)
  
    __obj.asInstanceOf[BranchUpdatedEvent]
  }
}

