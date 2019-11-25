package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DialogRuntimeResponseGeneric. */
trait DialogRuntimeResponseGeneric extends js.Object {
  /** The description to show with the the response. */
  var description: js.UndefOr[String] = js.undefined
  /** The ID of the dialog node that the **topic** property is taken from. The **topic** property is populated using the value of the dialog node's **user_label** property. */
  var dialog_node: js.UndefOr[String] = js.undefined
  /** A message to be sent to the human agent who will be taking over the conversation. */
  var message_to_human_agent: js.UndefOr[String] = js.undefined
  /** An array of objects describing the options from which the user can choose. */
  var options: js.UndefOr[js.Array[DialogNodeOutputOptionsElement]] = js.undefined
  /** The preferred type of control to display. */
  var preference: js.UndefOr[String] = js.undefined
  /** The type of response returned by the dialog node. The specified response type must be supported by the client application or channel. **Note:** The **suggestion** response type is part of the disambiguation feature, which is only available for Premium users. */
  var response_type: String
  /** The URL of the image. */
  var source: js.UndefOr[String] = js.undefined
  /** An array of objects describing the possible matching dialog nodes from which the user can choose. **Note:** The **suggestions** property is part of the disambiguation feature, which is only available for Premium users. */
  var suggestions: js.UndefOr[js.Array[DialogSuggestion]] = js.undefined
  /** The text of the response. */
  var text: js.UndefOr[String] = js.undefined
  /** How long to pause, in milliseconds. */
  var time: js.UndefOr[Double] = js.undefined
  /** The title or introductory text to show before the response. */
  var title: js.UndefOr[String] = js.undefined
  /** A label identifying the topic of the conversation, derived from the **user_label** property of the relevant node. */
  var topic: js.UndefOr[String] = js.undefined
  /** Whether to send a "user is typing" event during the pause. */
  var typing: js.UndefOr[Boolean] = js.undefined
}

object DialogRuntimeResponseGeneric {
  @scala.inline
  def apply(
    response_type: String,
    description: String = null,
    dialog_node: String = null,
    message_to_human_agent: String = null,
    options: js.Array[DialogNodeOutputOptionsElement] = null,
    preference: String = null,
    source: String = null,
    suggestions: js.Array[DialogSuggestion] = null,
    text: String = null,
    time: Int | Double = null,
    title: String = null,
    topic: String = null,
    typing: js.UndefOr[Boolean] = js.undefined
  ): DialogRuntimeResponseGeneric = {
    val __obj = js.Dynamic.literal(response_type = response_type.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dialog_node != null) __obj.updateDynamic("dialog_node")(dialog_node.asInstanceOf[js.Any])
    if (message_to_human_agent != null) __obj.updateDynamic("message_to_human_agent")(message_to_human_agent.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (preference != null) __obj.updateDynamic("preference")(preference.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    if (!js.isUndefined(typing)) __obj.updateDynamic("typing")(typing.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogRuntimeResponseGeneric]
  }
}

