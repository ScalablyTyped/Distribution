package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamBacklogMapping extends js.Object {
  var categoryReferenceName: String = js.native
  var teamId: String = js.native
}

object TeamBacklogMapping {
  @scala.inline
  def apply(categoryReferenceName: String, teamId: String): TeamBacklogMapping = {
    val __obj = js.Dynamic.literal(categoryReferenceName = categoryReferenceName.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamBacklogMapping]
  }
  @scala.inline
  implicit class TeamBacklogMappingOps[Self <: TeamBacklogMapping] (val x: Self) extends AnyVal {
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
    def setCategoryReferenceName(value: String): Self = this.set("categoryReferenceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeamId(value: String): Self = this.set("teamId", value.asInstanceOf[js.Any])
  }
  
}

