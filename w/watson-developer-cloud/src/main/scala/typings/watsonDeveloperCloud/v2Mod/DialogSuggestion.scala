package typings.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DialogSuggestion. */
trait DialogSuggestion extends js.Object {
  /** The user-facing label for the disambiguation option. This label is taken from the **user_label** property of the corresponding dialog node. */
  var label: String
  /** The dialog output that will be returned from the Watson Assistant service if the user selects the corresponding option. */
  var output: js.UndefOr[js.Object] = js.undefined
  /** An object defining the message input to be sent to the assistant if the user selects the corresponding disambiguation option. */
  var value: DialogSuggestionValue
}

object DialogSuggestion {
  @scala.inline
  def apply(label: String, value: DialogSuggestionValue, output: js.Object = null): DialogSuggestion = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSuggestion]
  }
}

