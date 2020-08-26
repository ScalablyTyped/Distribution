package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `deleteWorkspace` operation. */
@js.native
trait DeleteWorkspaceParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}

object DeleteWorkspaceParams {
  @scala.inline
  def apply(workspace_id: String): DeleteWorkspaceParams = {
    val __obj = js.Dynamic.literal(workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkspaceParams]
  }
  @scala.inline
  implicit class DeleteWorkspaceParamsOps[Self <: DeleteWorkspaceParams] (val x: Self) extends AnyVal {
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
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
  
}

