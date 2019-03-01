package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueuedReleaseData extends js.Object {
  var projectId: java.lang.String
  var queuePosition: scala.Double
  var releaseId: scala.Double
}

object QueuedReleaseData {
  @scala.inline
  def apply(projectId: java.lang.String, queuePosition: scala.Double, releaseId: scala.Double): QueuedReleaseData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("projectId")(projectId)
    __obj.updateDynamic("queuePosition")(queuePosition)
    __obj.updateDynamic("releaseId")(releaseId)
    __obj.asInstanceOf[QueuedReleaseData]
  }
}

