package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Folder extends js.Object {
  /**
    * The process or person who created the folder.
    */
  var createdBy: IdentityRef = js.native
  /**
    * The date the folder was created.
    */
  var createdOn: Date = js.native
  /**
    * The description.
    */
  var description: String = js.native
  /**
    * The process or person that last changed the folder.
    */
  var lastChangedBy: IdentityRef = js.native
  /**
    * The date the folder was last changed.
    */
  var lastChangedDate: Date = js.native
  /**
    * The full path.
    */
  var path: String = js.native
  /**
    * The project.
    */
  var project: TeamProjectReference = js.native
}

object Folder {
  @scala.inline
  def apply(
    createdBy: IdentityRef,
    createdOn: Date,
    description: String,
    lastChangedBy: IdentityRef,
    lastChangedDate: Date,
    path: String,
    project: TeamProjectReference
  ): Folder = {
    val __obj = js.Dynamic.literal(createdBy = createdBy.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], lastChangedBy = lastChangedBy.asInstanceOf[js.Any], lastChangedDate = lastChangedDate.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[Folder]
  }
  @scala.inline
  implicit class FolderOps[Self <: Folder] (val x: Self) extends AnyVal {
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
    def setCreatedBy(value: IdentityRef): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedOn(value: Date): Self = this.set("createdOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastChangedBy(value: IdentityRef): Self = this.set("lastChangedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastChangedDate(value: Date): Self = this.set("lastChangedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: TeamProjectReference): Self = this.set("project", value.asInstanceOf[js.Any])
  }
  
}

