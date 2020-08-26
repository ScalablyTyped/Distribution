package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listAllLogs` operation. */
@js.native
trait ListAllLogsParams extends js.Object {
  /** A token identifying the page of results to retrieve. */
  var cursor: js.UndefOr[String] = js.native
  /** A cacheable parameter that limits the results to those matching the specified filter. You must specify a filter query that includes a value for `language`, as well as a value for `workspace_id` or `request.context.metadata.deployment`. For more information, see the [documentation](https://cloud.ibm.com/docs/services/assistant/filter-reference.html#filter-reference-syntax). */
  var filter: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** The number of records to return in each page of results. */
  var page_limit: js.UndefOr[Double] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** How to sort the returned log events. You can sort by **request_timestamp**. To reverse the sort order, prefix the parameter value with a minus sign (`-`). */
  var sort: js.UndefOr[String] = js.native
}

object ListAllLogsParams {
  @scala.inline
  def apply(filter: String): ListAllLogsParams = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAllLogsParams]
  }
  @scala.inline
  implicit class ListAllLogsParamsOps[Self <: ListAllLogsParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setPage_limit(value: Double): Self = this.set("page_limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage_limit: Self = this.set("page_limit", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
    @scala.inline
    def setSort(value: String): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

