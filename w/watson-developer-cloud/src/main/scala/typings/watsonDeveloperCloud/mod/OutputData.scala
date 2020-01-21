package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An output object that includes the response to the user, the dialog nodes that were triggered, and messages from the log. */
trait OutputData
  extends /** OutputData accepts additional properties. */
/* propName */ StringDictionary[js.Any] {
  /** Output intended for any channel. It is the responsibility of the client application to implement the supported response types. */
  var generic: js.UndefOr[js.Array[DialogRuntimeResponseGeneric]] = js.undefined
  /** An array of up to 50 messages logged with the request. */
  var log_messages: js.Array[LogMessage]
  /** An array of the nodes that were triggered to create the response, in the order in which they were visited. This information is useful for debugging and for tracing the path taken through the node tree. */
  var nodes_visited: js.UndefOr[js.Array[String]] = js.undefined
  /** An array of objects containing detailed diagnostic information about the nodes that were triggered during processing of the input message. Included only if **nodes_visited_details** is set to `true` in the message request. */
  var nodes_visited_details: js.UndefOr[js.Array[DialogNodeVisitedDetails]] = js.undefined
  /** An array of responses to the user. */
  var text: js.Array[String]
}

object OutputData {
  @scala.inline
  def apply(
    log_messages: js.Array[LogMessage],
    text: js.Array[String],
    StringDictionary: /** OutputData accepts additional properties. */
  /* propName */ StringDictionary[js.Any] = null,
    generic: js.Array[DialogRuntimeResponseGeneric] = null,
    nodes_visited: js.Array[String] = null,
    nodes_visited_details: js.Array[DialogNodeVisitedDetails] = null
  ): OutputData = {
    val __obj = js.Dynamic.literal(log_messages = log_messages.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (generic != null) __obj.updateDynamic("generic")(generic.asInstanceOf[js.Any])
    if (nodes_visited != null) __obj.updateDynamic("nodes_visited")(nodes_visited.asInstanceOf[js.Any])
    if (nodes_visited_details != null) __obj.updateDynamic("nodes_visited_details")(nodes_visited_details.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputData]
  }
}

