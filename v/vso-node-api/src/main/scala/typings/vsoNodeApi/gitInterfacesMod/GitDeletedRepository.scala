package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitDeletedRepository extends js.Object {
  var createdDate: Date = js.native
  var deletedBy: IdentityRef = js.native
  var deletedDate: Date = js.native
  var id: String = js.native
  var name: String = js.native
  var project: TeamProjectReference = js.native
}

object GitDeletedRepository {
  @scala.inline
  def apply(
    createdDate: Date,
    deletedBy: IdentityRef,
    deletedDate: Date,
    id: String,
    name: String,
    project: TeamProjectReference
  ): GitDeletedRepository = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], deletedBy = deletedBy.asInstanceOf[js.Any], deletedDate = deletedDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitDeletedRepository]
  }
  @scala.inline
  implicit class GitDeletedRepositoryOps[Self <: GitDeletedRepository] (val x: Self) extends AnyVal {
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
    def setCreatedDate(value: Date): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletedBy(value: IdentityRef): Self = this.set("deletedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletedDate(value: Date): Self = this.set("deletedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: TeamProjectReference): Self = this.set("project", value.asInstanceOf[js.Any])
  }
  
}

