package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listLogs` operation. */
trait ListLogsParams extends js.Object {
  /** A token identifying the page of results to retrieve. */
  var cursor: js.UndefOr[String] = js.undefined
  /** A cacheable parameter that limits the results to those matching the specified filter. For more information, see the [documentation](https://cloud.ibm.com/docs/services/assistant/filter-reference.html#filter-reference-syntax). */
  var filter: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The number of records to return in each page of results. */
  var page_limit: js.UndefOr[Double] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** How to sort the returned log events. You can sort by **request_timestamp**. To reverse the sort order, prefix the parameter value with a minus sign (`-`). */
  var sort: js.UndefOr[String] = js.undefined
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object ListLogsParams {
  @scala.inline
  def apply(
    workspace_id: String,
    cursor: String = null,
    filter: String = null,
    headers: js.Object = null,
    page_limit: js.UndefOr[Double] = js.undefined,
    return_response: js.UndefOr[Boolean] = js.undefined,
    sort: String = null
  ): ListLogsParams = {
    val __obj = js.Dynamic.literal(workspace_id = workspace_id.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(page_limit)) __obj.updateDynamic("page_limit")(page_limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLogsParams]
  }
}

