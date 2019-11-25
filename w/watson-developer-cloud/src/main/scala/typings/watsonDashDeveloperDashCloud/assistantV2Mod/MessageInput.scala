package typings.watsonDashDeveloperDashCloud.assistantV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An input object that includes the input text. */
trait MessageInput extends js.Object {
  /** Entities to use when evaluating the message. Include entities from the previous response to continue using those entities rather than detecting entities in the new input. */
  var entities: js.UndefOr[js.Array[RuntimeEntity]] = js.undefined
  /** Intents to use when evaluating the user input. Include intents from the previous response to continue using those intents rather than trying to recognize intents in the new input. */
  var intents: js.UndefOr[js.Array[RuntimeIntent]] = js.undefined
  /** The type of user input. Currently, only text input is supported. */
  var message_type: js.UndefOr[String] = js.undefined
  /** Optional properties that control how the assistant responds. */
  var options: js.UndefOr[MessageInputOptions] = js.undefined
  /** For internal use only. */
  var suggestion_id: js.UndefOr[String] = js.undefined
  /** The text of the user input. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 2048 characters. */
  var text: js.UndefOr[String] = js.undefined
}

object MessageInput {
  @scala.inline
  def apply(
    entities: js.Array[RuntimeEntity] = null,
    intents: js.Array[RuntimeIntent] = null,
    message_type: String = null,
    options: MessageInputOptions = null,
    suggestion_id: String = null,
    text: String = null
  ): MessageInput = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    if (message_type != null) __obj.updateDynamic("message_type")(message_type.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (suggestion_id != null) __obj.updateDynamic("suggestion_id")(suggestion_id.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageInput]
  }
}

