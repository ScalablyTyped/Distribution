package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildUpdatedEvent extends RealtimeBuildEvent {
  var build: Build
}

object BuildUpdatedEvent {
  @scala.inline
  def apply(build: Build, buildId: scala.Double): BuildUpdatedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("buildId")(buildId)
    __obj.asInstanceOf[BuildUpdatedEvent]
  }
}

