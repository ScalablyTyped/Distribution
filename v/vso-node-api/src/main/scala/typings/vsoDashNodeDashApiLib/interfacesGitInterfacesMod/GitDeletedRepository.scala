package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitDeletedRepository extends js.Object {
  var createdDate: stdLib.Date
  var deletedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var deletedDate: stdLib.Date
  var id: java.lang.String
  var name: java.lang.String
  var project: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference
}

object GitDeletedRepository {
  @scala.inline
  def apply(
    createdDate: stdLib.Date,
    deletedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    deletedDate: stdLib.Date,
    id: java.lang.String,
    name: java.lang.String,
    project: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference
  ): GitDeletedRepository = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createdDate")(createdDate)
    __obj.updateDynamic("deletedBy")(deletedBy)
    __obj.updateDynamic("deletedDate")(deletedDate)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("project")(project)
    __obj.asInstanceOf[GitDeletedRepository]
  }
}

