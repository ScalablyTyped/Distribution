package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object defining the message input, intents, and entities to be sent to the Watson Assistant service if the user selects the corresponding disambiguation option. */
trait DialogSuggestionValue extends js.Object {
  /** An array of entities to be sent along with the user input. */
  var entities: js.UndefOr[js.Array[RuntimeEntity]] = js.undefined
  /** An input object that includes the input text. */
  var input: js.UndefOr[MessageInput] = js.undefined
  /** An array of intents to be sent along with the user input. */
  var intents: js.UndefOr[js.Array[RuntimeIntent]] = js.undefined
}

object DialogSuggestionValue {
  @scala.inline
  def apply(
    entities: js.Array[RuntimeEntity] = null,
    input: MessageInput = null,
    intents: js.Array[RuntimeIntent] = null
  ): DialogSuggestionValue = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSuggestionValue]
  }
}

