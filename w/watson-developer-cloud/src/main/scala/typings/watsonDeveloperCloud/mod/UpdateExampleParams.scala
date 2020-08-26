package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateExample` operation. */
@js.native
trait UpdateExampleParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.native
  /** The intent name. */
  var intent: String = js.native
  /** An array of contextual entity mentions. */
  var new_mentions: js.UndefOr[js.Array[Mention]] = js.native
  /** The text of the user input example. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 1024 characters. */
  var new_text: js.UndefOr[String] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** The text of the user input example. */
  var text: String = js.native
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}

object UpdateExampleParams {
  @scala.inline
  def apply(intent: String, text: String, workspace_id: String): UpdateExampleParams = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExampleParams]
  }
  @scala.inline
  implicit class UpdateExampleParamsOps[Self <: UpdateExampleParams] (val x: Self) extends AnyVal {
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
    def setIntent(value: String): Self = this.set("intent", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkspace_id(value: String): Self = this.set("workspace_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setNew_mentionsVarargs(value: Mention*): Self = this.set("new_mentions", js.Array(value :_*))
    @scala.inline
    def setNew_mentions(value: js.Array[Mention]): Self = this.set("new_mentions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNew_mentions: Self = this.set("new_mentions", js.undefined)
    @scala.inline
    def setNew_text(value: String): Self = this.set("new_text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNew_text: Self = this.set("new_text", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
  
}

