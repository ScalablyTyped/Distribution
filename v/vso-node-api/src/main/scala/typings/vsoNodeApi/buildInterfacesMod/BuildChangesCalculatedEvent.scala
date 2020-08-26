package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildChangesCalculatedEvent extends BuildUpdatedEvent {
  var changes: js.Array[Change] = js.native
}

object BuildChangesCalculatedEvent {
  @scala.inline
  def apply(build: Build, buildId: Double, changes: js.Array[Change]): BuildChangesCalculatedEvent = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildChangesCalculatedEvent]
  }
  @scala.inline
  implicit class BuildChangesCalculatedEventOps[Self <: BuildChangesCalculatedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChangesVarargs(value: Change*): Self = this.set("changes", js.Array(value :_*))
    @scala.inline
    def setChanges(value: js.Array[Change]): Self = this.set("changes", value.asInstanceOf[js.Any])
  }
  
}

