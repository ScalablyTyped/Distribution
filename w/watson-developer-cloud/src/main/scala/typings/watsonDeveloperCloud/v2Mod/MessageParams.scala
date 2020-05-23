package typings.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `message` operation. */
trait MessageParams extends js.Object {
  /** Unique identifier of the assistant. You can find the assistant ID of an assistant on the **Assistants** tab of the Watson Assistant tool. For information about creating assistants, see the [documentation](https://console.bluemix.net/docs/services/assistant/assistant-add.html#assistant-add-task). **Note:** Currently, the v2 API does not support creating assistants. */
  var assistant_id: String
  /** State information for the conversation. The context is stored by the assistant on a per-session basis. You can use this property to set or modify context variables, which can also be accessed by dialog nodes. */
  var context: js.UndefOr[MessageContext] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** An input object that includes the input text. */
  var input: js.UndefOr[MessageInput] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** Unique identifier of the session. */
  var session_id: String
}

object MessageParams {
  @scala.inline
  def apply(
    assistant_id: String,
    session_id: String,
    context: MessageContext = null,
    headers: js.Object = null,
    input: MessageInput = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): MessageParams = {
    val __obj = js.Dynamic.literal(assistant_id = assistant_id.asInstanceOf[js.Any], session_id = session_id.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageParams]
  }
}

