package typings.watsonDeveloperCloud.mod

import typings.watsonDeveloperCloud.mod.ListWorkspacesConstants.Sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listWorkspaces` operation. */
trait ListWorkspacesParams extends js.Object {
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
  /** The attribute by which returned workspaces will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  var sort: js.UndefOr[Sort | String] = js.undefined
}

object ListWorkspacesParams {
  @scala.inline
  def apply(
    cursor: String = null,
    headers: js.Object = null,
    include_audit: js.UndefOr[Boolean] = js.undefined,
    include_count: js.UndefOr[Boolean] = js.undefined,
    page_limit: Int | Double = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    sort: Sort | String = null
  ): ListWorkspacesParams = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(include_audit)) __obj.updateDynamic("include_audit")(include_audit.asInstanceOf[js.Any])
    if (!js.isUndefined(include_count)) __obj.updateDynamic("include_count")(include_count.asInstanceOf[js.Any])
    if (page_limit != null) __obj.updateDynamic("page_limit")(page_limit.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkspacesParams]
  }
}

