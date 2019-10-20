package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `getCounterexample` operation. */
trait GetCounterexampleParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  /** Whether to include the audit properties (`created` and `updated` timestamps) in the response. */
  var include_audit: js.UndefOr[Boolean] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The text of a user input counterexample (for example, `What are you wearing?`). */
  var text: String
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object GetCounterexampleParams {
  @scala.inline
  def apply(
    text: String,
    workspace_id: String,
    headers: js.Object = null,
    include_audit: js.UndefOr[Boolean] = js.undefined,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): GetCounterexampleParams = {
    val __obj = js.Dynamic.literal(text = text, workspace_id = workspace_id)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(include_audit)) __obj.updateDynamic("include_audit")(include_audit)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[GetCounterexampleParams]
  }
}

