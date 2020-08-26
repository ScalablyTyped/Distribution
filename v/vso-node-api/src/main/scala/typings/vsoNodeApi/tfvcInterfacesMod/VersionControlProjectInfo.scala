package typings.vsoNodeApi.tfvcInterfacesMod

import typings.vsoNodeApi.coreInterfacesMod.SourceControlTypes
import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionControlProjectInfo extends js.Object {
  var defaultSourceControlType: SourceControlTypes = js.native
  var project: TeamProjectReference = js.native
  var supportsGit: Boolean = js.native
  var supportsTFVC: Boolean = js.native
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
  @scala.inline
  implicit class VersionControlProjectInfoOps[Self <: VersionControlProjectInfo] (val x: Self) extends AnyVal {
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
    def setDefaultSourceControlType(value: SourceControlTypes): Self = this.set("defaultSourceControlType", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: TeamProjectReference): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsGit(value: Boolean): Self = this.set("supportsGit", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsTFVC(value: Boolean): Self = this.set("supportsTFVC", value.asInstanceOf[js.Any])
  }
  
}

