package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitDeletedRepository extends js.Object {
  var createdDate: Date
  var deletedBy: IdentityRef
  var deletedDate: Date
  var id: String
  var name: String
  var project: TeamProjectReference
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
    val __obj = js.Dynamic.literal(createdDate = createdDate, deletedBy = deletedBy, deletedDate = deletedDate, id = id, name = name, project = project)
  
    __obj.asInstanceOf[GitDeletedRepository]
  }
}

