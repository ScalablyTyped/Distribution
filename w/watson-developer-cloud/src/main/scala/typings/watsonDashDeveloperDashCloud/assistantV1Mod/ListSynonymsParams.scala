package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListSynonymsConstants.Sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listSynonyms` operation. */
trait ListSynonymsParams extends js.Object {
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
  /** The attribute by which returned entity value synonyms will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  var sort: js.UndefOr[Sort | String] = js.undefined
  /** The text of the entity value. */
  var value: String
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object ListSynonymsParams {
  @scala.inline
  def apply(
    entity: String,
    value: String,
    workspace_id: String,
    cursor: String = null,
    headers: js.Object = null,
    include_audit: js.UndefOr[Boolean] = js.undefined,
    include_count: js.UndefOr[Boolean] = js.undefined,
    page_limit: Int | Double = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    sort: Sort | String = null
  ): ListSynonymsParams = {
    val __obj = js.Dynamic.literal(entity = entity, value = value, workspace_id = workspace_id)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(include_audit)) __obj.updateDynamic("include_audit")(include_audit)
    if (!js.isUndefined(include_count)) __obj.updateDynamic("include_count")(include_count)
    if (page_limit != null) __obj.updateDynamic("page_limit")(page_limit.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSynonymsParams]
  }
}

