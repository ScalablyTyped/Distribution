package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `deleteWorkspace` operation. */
trait DeleteWorkspaceParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object DeleteWorkspaceParams {
  @scala.inline
  def apply(
    workspace_id: String,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): DeleteWorkspaceParams = {
    val __obj = js.Dynamic.literal(workspace_id = workspace_id)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[DeleteWorkspaceParams]
  }
}

