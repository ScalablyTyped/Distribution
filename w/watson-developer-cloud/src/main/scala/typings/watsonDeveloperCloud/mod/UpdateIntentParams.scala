package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateIntent` operation. */
trait UpdateIntentParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The intent name. */
  var intent: String
  /** The description of the intent. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var new_description: js.UndefOr[String] = js.undefined
  /** An array of user input examples for the intent. */
  var new_examples: js.UndefOr[js.Array[Example]] = js.undefined
  /** The name of the intent. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, underscore, hyphen, and dot characters. - It cannot begin with the reserved prefix `sys-`. - It must be no longer than 128 characters. */
  var new_intent: js.UndefOr[String] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object UpdateIntentParams {
  @scala.inline
  def apply(
    intent: String,
    workspace_id: String,
    headers: js.Object = null,
    new_description: String = null,
    new_examples: js.Array[Example] = null,
    new_intent: String = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): UpdateIntentParams = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (new_description != null) __obj.updateDynamic("new_description")(new_description.asInstanceOf[js.Any])
    if (new_examples != null) __obj.updateDynamic("new_examples")(new_examples.asInstanceOf[js.Any])
    if (new_intent != null) __obj.updateDynamic("new_intent")(new_intent.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIntentParams]
  }
}

