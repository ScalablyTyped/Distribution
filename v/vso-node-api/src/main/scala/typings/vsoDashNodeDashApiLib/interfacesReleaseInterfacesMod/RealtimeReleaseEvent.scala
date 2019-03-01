package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimeReleaseEvent extends js.Object {
  var projectId: java.lang.String
  var releaseId: scala.Double
}

object RealtimeReleaseEvent {
  @scala.inline
  def apply(projectId: java.lang.String, releaseId: scala.Double): RealtimeReleaseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("projectId")(projectId)
    __obj.updateDynamic("releaseId")(releaseId)
    __obj.asInstanceOf[RealtimeReleaseEvent]
  }
}

