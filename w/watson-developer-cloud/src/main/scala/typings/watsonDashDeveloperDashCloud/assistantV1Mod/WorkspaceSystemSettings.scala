package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Global settings for the workspace. */
trait WorkspaceSystemSettings extends js.Object {
  /** Workspace settings related to the disambiguation feature. **Note:** This feature is available only to Premium users. */
  var disambiguation: js.UndefOr[WorkspaceSystemSettingsDisambiguation] = js.undefined
  /** For internal use only. */
  var human_agent_assist: js.UndefOr[js.Object] = js.undefined
  /** Workspace settings related to the Watson Assistant tool. */
  var tooling: js.UndefOr[WorkspaceSystemSettingsTooling] = js.undefined
}

object WorkspaceSystemSettings {
  @scala.inline
  def apply(
    disambiguation: WorkspaceSystemSettingsDisambiguation = null,
    human_agent_assist: js.Object = null,
    tooling: WorkspaceSystemSettingsTooling = null
  ): WorkspaceSystemSettings = {
    val __obj = js.Dynamic.literal()
    if (disambiguation != null) __obj.updateDynamic("disambiguation")(disambiguation.asInstanceOf[js.Any])
    if (human_agent_assist != null) __obj.updateDynamic("human_agent_assist")(human_agent_assist.asInstanceOf[js.Any])
    if (tooling != null) __obj.updateDynamic("tooling")(tooling.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceSystemSettings]
  }
}

