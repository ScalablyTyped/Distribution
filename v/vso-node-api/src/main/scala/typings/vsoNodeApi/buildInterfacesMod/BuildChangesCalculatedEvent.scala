package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildChangesCalculatedEvent extends BuildUpdatedEvent {
  var changes: js.Array[Change]
}

object BuildChangesCalculatedEvent {
  @scala.inline
  def apply(build: Build, buildId: Double, changes: js.Array[Change]): BuildChangesCalculatedEvent = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildChangesCalculatedEvent]
  }
}

