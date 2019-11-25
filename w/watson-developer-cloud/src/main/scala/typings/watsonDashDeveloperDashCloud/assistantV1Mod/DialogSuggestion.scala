package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DialogSuggestion. */
trait DialogSuggestion extends js.Object {
  /** The ID of the dialog node that the **label** property is taken from. The **label** property is populated using the value of the dialog node's **user_label** property. */
  var dialog_node: js.UndefOr[String] = js.undefined
  /** The user-facing label for the disambiguation option. This label is taken from the **user_label** property of the corresponding dialog node. */
  var label: String
  /** The dialog output that will be returned from the Watson Assistant service if the user selects the corresponding option. */
  var output: js.UndefOr[js.Object] = js.undefined
  /** An object defining the message input, intents, and entities to be sent to the Watson Assistant service if the user selects the corresponding disambiguation option. */
  var value: DialogSuggestionValue
}

object DialogSuggestion {
  @scala.inline
  def apply(label: String, value: DialogSuggestionValue, dialog_node: String = null, output: js.Object = null): DialogSuggestion = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (dialog_node != null) __obj.updateDynamic("dialog_node")(dialog_node.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSuggestion]
  }
}

