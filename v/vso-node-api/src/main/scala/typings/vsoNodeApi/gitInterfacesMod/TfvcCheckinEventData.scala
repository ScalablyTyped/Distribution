package typings.vsoNodeApi.gitInterfacesMod

import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcCheckinEventData extends js.Object {
  var changeset: TfvcChangeset = js.native
  var project: TeamProjectReference = js.native
}

object TfvcCheckinEventData {
  @scala.inline
  def apply(changeset: TfvcChangeset, project: TeamProjectReference): TfvcCheckinEventData = {
    val __obj = js.Dynamic.literal(changeset = changeset.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcCheckinEventData]
  }
  @scala.inline
  implicit class TfvcCheckinEventDataOps[Self <: TfvcCheckinEventData] (val x: Self) extends AnyVal {
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
    def setChangeset(value: TfvcChangeset): Self = this.set("changeset", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: TeamProjectReference): Self = this.set("project", value.asInstanceOf[js.Any])
  }
  
}

