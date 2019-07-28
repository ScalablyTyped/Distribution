package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcCheckinEventData extends js.Object {
  var changeset: TfvcChangeset
  var project: TeamProjectReference
}

object TfvcCheckinEventData {
  @scala.inline
  def apply(changeset: TfvcChangeset, project: TeamProjectReference): TfvcCheckinEventData = {
    val __obj = js.Dynamic.literal(changeset = changeset, project = project)
  
    __obj.asInstanceOf[TfvcCheckinEventData]
  }
}

