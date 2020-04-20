package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Folder extends js.Object {
  /**
    * The process or person who created the folder.
    */
  var createdBy: IdentityRef
  /**
    * The date the folder was created.
    */
  var createdOn: Date
  /**
    * The description.
    */
  var description: String
  /**
    * The process or person that last changed the folder.
    */
  var lastChangedBy: IdentityRef
  /**
    * The date the folder was last changed.
    */
  var lastChangedDate: Date
  /**
    * The full path.
    */
  var path: String
  /**
    * The project.
    */
  var project: TeamProjectReference
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
}

