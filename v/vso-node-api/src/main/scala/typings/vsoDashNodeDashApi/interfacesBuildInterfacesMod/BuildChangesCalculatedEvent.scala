package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildChangesCalculatedEvent extends BuildUpdatedEvent {
  var changes: js.Array[Change]
}

object BuildChangesCalculatedEvent {
  @scala.inline
  def apply(build: Build, buildId: Double, changes: js.Array[Change]): BuildChangesCalculatedEvent = {
    val __obj = js.Dynamic.literal(build = build, buildId = buildId, changes = changes)
  
    __obj.asInstanceOf[BuildChangesCalculatedEvent]
  }
}

