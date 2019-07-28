package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

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
    val __obj = js.Dynamic.literal(projectId = projectId, releaseId = releaseId)
  
    __obj.asInstanceOf[RealtimeReleaseEvent]
  }
}

