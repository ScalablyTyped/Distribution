package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildUpdatedEvent extends RealtimeBuildEvent {
  var build: Build
}

object BuildUpdatedEvent {
  @scala.inline
  def apply(build: Build, buildId: Double): BuildUpdatedEvent = {
    val __obj = js.Dynamic.literal(build = build, buildId = buildId)
  
    __obj.asInstanceOf[BuildUpdatedEvent]
  }
}

