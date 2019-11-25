package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listAllLogs` operation. */
trait ListAllLogsParams extends js.Object {
  /** A token identifying the page of results to retrieve. */
  var cursor: js.UndefOr[String] = js.undefined
  /** A cacheable parameter that limits the results to those matching the specified filter. You must specify a filter query that includes a value for `language`, as well as a value for `workspace_id` or `request.context.metadata.deployment`. For more information, see the [documentation](https://cloud.ibm.com/docs/services/assistant/filter-reference.html#filter-reference-syntax). */
  var filter: String
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The number of records to return in each page of results. */
  var page_limit: js.UndefOr[Double] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** How to sort the returned log events. You can sort by **request_timestamp**. To reverse the sort order, prefix the parameter value with a minus sign (`-`). */
  var sort: js.UndefOr[String] = js.undefined
}

object ListAllLogsParams {
  @scala.inline
  def apply(
    filter: String,
    cursor: String = null,
    headers: js.Object = null,
    page_limit: Int | Double = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    sort: String = null
  ): ListAllLogsParams = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (page_limit != null) __obj.updateDynamic("page_limit")(page_limit.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAllLogsParams]
  }
}

