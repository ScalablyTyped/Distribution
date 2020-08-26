package typings.watsonDeveloperCloud.mod

import typings.watsonDeveloperCloud.mod.GetWorkspaceConstants.Sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `getWorkspace` operation. */
@js.native
trait GetWorkspaceParams extends js.Object {
  /** Whether to include all element content in the returned data. If **export**=`false`, the returned data includes only information about the element itself. If **export**=`true`, all content, including subelements, is included. */
  var _export: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** Whether to include the audit properties (`created` and `updated` timestamps) in the response. */
  var include_audit: js.UndefOr[Boolean] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** Indicates how the returned workspace data will be sorted. This parameter is valid only if **export**=`true`. Specify `sort=stable` to sort all workspace objects by unique identifier, in ascending alphabetical order. */
  var sort: js.UndefOr[Sort | String] = js.native
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}

object GetWorkspaceParams {
  @scala.inline
  def apply(workspace_id: String): GetWorkspaceParams = {
    val __obj = js.Dynamic.literal(workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkspaceParams]
  }
  @scala.inline
  implicit class GetWorkspaceParamsOps[Self <: GetWorkspaceParams] (val x: Self) extends AnyVal {
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
    def setWorkspace_id(value: String): Self = this.set("workspace_id", value.asInstanceOf[js.Any])
    @scala.inline
    def set_export(value: Boolean): Self = this.set("_export", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_export: Self = this.set("_export", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setInclude_audit(value: Boolean): Self = this.set("include_audit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_audit: Self = this.set("include_audit", js.undefined)
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

