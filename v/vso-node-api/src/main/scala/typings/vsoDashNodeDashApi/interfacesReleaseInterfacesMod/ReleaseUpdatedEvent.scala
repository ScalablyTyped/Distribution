package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseUpdatedEvent extends RealtimeReleaseEvent {
  var release: Release
}

object ReleaseUpdatedEvent {
  @scala.inline
  def apply(projectId: String, release: Release, releaseId: Double): ReleaseUpdatedEvent = {
    val __obj = js.Dynamic.literal(projectId = projectId, release = release, releaseId = releaseId)
  
    __obj.asInstanceOf[ReleaseUpdatedEvent]
  }
}

