package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `deleteDialogNode` operation. */
trait DeleteDialogNodeParams extends js.Object {
  /** The dialog node ID (for example, `get_order`). */
  var dialog_node: String
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object DeleteDialogNodeParams {
  @scala.inline
  def apply(
    dialog_node: String,
    workspace_id: String,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): DeleteDialogNodeParams = {
    val __obj = js.Dynamic.literal(dialog_node = dialog_node, workspace_id = workspace_id)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[DeleteDialogNodeParams]
  }
}

