package typings.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A response from the Watson Assistant service. */
trait MessageResponse extends js.Object {
  /** State information for the conversation. The context is stored by the assistant on a per-session basis. You can use this property to access context variables. **Note:** The context is included in message responses only if **return_context**=`true` in the message request. */
  var context: js.UndefOr[MessageContext] = js.undefined
  /** Assistant output to be rendered or processed by the client. */
  var output: MessageOutput
}

object MessageResponse {
  @scala.inline
  def apply(output: MessageOutput, context: MessageContext = null): MessageResponse = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageResponse]
  }
}

