package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createIntent` operation. */
trait CreateIntentParams extends js.Object {
  /** The description of the intent. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var description: js.UndefOr[String] = js.undefined
  /** An array of user input examples for the intent. */
  var examples: js.UndefOr[js.Array[Example]] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The name of the intent. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, underscore, hyphen, and dot characters. - It cannot begin with the reserved prefix `sys-`. - It must be no longer than 128 characters. */
  var intent: String
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object CreateIntentParams {
  @scala.inline
  def apply(
    intent: String,
    workspace_id: String,
    description: String = null,
    examples: js.Array[Example] = null,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): CreateIntentParams = {
    val __obj = js.Dynamic.literal(intent = intent, workspace_id = workspace_id)
    if (description != null) __obj.updateDynamic("description")(description)
    if (examples != null) __obj.updateDynamic("examples")(examples)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[CreateIntentParams]
  }
}

