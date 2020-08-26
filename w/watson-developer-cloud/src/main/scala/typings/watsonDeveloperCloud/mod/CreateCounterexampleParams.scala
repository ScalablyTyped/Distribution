package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createCounterexample` operation. */
@js.native
trait CreateCounterexampleParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** The text of a user input marked as irrelevant input. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters - It cannot consist of only whitespace characters - It must be no longer than 1024 characters. */
  var text: String = js.native
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}

object CreateCounterexampleParams {
  @scala.inline
  def apply(text: String, workspace_id: String): CreateCounterexampleParams = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCounterexampleParams]
  }
  @scala.inline
  implicit class CreateCounterexampleParamsOps[Self <: CreateCounterexampleParams] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
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

