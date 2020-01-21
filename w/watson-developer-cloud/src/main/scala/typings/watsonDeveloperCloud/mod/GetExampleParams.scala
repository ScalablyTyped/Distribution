package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `getExample` operation. */
trait GetExampleParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  /** Whether to include the audit properties (`created` and `updated` timestamps) in the response. */
  var include_audit: js.UndefOr[Boolean] = js.undefined
  /** The intent name. */
  var intent: String
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The text of the user input example. */
  var text: String
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object GetExampleParams {
  @scala.inline
  def apply(
    intent: String,
    text: String,
    workspace_id: String,
    headers: js.Object = null,
    include_audit: js.UndefOr[Boolean] = js.undefined,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): GetExampleParams = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(include_audit)) __obj.updateDynamic("include_audit")(include_audit.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExampleParams]
  }
}

