package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `getIntent` operation. */
trait GetIntentParams extends js.Object {
  /** Whether to include all element content in the returned data. If **export**=`false`, the returned data includes only information about the element itself. If **export**=`true`, all content, including subelements, is included. */
  var _export: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** Whether to include the audit properties (`created` and `updated` timestamps) in the response. */
  var include_audit: js.UndefOr[Boolean] = js.undefined
  /** The intent name. */
  var intent: String
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object GetIntentParams {
  @scala.inline
  def apply(
    intent: String,
    workspace_id: String,
    _export: js.UndefOr[Boolean] = js.undefined,
    headers: js.Object = null,
    include_audit: js.UndefOr[Boolean] = js.undefined,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): GetIntentParams = {
    val __obj = js.Dynamic.literal(intent = intent, workspace_id = workspace_id)
    if (!js.isUndefined(_export)) __obj.updateDynamic("_export")(_export)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(include_audit)) __obj.updateDynamic("include_audit")(include_audit)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[GetIntentParams]
  }
}

