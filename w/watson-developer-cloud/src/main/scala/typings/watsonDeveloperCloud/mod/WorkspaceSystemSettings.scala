package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Global settings for the workspace. */
@js.native
trait WorkspaceSystemSettings extends js.Object {
  /** Workspace settings related to the disambiguation feature. **Note:** This feature is available only to Premium users. */
  var disambiguation: js.UndefOr[WorkspaceSystemSettingsDisambiguation] = js.native
  /** For internal use only. */
  var human_agent_assist: js.UndefOr[js.Object] = js.native
  /** Workspace settings related to the Watson Assistant tool. */
  var tooling: js.UndefOr[WorkspaceSystemSettingsTooling] = js.native
}

object WorkspaceSystemSettings {
  @scala.inline
  def apply(): WorkspaceSystemSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceSystemSettings]
  }
  @scala.inline
  implicit class WorkspaceSystemSettingsOps[Self <: WorkspaceSystemSettings] (val x: Self) extends AnyVal {
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
    def setDisambiguation(value: WorkspaceSystemSettingsDisambiguation): Self = this.set("disambiguation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisambiguation: Self = this.set("disambiguation", js.undefined)
    @scala.inline
    def setHuman_agent_assist(value: js.Object): Self = this.set("human_agent_assist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHuman_agent_assist: Self = this.set("human_agent_assist", js.undefined)
    @scala.inline
    def setTooling(value: WorkspaceSystemSettingsTooling): Self = this.set("tooling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooling: Self = this.set("tooling", js.undefined)
  }
  
}

