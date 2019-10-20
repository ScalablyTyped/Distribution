package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createCounterexample` operation. */
trait CreateCounterexampleParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The text of a user input marked as irrelevant input. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters - It cannot consist of only whitespace characters - It must be no longer than 1024 characters. */
  var text: String
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object CreateCounterexampleParams {
  @scala.inline
  def apply(
    text: String,
    workspace_id: String,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): CreateCounterexampleParams = {
    val __obj = js.Dynamic.literal(text = text, workspace_id = workspace_id)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[CreateCounterexampleParams]
  }
}

