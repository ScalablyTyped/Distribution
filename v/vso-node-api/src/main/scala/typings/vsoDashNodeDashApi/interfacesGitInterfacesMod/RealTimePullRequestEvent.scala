package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealTimePullRequestEvent extends js.Object {
  /**
    * The id of this event. Can be used to track send/receive state between client and server.
    */
  var eventId: String
  /**
    * The id of the pull request this event was generated for.
    */
  var pullRequestId: Double
}

object RealTimePullRequestEvent {
  @scala.inline
  def apply(eventId: String, pullRequestId: Double): RealTimePullRequestEvent = {
    val __obj = js.Dynamic.literal(eventId = eventId, pullRequestId = pullRequestId)
  
    __obj.asInstanceOf[RealTimePullRequestEvent]
  }
}

