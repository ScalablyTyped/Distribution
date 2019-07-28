package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

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
    val __obj = js.Dynamic.literal(defaultSourceControlType = defaultSourceControlType, project = project, supportsGit = supportsGit, supportsTFVC = supportsTFVC)
  
    __obj.asInstanceOf[VersionControlProjectInfo]
  }
}

