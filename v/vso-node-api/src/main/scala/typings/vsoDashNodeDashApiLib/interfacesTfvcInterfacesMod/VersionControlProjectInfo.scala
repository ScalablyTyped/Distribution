package typings
package vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionControlProjectInfo extends js.Object {
  var defaultSourceControlType: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.SourceControlTypes
  var project: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference
  var supportsGit: scala.Boolean
  var supportsTFVC: scala.Boolean
}

object VersionControlProjectInfo {
  @scala.inline
  def apply(
    defaultSourceControlType: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.SourceControlTypes,
    project: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference,
    supportsGit: scala.Boolean,
    supportsTFVC: scala.Boolean
  ): VersionControlProjectInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultSourceControlType")(defaultSourceControlType)
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("supportsGit")(supportsGit)
    __obj.updateDynamic("supportsTFVC")(supportsTFVC)
    __obj.asInstanceOf[VersionControlProjectInfo]
  }
}

