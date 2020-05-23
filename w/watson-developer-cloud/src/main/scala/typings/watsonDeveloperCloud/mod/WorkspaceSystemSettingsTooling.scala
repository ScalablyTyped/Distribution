package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Workspace settings related to the Watson Assistant tool. */
trait WorkspaceSystemSettingsTooling extends js.Object {
  /** Whether the dialog JSON editor displays text responses within the `output.generic` object. */
  var store_generic_responses: js.UndefOr[Boolean] = js.undefined
}

object WorkspaceSystemSettingsTooling {
  @scala.inline
  def apply(store_generic_responses: js.UndefOr[Boolean] = js.undefined): WorkspaceSystemSettingsTooling = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(store_generic_responses)) __obj.updateDynamic("store_generic_responses")(store_generic_responses.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceSystemSettingsTooling]
  }
}

