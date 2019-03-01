package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealTimePullRequestEvent extends js.Object {
  /**
    * The id of this event. Can be used to track send/receive state between client and server.
    */
  var eventId: java.lang.String
  /**
    * The id of the pull request this event was generated for.
    */
  var pullRequestId: scala.Double
}

object RealTimePullRequestEvent {
  @scala.inline
  def apply(eventId: java.lang.String, pullRequestId: scala.Double): RealTimePullRequestEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eventId")(eventId)
    __obj.updateDynamic("pullRequestId")(pullRequestId)
    __obj.asInstanceOf[RealTimePullRequestEvent]
  }
}

