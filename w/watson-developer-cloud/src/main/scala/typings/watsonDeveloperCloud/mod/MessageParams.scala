package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * request interfaces
  ************************/
/** Parameters for the `message` operation. */
@js.native
trait MessageParams extends js.Object {
  /** Whether to return more than one intent. A value of `true` indicates that all matching intents are returned. */
  var alternate_intents: js.UndefOr[Boolean] = js.native
  /** State information for the conversation. To maintain state, include the context from the previous response. */
  var context: js.UndefOr[Context] = js.native
  /** Entities to use when evaluating the message. Include entities from the previous response to continue using those entities rather than detecting entities in the new input. */
  var entities: js.UndefOr[js.Array[RuntimeEntity]] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** An input object that includes the input text. */
  var input: js.UndefOr[MessageInput] = js.native
  /** Intents to use when evaluating the user input. Include intents from the previous response to continue using those intents rather than trying to recognize intents in the new input. */
  var intents: js.UndefOr[js.Array[RuntimeIntent]] = js.native
  /** Whether to include additional diagnostic information about the dialog nodes that were visited during processing of the message. */
  var nodes_visited_details: js.UndefOr[Boolean] = js.native
  /** An output object that includes the response to the user, the dialog nodes that were triggered, and messages from the log. */
  var output: js.UndefOr[OutputData] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}

object MessageParams {
  @scala.inline
  def apply(workspace_id: String): MessageParams = {
    val __obj = js.Dynamic.literal(workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageParams]
  }
  @scala.inline
  implicit class MessageParamsOps[Self <: MessageParams] (val x: Self) extends AnyVal {
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
    def setWorkspace_id(value: String): Self = this.set("workspace_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlternate_intents(value: Boolean): Self = this.set("alternate_intents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternate_intents: Self = this.set("alternate_intents", js.undefined)
    @scala.inline
    def setContext(value: Context): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setEntitiesVarargs(value: RuntimeEntity*): Self = this.set("entities", js.Array(value :_*))
    @scala.inline
    def setEntities(value: js.Array[RuntimeEntity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setInput(value: MessageInput): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setIntentsVarargs(value: RuntimeIntent*): Self = this.set("intents", js.Array(value :_*))
    @scala.inline
    def setIntents(value: js.Array[RuntimeIntent]): Self = this.set("intents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntents: Self = this.set("intents", js.undefined)
    @scala.inline
    def setNodes_visited_details(value: Boolean): Self = this.set("nodes_visited_details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodes_visited_details: Self = this.set("nodes_visited_details", js.undefined)
    @scala.inline
    def setOutput(value: OutputData): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
  
}

