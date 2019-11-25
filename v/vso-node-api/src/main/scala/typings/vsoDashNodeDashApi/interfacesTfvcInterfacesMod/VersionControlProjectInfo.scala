package typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.SourceControlTypes
import typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionControlProjectInfo extends js.Object {
  var defaultSourceControlType: SourceControlTypes
  var project: TeamProjectReference
  var supportsGit: Boolean
  var supportsTFVC: Boolean
}

object VersionControlProjectInfo {
  @scala.inline
  def apply(
    defaultSourceControlType: SourceControlTypes,
    project: TeamProjectReference,
    supportsGit: Boolean,
    supportsTFVC: Boolean
  ): VersionControlProjectInfo = {
    val __obj = js.Dynamic.literal(defaultSourceControlType = defaultSourceControlType.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], supportsGit = supportsGit.asInstanceOf[js.Any], supportsTFVC = supportsTFVC.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VersionControlProjectInfo]
  }
}

