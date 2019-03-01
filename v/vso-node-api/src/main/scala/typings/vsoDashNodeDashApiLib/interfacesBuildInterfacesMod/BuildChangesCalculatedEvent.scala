package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildChangesCalculatedEvent extends BuildUpdatedEvent {
  var changes: js.Array[Change]
}

object BuildChangesCalculatedEvent {
  @scala.inline
  def apply(build: Build, buildId: scala.Double, changes: js.Array[Change]): BuildChangesCalculatedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("buildId")(buildId)
    __obj.updateDynamic("changes")(changes)
    __obj.asInstanceOf[BuildChangesCalculatedEvent]
  }
}

