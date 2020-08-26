package typings.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An input object that includes the input text. */
@js.native
trait MessageInput extends js.Object {
  /** Entities to use when evaluating the message. Include entities from the previous response to continue using those entities rather than detecting entities in the new input. */
  var entities: js.UndefOr[js.Array[RuntimeEntity]] = js.native
  /** Intents to use when evaluating the user input. Include intents from the previous response to continue using those intents rather than trying to recognize intents in the new input. */
  var intents: js.UndefOr[js.Array[RuntimeIntent]] = js.native
  /** The type of user input. Currently, only text input is supported. */
  var message_type: js.UndefOr[String] = js.native
  /** Optional properties that control how the assistant responds. */
  var options: js.UndefOr[MessageInputOptions] = js.native
  /** For internal use only. */
  var suggestion_id: js.UndefOr[String] = js.native
  /** The text of the user input. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 2048 characters. */
  var text: js.UndefOr[String] = js.native
}

object MessageInput {
  @scala.inline
  def apply(): MessageInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageInput]
  }
  @scala.inline
  implicit class MessageInputOps[Self <: MessageInput] (val x: Self) extends AnyVal {
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
    def setEntitiesVarargs(value: RuntimeEntity*): Self = this.set("entities", js.Array(value :_*))
    @scala.inline
    def setEntities(value: js.Array[RuntimeEntity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    @scala.inline
    def setIntentsVarargs(value: RuntimeIntent*): Self = this.set("intents", js.Array(value :_*))
    @scala.inline
    def setIntents(value: js.Array[RuntimeIntent]): Self = this.set("intents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntents: Self = this.set("intents", js.undefined)
    @scala.inline
    def setMessage_type(value: String): Self = this.set("message_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage_type: Self = this.set("message_type", js.undefined)
    @scala.inline
    def setOptions(value: MessageInputOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setSuggestion_id(value: String): Self = this.set("suggestion_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestion_id: Self = this.set("suggestion_id", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

