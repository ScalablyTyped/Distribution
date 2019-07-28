package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDeletedEvent extends RealtimeBuildEvent {
  var build: Build
}

object BuildDeletedEvent {
  @scala.inline
  def apply(build: Build, buildId: Double): BuildDeletedEvent = {
    val __obj = js.Dynamic.literal(build = build, buildId = buildId)
  
    __obj.asInstanceOf[BuildDeletedEvent]
  }
}

