package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The response sent by the workspace, including the output text, detected intents and entities, and context. */
trait MessageResponse extends js.Object {
  /** An array of objects describing any actions requested by the dialog node. */
  var actions: js.UndefOr[js.Array[DialogNodeAction]] = js.undefined
  /** Whether to return more than one intent. A value of `true` indicates that all matching intents are returned. */
  var alternate_intents: js.UndefOr[Boolean] = js.undefined
  /** State information for the conversation. To maintain state, include the context from the previous response. */
  var context: Context
  /** An array of entities identified in the user input. */
  var entities: js.Array[RuntimeEntity]
  /** An input object that includes the input text. */
  var input: MessageInput
  /** An array of intents recognized in the user input, sorted in descending order of confidence. */
  var intents: js.Array[RuntimeIntent]
  /** An output object that includes the response to the user, the dialog nodes that were triggered, and messages from the log. */
  var output: OutputData
}

object MessageResponse {
  @scala.inline
  def apply(
    context: Context,
    entities: js.Array[RuntimeEntity],
    input: MessageInput,
    intents: js.Array[RuntimeIntent],
    output: OutputData,
    actions: js.Array[DialogNodeAction] = null,
    alternate_intents: js.UndefOr[Boolean] = js.undefined
  ): MessageResponse = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], intents = intents.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(alternate_intents)) __obj.updateDynamic("alternate_intents")(alternate_intents.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageResponse]
  }
}

