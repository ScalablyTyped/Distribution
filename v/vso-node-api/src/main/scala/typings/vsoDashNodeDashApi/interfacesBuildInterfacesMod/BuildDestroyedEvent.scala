package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDestroyedEvent extends RealtimeBuildEvent {
  var build: Build
}

object BuildDestroyedEvent {
  @scala.inline
  def apply(build: Build, buildId: Double): BuildDestroyedEvent = {
    val __obj = js.Dynamic.literal(build = build, buildId = buildId)
  
    __obj.asInstanceOf[BuildDestroyedEvent]
  }
}

