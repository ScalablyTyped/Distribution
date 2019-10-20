package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListValuesConstants.Sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listValues` operation. */
trait ListValuesParams extends js.Object {
  /** Whether to include all element content in the returned data. If **export**=`false`, the returned data includes only information about the element itself. If **export**=`true`, all content, including subelements, is included. */
  var _export: js.UndefOr[Boolean] = js.undefined
  /** A token identifying the page of results to retrieve. */
  var cursor: js.UndefOr[String] = js.undefined
  /** The name of the entity. */
  var entity: String
  var headers: js.UndefOr[js.Object] = js.undefined
  /** Whether to include the audit properties (`created` and `updated` timestamps) in the response. */
  var include_audit: js.UndefOr[Boolean] = js.undefined
  /** Whether to include information about the number of records returned. */
  var include_count: js.UndefOr[Boolean] = js.undefined
  /** The number of records to return in each page of results. */
  var page_limit: js.UndefOr[Double] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The attribute by which returned entity values will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  var sort: js.UndefOr[Sort | String] = js.undefined
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object ListValuesParams {
  @scala.inline
  def apply(
    entity: String,
    workspace_id: String,
    _export: js.UndefOr[Boolean] = js.undefined,
    cursor: String = null,
    headers: js.Object = null,
    include_audit: js.UndefOr[Boolean] = js.undefined,
    include_count: js.UndefOr[Boolean] = js.undefined,
    page_limit: Int | Double = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    sort: Sort | String = null
  ): ListValuesParams = {
    val __obj = js.Dynamic.literal(entity = entity, workspace_id = workspace_id)
    if (!js.isUndefined(_export)) __obj.updateDynamic("_export")(_export)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(include_audit)) __obj.updateDynamic("include_audit")(include_audit)
    if (!js.isUndefined(include_count)) __obj.updateDynamic("include_count")(include_count)
    if (page_limit != null) __obj.updateDynamic("page_limit")(page_limit.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListValuesParams]
  }
}

