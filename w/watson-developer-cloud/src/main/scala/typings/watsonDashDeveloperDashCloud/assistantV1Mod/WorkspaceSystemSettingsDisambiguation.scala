package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Workspace settings related to the disambiguation feature. **Note:** This feature is available only to Premium users. */
trait WorkspaceSystemSettingsDisambiguation extends js.Object {
  /** Whether the disambiguation feature is enabled for the workspace. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** The user-facing label for the option users can select if none of the suggested options is correct. If no value is specified for this property, this option does not appear. */
  var none_of_the_above_prompt: js.UndefOr[String] = js.undefined
  /** The text of the introductory prompt that accompanies disambiguation options presented to the user. */
  var prompt: js.UndefOr[String] = js.undefined
  /** The sensitivity of the disambiguation feature to intent detection conflicts. Set to **high** if you want the disambiguation feature to be triggered more often. This can be useful for testing or demonstration purposes. */
  var sensitivity: js.UndefOr[String] = js.undefined
}

object WorkspaceSystemSettingsDisambiguation {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    none_of_the_above_prompt: String = null,
    prompt: String = null,
    sensitivity: String = null
  ): WorkspaceSystemSettingsDisambiguation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (none_of_the_above_prompt != null) __obj.updateDynamic("none_of_the_above_prompt")(none_of_the_above_prompt.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (sensitivity != null) __obj.updateDynamic("sensitivity")(sensitivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceSystemSettingsDisambiguation]
  }
}

