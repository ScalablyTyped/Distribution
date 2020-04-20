package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimeReleaseEvent extends js.Object {
  var projectId: String
  var releaseId: Double
}

object RealtimeReleaseEvent {
  @scala.inline
  def apply(projectId: String, releaseId: Double): RealtimeReleaseEvent = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealtimeReleaseEvent]
  }
}

