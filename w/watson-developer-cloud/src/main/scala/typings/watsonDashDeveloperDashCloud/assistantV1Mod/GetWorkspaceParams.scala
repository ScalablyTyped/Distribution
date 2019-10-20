package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import typings.watsonDashDeveloperDashCloud.assistantV1Mod.GetWorkspaceConstants.Sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `getWorkspace` operation. */
trait GetWorkspaceParams extends js.Object {
  /** Whether to include all element content in the returned data. If **export**=`false`, the returned data includes only information about the element itself. If **export**=`true`, all content, including subelements, is included. */
  var _export: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** Whether to include the audit properties (`created` and `updated` timestamps) in the response. */
  var include_audit: js.UndefOr[Boolean] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** Indicates how the returned workspace data will be sorted. This parameter is valid only if **export**=`true`. Specify `sort=stable` to sort all workspace objects by unique identifier, in ascending alphabetical order. */
  var sort: js.UndefOr[Sort | String] = js.undefined
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object GetWorkspaceParams {
  @scala.inline
  def apply(
    workspace_id: String,
    _export: js.UndefOr[Boolean] = js.undefined,
    headers: js.Object = null,
    include_audit: js.UndefOr[Boolean] = js.undefined,
    return_response: js.UndefOr[Boolean] = js.undefined,
    sort: Sort | String = null
  ): GetWorkspaceParams = {
    val __obj = js.Dynamic.literal(workspace_id = workspace_id)
    if (!js.isUndefined(_export)) __obj.updateDynamic("_export")(_export)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(include_audit)) __obj.updateDynamic("include_audit")(include_audit)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkspaceParams]
  }
}

