package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DialogNodeOutputGeneric. */
trait DialogNodeOutputGeneric extends js.Object {
  /** The delimiter to use as a separator between responses when `selection_policy`=`multiline`. */
  var delimiter: js.UndefOr[String] = js.undefined
  /** An optional description to show with the response. Valid only when **response_type**=`image` or `option`. This string must be no longer than 256 characters. */
  var description: js.UndefOr[String] = js.undefined
  /** An optional message to be sent to the human agent who will be taking over the conversation. Valid only when **reponse_type**=`connect_to_agent`. This string must be no longer than 256 characters. */
  var message_to_human_agent: js.UndefOr[String] = js.undefined
  /** An array of objects describing the options from which the user can choose. You can include up to 20 options. Required when **response_type**=`option`. */
  var options: js.UndefOr[js.Array[DialogNodeOutputOptionsElement]] = js.undefined
  /** The preferred type of control to display, if supported by the channel. Valid only when **response_type**=`option`. */
  var preference: js.UndefOr[String] = js.undefined
  /** The type of response returned by the dialog node. The specified response type must be supported by the client application or channel. */
  var response_type: String
  /** How a response is selected from the list, if more than one response is specified. Valid only when **response_type**=`text`. */
  var selection_policy: js.UndefOr[String] = js.undefined
  /** The URL of the image. Required when **response_type**=`image`. */
  var source: js.UndefOr[String] = js.undefined
  /** How long to pause, in milliseconds. The valid values are from 0 to 10000. Valid only when **response_type**=`pause`. */
  var time: js.UndefOr[Double] = js.undefined
  /** An optional title to show before the response. Valid only when **response_type**=`image` or `option`. This string must be no longer than 512 characters. */
  var title: js.UndefOr[String] = js.undefined
  /** Whether to send a "user is typing" event during the pause. Ignored if the channel does not support this event. Valid only when **response_type**=`pause`. */
  var typing: js.UndefOr[Boolean] = js.undefined
  /** A list of one or more objects defining text responses. Required when **response_type**=`text`. */
  var values: js.UndefOr[js.Array[DialogNodeOutputTextValuesElement]] = js.undefined
}

object DialogNodeOutputGeneric {
  @scala.inline
  def apply(
    response_type: String,
    delimiter: String = null,
    description: String = null,
    message_to_human_agent: String = null,
    options: js.Array[DialogNodeOutputOptionsElement] = null,
    preference: String = null,
    selection_policy: String = null,
    source: String = null,
    time: Int | Double = null,
    title: String = null,
    typing: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[DialogNodeOutputTextValuesElement] = null
  ): DialogNodeOutputGeneric = {
    val __obj = js.Dynamic.literal(response_type = response_type.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (message_to_human_agent != null) __obj.updateDynamic("message_to_human_agent")(message_to_human_agent.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (preference != null) __obj.updateDynamic("preference")(preference.asInstanceOf[js.Any])
    if (selection_policy != null) __obj.updateDynamic("selection_policy")(selection_policy.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(typing)) __obj.updateDynamic("typing")(typing.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodeOutputGeneric]
  }
}

