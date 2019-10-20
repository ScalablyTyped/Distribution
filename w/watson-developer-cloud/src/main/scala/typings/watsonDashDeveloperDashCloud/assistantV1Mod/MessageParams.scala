package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * request interfaces
  ************************/
/** Parameters for the `message` operation. */
trait MessageParams extends js.Object {
  /** Whether to return more than one intent. A value of `true` indicates that all matching intents are returned. */
  var alternate_intents: js.UndefOr[Boolean] = js.undefined
  /** State information for the conversation. To maintain state, include the context from the previous response. */
  var context: js.UndefOr[Context] = js.undefined
  /** Entities to use when evaluating the message. Include entities from the previous response to continue using those entities rather than detecting entities in the new input. */
  var entities: js.UndefOr[js.Array[RuntimeEntity]] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** An input object that includes the input text. */
  var input: js.UndefOr[MessageInput] = js.undefined
  /** Intents to use when evaluating the user input. Include intents from the previous response to continue using those intents rather than trying to recognize intents in the new input. */
  var intents: js.UndefOr[js.Array[RuntimeIntent]] = js.undefined
  /** Whether to include additional diagnostic information about the dialog nodes that were visited during processing of the message. */
  var nodes_visited_details: js.UndefOr[Boolean] = js.undefined
  /** An output object that includes the response to the user, the dialog nodes that were triggered, and messages from the log. */
  var output: js.UndefOr[OutputData] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** Unique identifier of the workspace. */
  var workspace_id: String
}

object MessageParams {
  @scala.inline
  def apply(
    workspace_id: String,
    alternate_intents: js.UndefOr[Boolean] = js.undefined,
    context: Context = null,
    entities: js.Array[RuntimeEntity] = null,
    headers: js.Object = null,
    input: MessageInput = null,
    intents: js.Array[RuntimeIntent] = null,
    nodes_visited_details: js.UndefOr[Boolean] = js.undefined,
    output: OutputData = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): MessageParams = {
    val __obj = js.Dynamic.literal(workspace_id = workspace_id)
    if (!js.isUndefined(alternate_intents)) __obj.updateDynamic("alternate_intents")(alternate_intents)
    if (context != null) __obj.updateDynamic("context")(context)
    if (entities != null) __obj.updateDynamic("entities")(entities)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (input != null) __obj.updateDynamic("input")(input)
    if (intents != null) __obj.updateDynamic("intents")(intents)
    if (!js.isUndefined(nodes_visited_details)) __obj.updateDynamic("nodes_visited_details")(nodes_visited_details)
    if (output != null) __obj.updateDynamic("output")(output)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[MessageParams]
  }
}

