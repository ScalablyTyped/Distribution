package typings.watsonDeveloperCloud.mod

import typings.watsonDeveloperCloud.mod.ListWorkspacesConstants.Sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `listWorkspaces` operation. */
@js.native
trait ListWorkspacesParams extends js.Object {
  /** A token identifying the page of results to retrieve. */
  var cursor: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** Whether to include the audit properties (`created` and `updated` timestamps) in the response. */
  var include_audit: js.UndefOr[Boolean] = js.native
  /** Whether to include information about the number of records returned. */
  var include_count: js.UndefOr[Boolean] = js.native
  /** The number of records to return in each page of results. */
  var page_limit: js.UndefOr[Double] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** The attribute by which returned workspaces will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  var sort: js.UndefOr[Sort | String] = js.native
}

object ListWorkspacesParams {
  @scala.inline
  def apply(): ListWorkspacesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkspacesParams]
  }
  @scala.inline
  implicit class ListWorkspacesParamsOps[Self <: ListWorkspacesParams] (val x: Self) extends AnyVal {
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
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setInclude_audit(value: Boolean): Self = this.set("include_audit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_audit: Self = this.set("include_audit", js.undefined)
    @scala.inline
    def setInclude_count(value: Boolean): Self = this.set("include_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_count: Self = this.set("include_count", js.undefined)
    @scala.inline
    def setPage_limit(value: Double): Self = this.set("page_limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage_limit: Self = this.set("page_limit", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
    @scala.inline
    def setSort(value: Sort | String): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

