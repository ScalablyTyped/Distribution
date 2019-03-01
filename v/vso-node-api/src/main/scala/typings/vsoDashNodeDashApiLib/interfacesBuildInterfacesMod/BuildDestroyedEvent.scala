package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDestroyedEvent extends RealtimeBuildEvent {
  var build: Build
}

object BuildDestroyedEvent {
  @scala.inline
  def apply(build: Build, buildId: scala.Double): BuildDestroyedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("buildId")(buildId)
    __obj.asInstanceOf[BuildDestroyedEvent]
  }
}

