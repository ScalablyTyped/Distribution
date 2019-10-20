package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `deleteExample` operation. */
trait DeleteExampleParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The intent name. */
  var intent: String
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** The text of the user input example. */
  var text: String
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object DeleteExampleParams {
  @scala.inline
  def apply(
    intent: String,
    text: String,
    workspace_id: String,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): DeleteExampleParams = {
    val __obj = js.Dynamic.literal(intent = intent, text = text, workspace_id = workspace_id)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[DeleteExampleParams]
  }
}

