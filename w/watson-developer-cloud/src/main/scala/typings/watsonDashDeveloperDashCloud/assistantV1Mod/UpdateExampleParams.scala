package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateExample` operation. */
trait UpdateExampleParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The intent name. */
  var intent: String
  /** An array of contextual entity mentions. */
  var new_mentions: js.UndefOr[js.Array[Mention]] = js.undefined
  /** The text of the user input example. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 1024 characters. */
  var new_text: js.UndefOr[String] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The text of the user input example. */
  var text: String
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object UpdateExampleParams {
  @scala.inline
  def apply(
    intent: String,
    text: String,
    workspace_id: String,
    headers: js.Object = null,
    new_mentions: js.Array[Mention] = null,
    new_text: String = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): UpdateExampleParams = {
    val __obj = js.Dynamic.literal(intent = intent, text = text, workspace_id = workspace_id)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (new_mentions != null) __obj.updateDynamic("new_mentions")(new_mentions)
    if (new_text != null) __obj.updateDynamic("new_text")(new_text)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[UpdateExampleParams]
  }
}

