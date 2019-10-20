package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `getSynonym` operation. */
trait GetSynonymParams extends js.Object {
  /** The name of the entity. */
  var entity: String
  var headers: js.UndefOr[js.Object] = js.undefined
  /** Whether to include the audit properties (`created` and `updated` timestamps) in the response. */
  var include_audit: js.UndefOr[Boolean] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The text of the synonym. */
  var synonym: String
  /** The text of the entity value. */
  var value: String
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object GetSynonymParams {
  @scala.inline
  def apply(
    entity: String,
    synonym: String,
    value: String,
    workspace_id: String,
    headers: js.Object = null,
    include_audit: js.UndefOr[Boolean] = js.undefined,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): GetSynonymParams = {
    val __obj = js.Dynamic.literal(entity = entity, synonym = synonym, value = value, workspace_id = workspace_id)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(include_audit)) __obj.updateDynamic("include_audit")(include_audit)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[GetSynonymParams]
  }
}

