package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueuedReleaseData extends js.Object {
  var projectId: String
  var queuePosition: Double
  var releaseId: Double
}

object QueuedReleaseData {
  @scala.inline
  def apply(projectId: String, queuePosition: Double, releaseId: Double): QueuedReleaseData = {
    val __obj = js.Dynamic.literal(projectId = projectId, queuePosition = queuePosition, releaseId = releaseId)
  
    __obj.asInstanceOf[QueuedReleaseData]
  }
}

