package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcCheckinEventData extends js.Object {
  var changeset: TfvcChangeset
  var project: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference
}

object TfvcCheckinEventData {
  @scala.inline
  def apply(
    changeset: TfvcChangeset,
    project: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference
  ): TfvcCheckinEventData = {
    val __obj = js.Dynamic.literal(changeset = changeset, project = project)
  
    __obj.asInstanceOf[TfvcCheckinEventData]
  }
}

