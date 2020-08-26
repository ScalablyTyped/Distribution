package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The response sent by the workspace, including the output text, detected intents and entities, and context. */
@js.native
trait MessageResponse extends js.Object {
  /** An array of objects describing any actions requested by the dialog node. */
  var actions: js.UndefOr[js.Array[DialogNodeAction]] = js.native
  /** Whether to return more than one intent. A value of `true` indicates that all matching intents are returned. */
  var alternate_intents: js.UndefOr[Boolean] = js.native
  /** State information for the conversation. To maintain state, include the context from the previous response. */
  var context: Context = js.native
  /** An array of entities identified in the user input. */
  var entities: js.Array[RuntimeEntity] = js.native
  /** An input object that includes the input text. */
  var input: MessageInput = js.native
  /** An array of intents recognized in the user input, sorted in descending order of confidence. */
  var intents: js.Array[RuntimeIntent] = js.native
  /** An output object that includes the response to the user, the dialog nodes that were triggered, and messages from the log. */
  var output: OutputData = js.native
}

object MessageResponse {
  @scala.inline
  def apply(
    context: Context,
    entities: js.Array[RuntimeEntity],
    input: MessageInput,
    intents: js.Array[RuntimeIntent],
    output: OutputData
  ): MessageResponse = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], intents = intents.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageResponse]
  }
  @scala.inline
  implicit class MessageResponseOps[Self <: MessageResponse] (val x: Self) extends AnyVal {
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
    def setContext(value: Context): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntitiesVarargs(value: RuntimeEntity*): Self = this.set("entities", js.Array(value :_*))
    @scala.inline
    def setEntities(value: js.Array[RuntimeEntity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: MessageInput): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntentsVarargs(value: RuntimeIntent*): Self = this.set("intents", js.Array(value :_*))
    @scala.inline
    def setIntents(value: js.Array[RuntimeIntent]): Self = this.set("intents", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput(value: OutputData): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionsVarargs(value: DialogNodeAction*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[DialogNodeAction]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setAlternate_intents(value: Boolean): Self = this.set("alternate_intents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternate_intents: Self = this.set("alternate_intents", js.undefined)
  }
  
}

