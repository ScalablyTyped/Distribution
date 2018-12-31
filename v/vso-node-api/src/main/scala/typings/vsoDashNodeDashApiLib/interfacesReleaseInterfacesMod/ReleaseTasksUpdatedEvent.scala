package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseTasksUpdatedEvent extends RealtimeReleaseEvent {
  var environmentId: scala.Double
  var job: ReleaseTask
  var releaseDeployPhaseId: scala.Double
  var releaseStepId: scala.Double
  var tasks: js.Array[ReleaseTask]
}

