package typings.watsonDeveloperCloud.mod

import typings.watsonDeveloperCloud.mod.ListCounterexamplesConstants.Sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listCounterexamples` operation. */
trait ListCounterexamplesParams extends js.Object {
  /** A token identifying the page of results to retrieve. */
  var cursor: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** Whether to include the audit properties (`created` and `updated` timestamps) in the response. */
  var include_audit: js.UndefOr[Boolean] = js.undefined
  /** Whether to include information about the number of records returned. */
  var include_count: js.UndefOr[Boolean] = js.undefined
  /** The number of records to return in each page of results. */
  var page_limit: js.UndefOr[Double] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The attribute by which returned counterexamples will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  var sort: js.UndefOr[Sort | String] = js.undefined
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object ListCounterexamplesParams {
  @scala.inline
  def apply(
    workspace_id: String,
    cursor: String = null,
    headers: js.Object = null,
    include_audit: js.UndefOr[Boolean] = js.undefined,
    include_count: js.UndefOr[Boolean] = js.undefined,
    page_limit: js.UndefOr[Double] = js.undefined,
    return_response: js.UndefOr[Boolean] = js.undefined,
    sort: Sort | String = null
  ): ListCounterexamplesParams = {
    val __obj = js.Dynamic.literal(workspace_id = workspace_id.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(include_audit)) __obj.updateDynamic("include_audit")(include_audit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(include_count)) __obj.updateDynamic("include_count")(include_count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page_limit)) __obj.updateDynamic("page_limit")(page_limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCounterexamplesParams]
  }
}

